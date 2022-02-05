package service;

import com.giavudangle.protobuf.CreateLaptopRequest;
import com.giavudangle.protobuf.CreateLaptopResponse;
import com.giavudangle.protobuf.Laptop;
import com.giavudangle.protobuf.LaptopServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.inprocess.InProcessChannelBuilder;
import io.grpc.inprocess.InProcessServerBuilder;
import io.grpc.testing.GrpcCleanupRule;
import org.junit.Rule;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sample.Generator;
import sample.Randomization;

import static org.junit.jupiter.api.Assertions.*;

class LaptopServerTest {
    @Rule
    public final GrpcCleanupRule grpcCleanupRule = new GrpcCleanupRule();

    private LaptopStore store;
    private LaptopServer server;
    private ManagedChannel channel;


    @BeforeEach
    void setUp() throws Exception {
        String serverName = InProcessServerBuilder.generateName();
        InProcessServerBuilder serverBuilder = InProcessServerBuilder.forName(serverName).directExecutor();

        store = new InMemoryLaptopStore();
        server = new LaptopServer(serverBuilder,0,store);
        server.start();


        channel = grpcCleanupRule.register(
                InProcessChannelBuilder
                        .forName(serverName)
                        .directExecutor()
                        .build()
        );




    }

    @AfterEach
    void tearDown() {
    }


    @Test
    public void createLaptopWithValidID() {
        Randomization randomization = new Randomization();
        Generator generator = new Generator(randomization);
        Laptop laptop = generator.NewLaptop();

        CreateLaptopRequest request = CreateLaptopRequest
                .newBuilder()
                .setLaptop(laptop)
                .build();

        LaptopServiceGrpc.LaptopServiceBlockingStub stub = LaptopServiceGrpc.newBlockingStub(channel);
        CreateLaptopResponse response = stub.createLaptop(request);
        Laptop found = store.Find(response.getId());

        // 🦅 Test cases
        assertNotNull(response);
        assertEquals(laptop.getId(),response.getId());
        assertNotNull(found);
    }

    @Test
    public void createLaptopWithEmptyID() {
        Randomization randomization = new Randomization();
        Generator generator = new Generator(randomization);
        Laptop laptop = generator.NewLaptop()
                .toBuilder()
                .setId("")
                .build();

        CreateLaptopRequest request = CreateLaptopRequest
                .newBuilder()
                .setLaptop(laptop)
                .build();

        LaptopServiceGrpc.LaptopServiceBlockingStub stub = LaptopServiceGrpc.newBlockingStub(channel);
        CreateLaptopResponse response = stub.createLaptop(request);
        Laptop found = store.Find(response.getId());

        // 🦅 Test cases
        assertNotNull(response);
        assertFalse(response.getId().isEmpty());
        assertNotNull(found);
    }

    @Test
    public void createLaptopWithInvalidID() {
        Randomization randomization = new Randomization();
        Generator generator = new Generator(randomization);
        Laptop laptop = generator.NewLaptop()
                .toBuilder()
                .setId("invalid")
                .build();

        CreateLaptopRequest request = CreateLaptopRequest
                .newBuilder()
                .setLaptop(laptop)
                .build();

        LaptopServiceGrpc.LaptopServiceBlockingStub stub = LaptopServiceGrpc.newBlockingStub(channel);
        CreateLaptopResponse response = stub.createLaptop(request);

        // 🦅 Test cases
        assertThrows(StatusRuntimeException.class, () -> {});

    }

    @Test
    public void createLaptopWithAlreadyExistsID() throws Exception {
        Randomization randomization = new Randomization();
        Generator generator = new Generator(randomization);
        Laptop laptop = generator.NewLaptop();
        this.store.Save(laptop);

        CreateLaptopRequest request = CreateLaptopRequest
                .newBuilder()
                .setLaptop(laptop)
                .build();

        LaptopServiceGrpc.LaptopServiceBlockingStub stub = LaptopServiceGrpc.newBlockingStub(channel);
        CreateLaptopResponse response = stub.createLaptop(request);

        // 🦅 Test cases
        Throwable ex = assertThrows(StatusRuntimeException.class, () -> {});
        assertEquals(ex.getMessage(),"ALREADY_EXISTS: laptop ID already exists");
    }



}
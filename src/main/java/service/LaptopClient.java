package service;

import com.giavudangle.protobuf.CreateLaptopRequest;
import com.giavudangle.protobuf.CreateLaptopResponse;
import com.giavudangle.protobuf.Laptop;
import com.giavudangle.protobuf.LaptopServiceGrpc;
import com.giavudangle.protobuf.LaptopServiceGrpc.LaptopServiceBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LaptopClient {
    private static final Logger logger = Logger.getLogger(LaptopClient.class.getName());

    private final ManagedChannel channel;
    private final LaptopServiceBlockingStub blockingStub;

    public LaptopClient(String host,int port){
        channel = ManagedChannelBuilder.forAddress(host,port)
                .usePlaintext()
                .build();

        this.blockingStub = LaptopServiceGrpc.newBlockingStub(channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public void createLaptop(Laptop laptop){
        CreateLaptopRequest request = CreateLaptopRequest
                .newBuilder()
                .setLaptop(laptop)
                .build();
        CreateLaptopResponse response = CreateLaptopResponse.getDefaultInstance();
        try {
            response = blockingStub.createLaptop(request);
        } catch (Exception e) {
            logger.log(Level.SEVERE,"request failed: " + e.getMessage());
            return;
        }

        logger.info("laptop created with ID: " + response.getId());
    }
}

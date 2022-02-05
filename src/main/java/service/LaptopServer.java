package service;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import com.giavudangle.protobuf.Laptop;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class LaptopServer {
    private static final Logger logger = Logger.getLogger(LaptopServer.class.getName());
    private final int port;
    private final Server server;

    public LaptopServer(int port, LaptopStore store) {
        this(ServerBuilder.forPort(port), port, store);
    }

    public LaptopServer(ServerBuilder serverBuilder, int port, LaptopStore store) {
        this.port = port;
        LaptopService service = new LaptopService(store);
        server = serverBuilder.addService(service).build();
    }

    public void start() throws IOException {
        server.start();
        logger.info("server start on port -> " + port);
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                System.err.println("shutdown gRPC server -> JVM shutdown");
                try {
                    LaptopServer.this.stop();
                } catch (InterruptedException e) {
                    e.printStackTrace(System.err);
                }
                System.err.println("server shutdown");
            }

        });
    }

    public void stop() throws InterruptedException {
        if (server != null) {
            server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
        }
    }

    private void blockUntilShutdown() throws InterruptedException{
        if(server!= null) {
            server.awaitTermination();
        }
    }

    public static void main(String[] args) throws InterruptedException,IOException{
        InMemoryLaptopStore store = new InMemoryLaptopStore();
        LaptopServer server = new LaptopServer(8080, store);
        server.start();
        server.blockUntilShutdown();
    }
}
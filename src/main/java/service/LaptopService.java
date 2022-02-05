package service;

import java.util.UUID;
import java.util.logging.Logger;

import com.giavudangle.protobuf.CreateLaptopRequest;
import com.giavudangle.protobuf.CreateLaptopResponse;
import com.giavudangle.protobuf.Laptop;
import com.giavudangle.protobuf.LaptopServiceGrpc.LaptopServiceImplBase;

import exception.AlreadyExistsException;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;

public class LaptopService extends LaptopServiceImplBase {
	private static final Logger logger = Logger.getLogger(LaptopService.class.getName());
	private LaptopStore store;

	public LaptopService(LaptopStore store) {
		this.store = store;
	}

	@Override
	public void createLaptop(CreateLaptopRequest request, StreamObserver<CreateLaptopResponse> responseObserver) {
		Laptop laptop = request.getLaptop();

		String id = laptop.getId();

		logger.info("got a create-laptop request with ID: " + id);

		UUID uuid;
		if (id.isEmpty()) {
			uuid = UUID.randomUUID();
		} else {
			try {
				uuid = UUID.fromString(id);
			} catch (IllegalArgumentException e) {
				responseObserver.onError(
						Status.INVALID_ARGUMENT
								.withDescription(e.getMessage())
								.asRuntimeException());
				return;
			}
		}

		Laptop other = laptop.toBuilder()
				.setId(uuid.toString())
				.build();

		try {
			store.Save(other);
		} catch (AlreadyExistsException e) {
			responseObserver.onError(
					Status.ALREADY_EXISTS
							.withDescription(e.getMessage())
							.asRuntimeException());
			return;
		} catch (Exception e) {
			e.printStackTrace();
			responseObserver.onError(
				Status.INTERNAL
				.withDescription(e.getMessage())
				.asRuntimeException()
			);
			return;
		}

		CreateLaptopResponse response = CreateLaptopResponse
		.newBuilder()
		.setId(other.getId())
		.build();


		responseObserver.onNext(response);
		responseObserver.onCompleted();

		logger.info("saved laptop into in-memory-store with ID -> " + laptop.getId());
 

	}

}

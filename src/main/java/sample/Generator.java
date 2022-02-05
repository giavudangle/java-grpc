package sample;

import com.giavudangle.protobuf.*;
import com.google.protobuf.Timestamp;

import java.time.Instant;
import java.util.UUID;

public class Generator {
    private final Randomization randomization;

    public Generator(Randomization randomization){
        this.randomization = randomization;
    }


    public Laptop NewLaptop(){
        String brand = randomization.randomLaptopBrand();
        String name = randomization.randomLaptopName(brand);

        double weightKg = randomization.randomDouble(1.0, 3.0);
        double priceUsd = randomization.randomDouble(1500, 3500);
        int releaseYear = randomization.randomInt(2015, 2019);

        return Laptop.newBuilder()
                .setId(UUID.randomUUID().toString())
                .setBrand(brand)
                .setName(name)
                .setCpu(NewCPU())
                .addGpus(NewGPU())
                .addGpus(NewGPU())
                .addStorages(NewSSD())
                .addStorages(NewHDD())
                .setKeyboard(NewKeyBoard())
                .setWeightKg(weightKg)
                .setWeightLb(weightKg*2.2)
                .setPriceUsd(priceUsd)
                .setReleaseYear(releaseYear)
                .setUpdatedAt(timestampNow())
                .build();
    }

    private Timestamp timestampNow() {
        Instant now = Instant.now();
        return Timestamp.newBuilder()
                .setSeconds(now.getEpochSecond())
                .setNanos(now.getNano())
                .build();
    }


    public Keyboard NewKeyBoard(){
        return Keyboard.newBuilder()
                .setLayout(randomization.randomKeyBoardLayout())
                .setBacklit(randomization.randomBoolean())
                .build();
    }

    public CPU NewCPU(){
        String brand = randomization.randomCPUBrand();
        String name = randomization.randomCPUName(brand);

        int numberOfCores = randomization.randomInt(2, 8);
        int numberOfThreads = randomization.randomInt(numberOfCores, 12);

        double minGhz = randomization.randomDouble(2.0, 3.5);
        double maxGhz = randomization.randomDouble(minGhz, 5.0);

        return CPU.newBuilder()
                .setBrand(brand)
                .setName(name)
                .setNumberCores(numberOfCores)
                .setNumberThreads(numberOfThreads)
                .setMaxGhz(maxGhz)
                .setMinGhz(minGhz)
                .build();
    }

    public GPU NewGPU(){
        String brand = randomization.randomGPUBrand();
        String name = randomization.randomGPUName(brand);


        double minGhz = randomization.randomDouble(1.0, 1.5);
        double maxGhz = randomization.randomDouble(minGhz, 2.0);

        Memory memory = Memory.newBuilder()
                .setValue(randomization.randomInt(2, 6))
                .setUnit(Memory.Unit.GIGABYTE)
                .build();

        return GPU.newBuilder()
                .setBrand(brand)
                .setName(name)
                .setMaxGhz(maxGhz)
                .setMinGhz(minGhz)
                .setMemory(memory)
                .build();
    }

    public Memory NewRAM(){
        return Memory.newBuilder().setValue(randomization.randomInt(4, 64))
                .setUnit(Memory.Unit.GIGABYTE)
                .build();
    }

    public Storage NewSSD(){
        Memory memory =  Memory.newBuilder().setValue(randomization.randomInt(128, 1024))
                .setUnit(Memory.Unit.GIGABYTE)
                .build();

        return Storage.newBuilder()
                .setDriver(Storage.Driver.SSD)
                .setMemory(memory)
                .build();
    }

    public Storage NewHDD(){
        Memory memory =  Memory.newBuilder().setValue(randomization.randomInt(1, 10))
                .setUnit(Memory.Unit.TERABYTE)
                .build();

        return Storage.newBuilder()
                .setDriver(Storage.Driver.HDD)
                .setMemory(memory)
                .build();
    }

    public Screen NewScreen(){
        int height = randomization.randomInt(1080, 4320);
        int width = height * 16/9;

        Screen.Resolution resolution = Screen.Resolution.newBuilder()
                .setHeight(height)
                .setWidth(width)
                .build();

        return Screen.newBuilder()
                .setSizeInch(randomization.randomFloat(13,17))
                .setResolution(resolution)
                .setPanel(randomization.randomScreenPanel())
                .setMultitouch(randomization.randomBoolean())
                .build();
    }




}

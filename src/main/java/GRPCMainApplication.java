import com.giavudangle.protobuf.Laptop;
import sample.Generator;
import sample.Randomization;
import serializer.Serializer;

import java.io.IOException;

public class GRPCMainApplication {
    public static void main(String[] args) throws IOException {
        Randomization randomization = new Randomization();
        Generator generator = new Generator(randomization);

        Laptop laptop = generator.NewLaptop();
        Serializer serializer = new Serializer();
        serializer.WriteJsonFile(laptop,"laptop.json");
        System.out.println(laptop);
    }
}


package serializer;

import com.giavudangle.protobuf.Laptop;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import sample.Generator;
import sample.Randomization;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class SerializerTest {

    @Test
    void TestWriteAndReadBinaryFile() throws IOException {
        String binaryFile ="laptop.bin";
        Laptop laptop_one = new Generator(new Randomization()).NewLaptop();

        Serializer serializer = new Serializer();
        serializer.WriteBinaryFile(laptop_one,binaryFile);

        Laptop laptop_two = serializer.ReadBinaryFile(binaryFile);
        assertEquals(laptop_one, laptop_two);

    }
}
package serializer;

import com.giavudangle.protobuf.Laptop;
import com.google.protobuf.util.JsonFormat;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Serializer {
    public void WriteBinaryFile(Laptop laptop,String filename) throws IOException {
        FileOutputStream outputStream = new FileOutputStream(filename);
        laptop.writeTo(outputStream);
        outputStream.close();
    }

    public Laptop ReadBinaryFile(String filename) throws IOException {
        FileInputStream inputStream = new FileInputStream(filename);
        Laptop laptop = Laptop.parseFrom(inputStream);
        inputStream.close();
        return laptop;
    }

    public void WriteJsonFile(Laptop laptop, String filename) throws IOException {
        JsonFormat.Printer printer = JsonFormat.printer()
                .includingDefaultValueFields()
                .preservingProtoFieldNames();

        String jsonString = printer.print(laptop);

        FileOutputStream outputStream = new FileOutputStream(filename);
        outputStream.write(jsonString.getBytes(StandardCharsets.UTF_8));
        outputStream.close();
    }
}

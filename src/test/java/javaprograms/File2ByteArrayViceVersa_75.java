package javaprograms;

import java.nio.file.Files;
import java.nio.file.Path;

public class File2ByteArrayViceVersa_75 {
    public static void main() {
        try {
            String filePath = System.getProperty("user.dir") + "/src/test/resources/readfile.txt";
            Path path = Path.of(filePath);
            byte[] bytes = Files.readAllBytes(path);
            System.out.println("Byte array length: " + bytes.length);

            filePath = System.getProperty("user.dir") + "/src/test/resources/output.txt";
            path = Path.of(filePath);
            Files.write(path, bytes);
            System.out.println("File created successfully");

        } catch (Exception e) {
           
        }

    }
}

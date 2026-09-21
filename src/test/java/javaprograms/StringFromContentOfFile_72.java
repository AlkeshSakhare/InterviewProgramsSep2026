package javaprograms;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class StringFromContentOfFile_72 {
    public static void main(String[] args) {
        try {
            String filePath = System.getProperty("user.dir") + "/src/test/resources/readfile.txt";
            Path path = Path.of(filePath);
            List<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
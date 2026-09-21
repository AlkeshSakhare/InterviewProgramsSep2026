package javaprograms;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class AppendTextToExistingFile_73 {
    public static void main() {
        try {
            String filePath = System.getProperty("user.dir") + "/src/test/resources/readfile.txt";
            Path path = Path.of(filePath);
            System.out.println("Before Appending.....");
            List<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                System.out.println(line);
            }
            FileWriter fileWriter = new FileWriter(filePath, true);
            fileWriter.append("\nThis is my new appended line");
            fileWriter.close();

            System.out.println("After Appending......");
            lines = Files.readAllLines(path);
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

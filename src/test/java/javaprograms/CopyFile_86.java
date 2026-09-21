package javaprograms;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CopyFile_86 {
    static void main() throws IOException {
        String path = System.getProperty("user.dir") + "/src/test/resources/";
        Path source = Path.of(path + "readfile.txt");
        Path destination = Path.of(path + "copyFile.txt");
        Files.copy(source, destination);
        System.out.println("File copied successfully");
    }
}

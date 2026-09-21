package javaprograms;

import java.io.File;
import java.nio.file.Path;

public class GetCurrentWorkingDirectory_68 {
    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));
        System.out.println(new File(".").getAbsolutePath());
        System.out.println(Path.of("").toAbsolutePath());

    }
}

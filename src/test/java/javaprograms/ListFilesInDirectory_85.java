package javaprograms;

import java.io.File;

public class ListFilesInDirectory_85 {
    static void main() {
        String path = System.getProperty("user.dir") + "/src/test/java/javaprograms";
        File directory = new File(path);
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                System.out.println(file.getName());
            }
        }
    }
}
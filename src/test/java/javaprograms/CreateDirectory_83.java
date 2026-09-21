package javaprograms;

import java.io.File;

public class CreateDirectory_83 {
    static void main() {
        String path = System.getProperty("user.dir") + "/src/test/resources/TestFolder";
        File file = new File(path);
        if (file.mkdirs()) {
            System.out.println("Directory created");
        } else {
            System.out.println("Directory not created");
        }
    }
}

package javaprograms;

import java.io.File;

public class RenameFile_84 {

    public static void main() {
        String path = System.getProperty("user.dir") + "/src/test/resources/";
        File file1 = new File(path + "output1.txt");
        File rename = new File(path + "output.txt");
        if (file1.renameTo(rename)) {
            System.out.println("File renamed successfully");
        } else {
            System.out.println("File rename failed");
        }
    }

}

package javaprograms;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class InputStream2String_76 {
    public static void main() {
        try {
            String path = System.getProperty("user.dir") + "/src/test/resources/output.txt";
            InputStream inputStream = new FileInputStream(path);
            byte[] bytes = inputStream.readAllBytes();

            String str = new String(bytes, StandardCharsets.UTF_8);
            System.out.println(str);
        } catch (Exception e) {
        }
    }
}

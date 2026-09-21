package javaprograms;

import java.io.PrintWriter;
import java.io.StringWriter;

public class ConvertStackTrace2String_74 {
    public static void main() {
        try {
            int no = 5 / 0;
        } catch (Exception e) {
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            e.printStackTrace(pw);
            String stackTrace = sw.toString();
            System.out.println(stackTrace);
        }
    }
}

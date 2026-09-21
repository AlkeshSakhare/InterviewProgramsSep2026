package javaprograms;

public class CheckStringIsNumeric_82 {
    static void main() {
        try {
            String s = "123";
            Integer no = Integer.parseInt(s);
            System.out.println("String is numeric with value: " + no);
        } catch (Exception e) {
            System.out.println("String is not numeric");
        }
    }
}

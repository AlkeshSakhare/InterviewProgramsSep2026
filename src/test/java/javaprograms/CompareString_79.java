package javaprograms;

public class CompareString_79 {
    static void main() {
        String s1 = "All is well";
        String s2 = "All is well";
        String s3 = new String(s1);
        String s4 = new String("All is well");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        System.out.println(s3 == s2);
        System.out.println(s3.equals(s2));

        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));
    }
}

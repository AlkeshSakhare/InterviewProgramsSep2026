package javaprograms;

public class CheckIfStringEmptyOrNull_62 {
    public static void main(String[] args) {
        String s = "";
        String c = new String();

        System.out.println("s = " + s);
        System.out.println("c = " + c);

        System.out.println("is s empty: " + s.isEmpty());
        System.out.println("is s null: " + (s == null));

        System.out.println("is c empty: " + c.isEmpty());
        System.out.println("is c null: " + (c == null));

        s = null;

        System.out.println("is s empty: " + (s == null || s.isEmpty()));
        System.out.println("is s null: " + (s == null));
    }
}

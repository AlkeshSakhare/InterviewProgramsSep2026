package javaprograms;

public class ReverseSentenceUsingRecursive_40 {
    public static void main(String[] args) {
        String s = "This line will be reversed";
        String reverse = reverseMe(s);
        System.out.println("reverse: " + reverse);
    }

    private static String reverseMe(String s) {
        String reverse = "";
        if (s.length() == 0) {
            return reverse;
        }
        reverse = reverse + s.charAt(s.length() - 1) + reverseMe(s.substring(0, s.length() - 1));

        return reverse;
    }
}

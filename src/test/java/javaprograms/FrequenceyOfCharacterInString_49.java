package javaprograms;

public class FrequenceyOfCharacterInString_49 {
    public static void main(String[] args) {

        String s = "This is my program";
        char c = 'r';
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        System.out.println(c + " Frequency count = " + count);
    }
}

package javaprograms;

public class NoOfVowelsAndConsonants_50 {
    public static void main(String[] args) {
        String s = "This is my program";
        int vowels = 0;
        int consonants = 0;
        String s1 = s;
        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isAlphabetic(s.charAt(i))) {
                if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println(s1 + " has" + "\nvowels=" + vowels + "\nconsonents=" + consonants);
    }
}

package javaprograms;

import java.util.Scanner;

public class AlphabetVowelsOrConsonant_8 {
    public static void main(String[] args) {
        System.out.println("Enter a character");
        char c = new Scanner(System.in).nextLine().toLowerCase().charAt(0);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            System.out.println(c + " is Vowel");
        } else {
            System.out.println(c + " is Consonant");
        }


    }
}

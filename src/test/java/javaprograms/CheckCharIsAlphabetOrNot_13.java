package javaprograms;

import java.util.Scanner;

public class CheckCharIsAlphabetOrNot_13 {
    public static void main(String[] args) {
        System.out.println("Enter character");
        char c = new Scanner(System.in).nextLine().charAt(0);
        if (Character.isAlphabetic(c)) {
            System.out.println(c + " is Alphabet");
        } else System.out.println(c + " is not Alphabet");

    }
}

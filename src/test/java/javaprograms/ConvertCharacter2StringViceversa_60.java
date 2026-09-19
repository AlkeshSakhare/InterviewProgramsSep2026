package javaprograms;

import java.util.Arrays;

public class ConvertCharacter2StringViceversa_60 {
    public static void main(String[] args) {
        char c = 'a';
        String s = String.valueOf(c);

        System.out.println("Printint char to String:" + c + " = " + s);

        s = "ItsString";
        char c1[] = s.toCharArray();
        System.out.println("Printing String to Char Arary:" + s + " = " + Arrays.toString(c1));
    }
}

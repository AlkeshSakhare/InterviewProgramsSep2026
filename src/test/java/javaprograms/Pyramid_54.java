package javaprograms;

public class Pyramid_54 {
    public static void main(String[] args) {
        int noRows = 7;
        for (int i = 0; i < noRows; i++) {
            for (int k = noRows; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

package javaprograms;

public class Multiply2MatrixUsingMultidimensionalArrays_46 {
    public static void main(String[] args) {
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int result[][] = new int[3][3];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                a[i][j] = (int) (Math.random() * 10);
                b[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    result[i][j] = result[i][j] + a[i][k] * b[k][j];
                }
            }
        }
        System.out.println("A Matrix");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("B Matrix");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matrix A x Matrix B =");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

}

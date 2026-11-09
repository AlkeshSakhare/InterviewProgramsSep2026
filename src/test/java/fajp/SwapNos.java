package fajp;

public class SwapNos {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println(a + "\t" + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + "\t" + b);
    }
}

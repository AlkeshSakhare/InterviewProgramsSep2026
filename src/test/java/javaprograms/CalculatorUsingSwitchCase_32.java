package javaprograms;

import java.util.Scanner;

public class CalculatorUsingSwitchCase_32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter nos 1");
        int no1 = scanner.nextInt();
        System.out.println("Enter nos 2");
        int no2 = scanner.nextInt();
        scanner.nextLine(); // consume Enter
        System.out.println("Enter operation (+, -, *, /)");
        char op = scanner.nextLine().charAt(0);
        switch (op) {
            case '+':
                System.out.println(no1 + "+" + no2 + " = " + (no1 + no2));
                break;
            case '-':
                System.out.println(no1 + "-" + no2 + " = " + (no1 - no2));
                break;
            case '*':
                System.out.println(no1 + "*" + no2 + " = " + (no1 * no2));
                break;
            case '/':
                System.out.println(no1 + "/" + no2 + " = " + (no1 / no2));
                break;
            default:
                System.out.println("Invalid operation");
        }
    }
}

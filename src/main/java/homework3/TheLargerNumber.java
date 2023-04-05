package homework3;

import java.util.Scanner;

public class TheLargerNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first number:");
        int a = scanner.nextInt();
        System.out.println("Please enter the second number:");
        int b = scanner.nextInt();
        System.out.println("Please enter the third number:");
        int c = scanner.nextInt();

        System.out.println(a > b ? (a) + " is greater!" : (b) + " is greater!");
        System.out.println(a > c ? (a) + " is greater!" : (c) + " is greater!");
        System.out.println(b > c ? (b) + " is greater!" : (c) + " is greater!");
    }
}
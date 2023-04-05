package homework3;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the integer number: ");
        int number = scanner.nextInt();
        if (number % 2 == 1) {
            System.out.println(number + " is odd number.");

        }
        if (number % 2 == 0) {
            System.out.println(number + " is even number");
        }
    }
}
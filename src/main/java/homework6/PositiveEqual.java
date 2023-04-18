package homework6;

import java.util.Scanner;

public class PositiveEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int first = sc.nextInt();

        System.out.println("Enter second number: ");
        int second = sc.nextInt();

        System.out.println("Enter third number: ");
        int third = sc.nextInt();

        if ((first == second) && (second == third)) {
            System.out.println("Numbers are equal.");
        }

        if ((first >= 0) && (second >= 0) && (third >= 0)) {
            System.out.println("Numbers are positive.");
        }  else {
            System.out.println("Not all numbers are positive.");
        }

    }

}

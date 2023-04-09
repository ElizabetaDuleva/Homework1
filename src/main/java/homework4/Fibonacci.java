package homework4;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        int next;
        int sum = 0;

        System.out.println("Please enter how many Fibonacci numbers you want to print:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n ; i++) {

            System.out.print(first + " ");

            next = first + second;
            first = second;
            second = next;

            sum += next;
        }
        System.out.println();
        System.out.println("The sum of Fibonacci numbers is: " + sum);
    }

}

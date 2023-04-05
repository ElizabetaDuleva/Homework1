package homework3;

import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the length of rectangle: ");
        int a = scanner.nextInt();
        System.out.println("Please enter the width of rectangle");
        int b = scanner.nextInt();

        System.out.println(a * b + " is the area of rectangle.");
        System.out.println(2 * (a + b) + " is the perimeter of rectangle." );

    }
}

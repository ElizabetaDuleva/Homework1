package homework3;

import java.time.DayOfWeek;
import java.util.Scanner;
public class DaysOfTheWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter а number from 1 to 7");
        int a = scanner.nextInt();

        switch (a) {
            case 1:
                System.out.print("Monday");
                break;
            case 2:
                System.out.print("Tuesday");
                break;
            case 3:
                System.out.print("Wednesday");
                break;
            case 4:
                System.out.print("Thursday");
                break;
            case 5:
                System.out.print("Friday");
                break;
            case 6:
                System.out.print("Saturday");
                break;
            case 7:
                System.out.print("Sunday");
                break;
            default:
                System.out.print("Incorrect information");

        }
        String DayOfTheWeek;
        System.out.println("You have selected " + a + " day of the week is " ); // I don't know how to аdd the day at the end
    }
}

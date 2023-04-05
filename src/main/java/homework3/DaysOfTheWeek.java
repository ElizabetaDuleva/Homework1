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
                    System.out.printf("Monday\n");
                    break;
                case 2:
                    System.out.printf("Tuesday\n");
                    break;
                case 3:
                    System.out.printf("Wednesday\n");
                    break;
                case 4:
                    System.out.printf("Thursday\n");
                    break;
                case 5:
                    System.out.printf("Friday\n");
                    break;
                case 6:
                    System.out.printf("Saturday\n");
                    break;
                case 7:
                    System.out.printf("Sunday\n");
                    break;
                default:
                    System.out.print("Incorrect information\n");

            }
            String DayOfTheWeek;
            System.out.println("You have selected " + a + " day of the week is " ); // I don't know how to аdd the day at the end
    }

}

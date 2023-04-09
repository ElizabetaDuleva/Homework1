package homework3;

import java.time.DayOfWeek;
import java.util.Scanner;
public class DaysOfTheWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter а number from 1 to 7");
        int weekDayNumber = scanner.nextInt();
        String dayOfTheWeek = null;

            switch (weekDayNumber) {
                case 1:
                    dayOfTheWeek = "Monday\n";
                    break;
                case 2:
                    dayOfTheWeek = "Tuesday\n";
                    break;
                case 3:
                    dayOfTheWeek = ("Wednesday\n");
                    break;
                case 4:
                    dayOfTheWeek = ("Thursday\n");
                    break;
                case 5:
                    dayOfTheWeek = ("Friday\n");
                    break;
                case 6:
                    dayOfTheWeek = ("Saturday\n");
                    break;
                case 7:
                    dayOfTheWeek = ("Sunday\n");
                    break;
                default:
                    dayOfTheWeek = ("Incorrect information\n");

            }

            System.out.println("You have selected " + weekDayNumber + " day of the week is " + dayOfTheWeek) ;
    }

}

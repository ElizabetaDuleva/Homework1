package homework4;

import java.util.Scanner;

public class EvensOdds {
    public static void main(String[] args) {
        int[] numbers = {1, 8, 6, 9, 4, 4, 3 ,5 ,7};
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < numbers.length ; i++) {
            if (i % 2 == 0) {
                sumEven = sumEven + i;
            } if (i % 2 == 1);{
                sumOdd = sumOdd + i;
            }
        }
        System.out.println(sumEven);
        System.out.println(sumOdd);
    }
}

package homework6;

import java.util.Scanner;

public class AverageAndSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int first = scanner.nextInt();

        System.out.println("Please enter second number: ");
        int second = scanner.nextInt();

        float sum = 0;
        sum = first + second;

        float average = sum/2;

        System.out.println("The average is: " + average);
    }
    public static int sum(int a, int b){
        a = 7;
        b = 6;
        return a + b;
    }
    public static float average(int a,int b){
        return sum(a,b)/2;
    }

}

package homework4;

import java.util.Scanner;
public class OneToN {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number for N: ");

        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++) {

            System.out.println(i +" ");
            }

        for (int i = 1; i <=N ; i++) {

            if (i % 3 != 0 && i % 7 !=0){

                System.out.println("The number that are not divisible by 3 and 7 are: " + i + "");
        }
        }
    }
}

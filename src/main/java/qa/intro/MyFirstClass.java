package qa.intro;

import java.util.Scanner;

public class MyFirstClass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, please enter your name:");

        String userName = scanner.nextLine();

        System.out.println("What is your favourite hobby, " + userName + "?");

        String hobby = scanner.nextLine();

        System.out.println("That sounds fun" + "!" + " Let's go to " + hobby + "!");

    }
}

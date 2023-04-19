package homework6;

import java.util.Scanner;

public class PasswordRegex {
    public static boolean password (String pass){
        String regex = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,20}$";

        return pass.matches(regex);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password;
        int i;

        for (i=0; i <= 8; i++){
            System.out.print("\nEnter the password:");
            password = sc.next();

            System.out.printf("Is the password valid? " + password(password));
        }

    }

}

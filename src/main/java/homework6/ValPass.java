package homework6;

import java.util.Scanner;

public class ValPass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pass;

        System.out.println("Enter password: ");
        pass = scanner.nextLine();

        System.out.println(password(pass));

    }

    public static boolean password(String pass){
        if (pass.length() > 7){
            if (checkPass(pass)){

                return true;
            }else {

                return false;
            }

        }else {

            System.out.println("Too small");
            return false;
        }
    }

    public static boolean checkPass(String pass){
        boolean hasNum = false; boolean hasCap =false;
        boolean hasLow = false; char i;

        for (int j = 0; j < pass.length(); j++) {
            i = pass.charAt(j);

            if (Character.isDigit(i)) {

                hasNum = true;

            } else if (Character.isUpperCase(i)) {

                hasCap = true;

            } else if (Character.isLowerCase(i)) {

                hasLow = true;

            }
            if (hasNum && hasCap && hasLow) {

                return true;
            }
        }
        return false;

    }
}


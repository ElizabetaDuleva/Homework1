package homework2;

public class CompareAndSplit {
    public static void main(String[] args) {
        String First = "What are you doing?";
        String Second = "Hello! What are you doing?";
        System.out.println(First.equals(Second));

        //task 3
        String[] splitted = Second.split(" ");
        System.out.println(splitted.length);
    }
}

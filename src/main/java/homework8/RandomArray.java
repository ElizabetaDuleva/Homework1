package homework8;
import java.util.Random;
public class RandomArray {
    public static void main(String[] args) {

        Random random = new Random();
        int [] array = new int[15];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1, 50);
            System.out.println(array[i]);
        }

    }
}

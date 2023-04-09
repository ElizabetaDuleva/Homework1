package homework4;

public class IntegerAndAverage {
    public static void main(String[] args) {
        int[] elements = new int[20];

        for (int i = 0; i < elements.length; i++) {
            elements[i] = i * 5;
            System.out.println(elements[i]);
        }

        int sum = 0;

        for (int i = 0; i < elements.length; i++) {
            sum += elements[i];
        }
        float average = sum/elements.length;
        System.out.println("The average value is: " + average);
    }
}


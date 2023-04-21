package homework8;
import java.lang.Math;
public class MathTriangle {
    public static void main(String[] args) {
        System.out.println("The area is: "+ areaEquilateralTriangle(5));

    }
    public static double areaEquilateralTriangle(double a){
        return (double) ((Math.sqrt(3)/4) * Math.pow(a,2));
    }
}

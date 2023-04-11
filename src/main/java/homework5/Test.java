package homework5;

public class Test {
    public static void main(String[] args) {
        Cat Indiana = new Cat("Indiana", "british shorthair", (byte) 4, 4.4f, "grey", true);
        Indiana.sleep();
        Indiana.eat();

        Cat Sweety = new Cat("Swetty", "sphynx", (byte) 1, 3.0f, "flesh-colored", false);
        Sweety.sleep();
        Sweety.eat();
    }

}

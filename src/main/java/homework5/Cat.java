package homework5;

public class Cat extends Pet {

    private boolean hasFur;

    public boolean isHasFur() { return hasFur; }

    public void setHasFur(boolean hasFur) { this.hasFur = hasFur; }

    public Cat(String name, String breed, byte age, float weight, String color, boolean hasFur) {
        super(name, breed, age, weight, color);
        setHasFur(hasFur);
    }
}
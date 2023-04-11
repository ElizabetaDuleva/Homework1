package homework5;

public class Pet {
    private String name;
    private String breed;
    private byte age;
    private float weight;
    private String color;

    public Pet(String name, String breed, byte age, float weight, String color){
        setName(name);
        setBreed(breed);
        setAge(age);
        setWeight(weight);
        setColor(color);
    }

    public void sleep (){
        System.out.println(this.name + " is sleeping.");
    }
    public void eat (){
        System.out.println(this.name + " is eating.");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        }else {
            System.out.println("Error: Please enter name");
        }

    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if (!breed.equals(null)) {
            this.breed = breed;
        }else {
            System.out.println("Error: Please enter breed");
        }

    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        if (age >= 0) {
            this.age = age;
        }else {
            System.out.println("Error: Please enter age");
        }

    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        if (weight > 0) {
            this.weight = weight;
        }else {
            System.out.println("Error: please enter weight");
        }

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (!color.isEmpty()){
            this.color = color;
        }else {
            System.out.println("Error: please enter color");
        }

    }
}

package classes.demo;

/**
 *
 * @author mustafa
 */
public class Dog {

    private String name;
    private int age;
    private double length;
    private Collar collar;

    /*public Dog(String dogName, int dogAge, double dogLength) {
        name = dogName;
        age = dogAge;
        length = dogLength;
        collar = new Collar();
    }*/
    public Dog(String name, int age, double length) {
        this.name = name;
        this.age = age;
        this.length = length;
        this.collar = new Collar();
    }

    public String getName() {
        return this.name;
    }

    private void bark() {
        System.out.println("wow-wow");
    }

    public void doSth() {
        this.bark();
    }

    public static void main(String[] args) {
        Dog myDog = new Dog("Bobi", 2, 0.4); // Passing parameters
        System.out.println("My dog " + myDog.getName()
                + " is " + myDog.age + " year(s) old. "
                + " and it has length: " + myDog.length + " m");
    }

}

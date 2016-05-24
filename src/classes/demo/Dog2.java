package classes.demo;

/**
 *
 * @author mustafa
 */
public class Dog2 {
// Static variable

    static int dogCount;
// Instance variables
    private String name;
    private int age;

    public Dog2(String name, int age) {
        this.name = name;
        this.age = age;

        dogCount += 1;
    }

    public void bark() {
        System.out.println("wow-wow");
    }
// Non-static (instance) method

    public void getInfo() {
// Accessing instance variables – name and age
        System.out.print("Dog's name: " + this.name
                + "; age: " + this.age + "; often says: ");
// Calling instance method
        this.bark();
    }

    public int getAge() {
        return this.age;
    }

    public static void main(String[] args) {
        Dog2 dog = new Dog2("Sharo", 1);
        dog.getInfo();

        Dog2 myDog = new Dog2("Sharo", 2);
        String myDogName = myDog.name;
        int myDogAge = myDog.getAge();
        System.out.println("My dog \"" + myDogName
                + "\" has age of " + myDogAge + " years ");

    }
}

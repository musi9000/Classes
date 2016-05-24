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

    // Static variable - declaration and initialization
    static int dogCount = 0;

    // The base of the natural logarithms (approximate value)
    public static final double E = 2.718281828459045;
    public static final double PI = 3.141592653589793;
    public static final char PATH_SEPARATOR = '/';
    public static final String BIG_COFFEE = "big";
    public static final int MAX_VALUE = 2147483647;

    public Dog(String name, int age, double length) {
        this.name = name;
        this.age = age;
        this.length = length;
        this.collar = new Collar();
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        dogCount += 1; // Modify the value in the constructor
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

    public static int getDogCount() {
        return dogCount;
    }

    public static int add(int number1, int number2) {
        return (number1 + number2);
    }

    public static void main(String[] args) {
        Dog myDog = new Dog("Bobi", 2, 0.4); // Passing parameters
        System.out.println("My dog " + myDog.getName()
                + " is " + myDog.age + " year(s) old. "
                + " and it has length: " + myDog.length + " m");

        // Аccess to the static variable through class name
        System.out.println("Dog count is now " + Dog.dogCount);

        Dog dog1 = new Dog("Karaman", 1);
        Dog dog2 = new Dog("Bobi", 2);
        Dog dog3 = new Dog("Sharo", 3);
        // Access to the static variable
        System.out.println("Dog count is now " + Dog.dogCount);
    }

}

package classes;
import java.util.Scanner;
/**
 *
 * @author mustafa
 */
// Class declaration
class Dog { // Openening brace of the class body
// Property-field definition

    private String name;
// Constructor definition

    public Dog() {
        this.name = "Sharo";
    }
// Constructor definition

    public Dog(String name) {
        this.name = name;
    }
// Property getter-method definition

    public String getName() {
        return this.name;
    }
// Property setter-method definition

    public void setName(String name) {
        this.name = name;
    }
// Method definition

    public void bark() {
        System.out.printf("Dog %s said: Wow-wow!%n", name);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Write first dog's name: ");
        String firstDogName = input.nextLine();
// Assign dog name with a constructor
        Dog firstDog = new Dog(firstDogName);
        System.out.print("Write second dog's name: ");
        Dog secondDog = new Dog();
// Assign dog name with a property
        secondDog.setName(input.nextLine());
// Create a dog with a default name
        Dog thirdDog = new Dog();
        Dog[] dogs = new Dog[]{firstDog, secondDog, thirdDog};
        for (Dog dog : dogs) {
            dog.bark();
        }
    }
}

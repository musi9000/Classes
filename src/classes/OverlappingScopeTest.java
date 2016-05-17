package classes;

/**
 *
 * @author mustafa
 */
class OverlappingScopeTest {

    int myValue = 3;

    void printMyValue() {
        // Defining new local variable with the same name
        int myValue = 5;
        System.out.println("My value is: " + myValue);
    }

    int calculateNewValue(int newValue) {
        int result = myValue + newValue;
        return result;
    }

    public static void main(String[] args) {
        OverlappingScopeTest instance = new OverlappingScopeTest();
        instance.printMyValue();

    }
}

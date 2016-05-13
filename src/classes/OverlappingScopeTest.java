package classes;

/**
 *
 * @author mustafa
 */
class OverlappingScopeTest {

    int myValue = 3;

    void printMyValue() {
        System.out.println("My value is: " + myValue);
    }

    public static void main(String[] args) {
        OverlappingScopeTest instance = new OverlappingScopeTest();
        instance.printMyValue();
    }
}

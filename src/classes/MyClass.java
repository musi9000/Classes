package classes;

/**
 *
 * @author mustafa
 */
public class MyClass {
// LEGAL constructor

    public MyClass() {
    }
// Misleading method - has return type

    String MyClass() {
        return "MyClass() method has finished successfully.";
    }

    public static void main(String[] args) {
        MyClass instance = new MyClass();
// Calling the tricky method...
        System.out.println(instance.MyClass());
    }
}

package examples;

/**
 *
 * @author mustafa
 */
public class TestPhone {
    public static void main(String[] args) {
        
        GSM phone = new GSM("Iphone","Apple");
        phone.setOwner("Mustafa");
        phone.getInfo();
        
        System.out.print(GSM.getN95());
    }
}

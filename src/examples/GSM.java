package examples;

/**
 *
 * @author mustafa
 */
public class GSM {

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public static String getN95() {
        return n95;
    }

   
    private String model;
    private String brand;
    private double price;
    private String owner;
    static String n95 = "Nokia n95";

    

    public GSM(String gsmModel, String gsmBrand, double gsmPrice, String gsmOwner) {
        this.model = gsmModel;
        this.brand = gsmBrand;
        this.price = gsmPrice;
        this.owner = gsmOwner;
    }

    public GSM(String gsmModel, String gsmBrand) {
        this.model = gsmModel;
        this.brand = gsmBrand;
        this.price = 0;
        this.owner = null;
    }
    
    public void getInfo() {
        System.out.printf("Model %s brand %s price %s owner %s\n", model, brand, price, owner);
    }

}

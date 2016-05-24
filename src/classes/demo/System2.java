package classes.demo;

/**
 *
 * @author mustafa
 */
public class System2 {

    private static double version = 0.1;
    private static String vendor = "Sun Microsystems";
// The version property getter:

    public static double getVersion() {
        return version;
    }
// The version property setter:

    public static void setVersion(double version) {
        System2.version = version;
    }
// The vendor property getter:

    public static String getVendor() {
        return vendor;
    }
// The vendor property setter:

    public static void setVendor(String vendor) {
        System2.vendor = vendor;
    }
// ... More (non)static code here ...
}

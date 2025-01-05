public class staticinitializer {
    static HelperClass staticHelper;
    // Static initializer block
    static {
    staticHelper = new HelperClass();
    }
    static void displayStaticHelperMessage() {
    staticHelper.displayMessage();
    }
}

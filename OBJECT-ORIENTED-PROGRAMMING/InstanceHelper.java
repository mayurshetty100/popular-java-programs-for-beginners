class InstanceHelper{
    HelperClass instanceHelper;
    // Instance initializer block
    {
    instanceHelper = new HelperClass();
    }
    void displayInstanceHelperMessage() {
    instanceHelper.displayMessage();
    }
}
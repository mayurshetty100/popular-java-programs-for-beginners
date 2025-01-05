class thiskeyword5{
    private String name;
    public thiskeyword5(String name, Helper helper) {
    this.name = name;
    helper.assist(this); // Passes current object to Helper's method
    }
    public String getName() {
    return name;
    }
    public static void main(String[] args) {
    Helper helper = new Helper();
    thiskeyword5 obj = new thiskeyword5("Mayur Shetty", helper); // Output: Assisting: Mayur Shetty
    }
}
class Helper {
    public void assist(thiskeyword5 obj) {
    System.out.println("Assisting: " + obj.getName());
    }
}
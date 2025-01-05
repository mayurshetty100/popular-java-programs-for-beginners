class thiskeyword3{
    private String name;
    // Constructor with no parameters
    public thiskeyword3() {
    this("Mayur Shetty"); // Calls the constructor with String parameter
    }
    // Constructor with parameter 'name'
    public thiskeyword3(String name) {
    this.name = name;
    }
    public void display() {
    System.out.println("Name: " + name);
    }
    public static void main(String[] args) {
    thiskeyword3 obj = new thiskeyword3();
    obj.display(); // Output: Name: Mayur Shetty
    }
}
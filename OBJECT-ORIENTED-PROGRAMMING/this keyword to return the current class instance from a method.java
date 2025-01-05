class thiskeyword6 {
    private String name;
    public thiskeyword6 setName(String name) {
    this.name = name;
    return this; // Returns current instance
    }
    public void display() {
    System.out.println("Name: " + name);
    }
    public static void main(String[] args) {
    thiskeyword6 obj = new thiskeyword6();
    obj.setName("Mayur Shetty").display(); // Method chaining, Output: Name: Mayur Shetty
    }
}

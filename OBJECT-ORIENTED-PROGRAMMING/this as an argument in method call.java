class thiskeyword4 {
    private String name;
    public thiskeyword4(String name) {
    this.name = name;
    }
    public void greet(thiskeyword4 obj) {
    System.out.println("Hello, " + obj.name + "!");
    }
    public void sendGreeting() {
    this.greet(this); // Passes current object as an argument
    }
    public static void main(String[] args) {
    thiskeyword4 obj = new thiskeyword4("Mayur Shetty");
    obj.sendGreeting(); // Output: Hello, Mayur Shetty!
    }
}
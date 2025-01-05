class thiskeyword1{
private String name;
// Constructor with parameter 'name'
public thiskeyword1(String name) {
this.name = name; // 'this.name' refers to the instance variable
}
public void display() {
System.out.println("Name: " + name);
}
public static void main(String[] args) {
thiskeyword1 obj = new thiskeyword1("Mayur Shetty");
obj.display(); // Output: Name: Mayur Shetty
}
}
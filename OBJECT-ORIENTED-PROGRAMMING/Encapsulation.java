class Person {
    private String name;//using private access modifier
    public String getName() //restricting direct access to name
    {
    return name;
    }
    public void setName(String name) //using setters to set the name
    {
    this.name = name;
    }
}
    public class Encapsulation{
    public static void main(String[] args) {
    Person person = new Person();
    person.setName("Mayur Shetty");//using setter instead of person.name="Mayur Shetty"
    System.out.println("Name: " + person.getName());
    }
}
/* here by declaring the name as private and using the getters and setters to access the 
 * names,we can add logic to the setter method to avoid setting the name as null like 
 * in direct method we could do person.name=""; so by adding these encapsulation techniques 
 * we can have additional security measures and even ensure that the name can be accessed only by these 
 * two method and no other way */
 
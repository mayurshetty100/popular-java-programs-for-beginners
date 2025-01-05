abstract class Animal{
    String name;
    Animal(String name){
        this.name=name;
        System.out.println("Animal Constructor is called");
    }
    abstract void sound();
}
class Dog extends Animal {
    Dog(String name){
        super(name);//calling the Animal class constructor
    }
    void sound(){
        System.out.println(name+" says: Woof Woof");
    }
    }
public class Abstraction2{
    public static void main(String[] args){
        Dog dog=new Dog("Buddy");
        dog.sound();
    }
}
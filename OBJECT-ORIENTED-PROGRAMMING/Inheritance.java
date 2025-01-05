class Animal{
    void eat(){
        System.out.println("Animal eats food.");
    }
}
//derived class / child class
class Dog extends Animal {
    void bark() {
    System.out.println("The dog barks.");
    }
}
public class Inheritance {
    public static void main(String[] args) {
    Dog dog=new Dog();
    dog.eat(); // Inherited from Animal class
    dog.bark();
    }
}
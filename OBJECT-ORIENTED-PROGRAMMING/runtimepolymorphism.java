//Inheritance is run time polymorphism(method overriding)
class Animal {
    void sound() {
    System.out.println("Animal makes a sound.");
    }
}
    class Dog extends Animal {
    void sound() {
    System.out.println("Dog barks.");
    }
}
    class Cat extends Animal {
    void sound() {
    System.out.println("Cat meows.");
    }
}
    public class runtimepolymorphism {
    public static void main(String[] args) {
    Animal myDog = new Dog();
    Animal myCat = new Cat();
    myDog.sound();//method ovverriding of base class method by derived classes (runtime polymorphism)
    myCat.sound();
    }
}
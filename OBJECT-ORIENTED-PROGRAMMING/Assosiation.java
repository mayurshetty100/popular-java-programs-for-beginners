/*  Association represents a relationship between two or more objects. It is a "has-a" relationship, where one object is associated with another object, but both objects exist independently.
Definition: Association refers to a relationship where one class uses another class, but neither class depends on the other in an inheritance hierarchy.
Type of Relationship: "Has-a" relationship.
Objects can exist independently.
A class can associate with multiple other classes.
The association can be bi-directional (both objects are aware of each other) or uni-directional (one object knows about the other, but not vice versa).
Association can be implemented using composition (stronger relationship) or aggregation (weaker relationship).



whereas in inheritance the subclass is a improvized version of a parent class and is 
dependent on its parent class . it represents "is-a" relationship*/
class Teacher {
    void teach() {
    System.out.println("Teacher teaches.");
    }
}
    class Student {
    void learn() {
    System.out.println("Student learns.");
    }
}
    public class Assosiation{
    public static void main(String[] args) {
    Teacher teacher = new Teacher();
    Student student = new Student();
    teacher.teach();
    student.learn();
    }
}
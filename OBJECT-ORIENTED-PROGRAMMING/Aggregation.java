/* aggregation is a special form of association where one object 
(the whole) is made up of other objects (the parts).
 The key characteristic of aggregation is that the part objects can
  exist independently of the whole object. This means that even if 
  the "whole" object is destroyed, the "part" objects continue to exist.

Aggregation is often described as a "has-a" relationship. 
It is a weaker relationship compared to composition, which represents
 a stronger "has-a" relationship where the parts can't exist without the whole. */
class Department {
    private String name;
    public Department(String name) {
    this.name = name;
    }
    public String getName() {
    return name;
    }
}
    class University {
    private Department department;
    public University(Department department) {
    this.department = department;
    }
    public void showDepartment() {
    System.out.println("University has a department: " + department.getName());
    }
}
    public class Aggregation{
    public static void main(String[] args) {
    Department dept = new Department("Computer Science");
    University university = new University(dept);
    university.showDepartment();
    }
}
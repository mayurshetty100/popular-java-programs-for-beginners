/* final in java is used to make the contents unchangeable
it can be a varible , method or a class.
an uninitialized final varible can only be initialized in a constructor
below code leads to compilation error bcz we r trying to change the value of
final varible which is not possible */
class Bike9{ 
    final int speedlimit=90;//final variable 
    void run(){ 
     speedlimit=400; 
    } 
    public static void main(String args[]){ 
    Bike9 obj=new Bike9(); 
    obj.run(); 
    } 
}

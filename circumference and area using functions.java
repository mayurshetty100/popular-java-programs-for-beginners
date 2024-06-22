import java.util.Scanner;
class functions{
    public static void circle(float r ){
        System.out.println("circumference of the circle is "+ 2*3.14*r);
        System.out.println("the area of the circle is "+ 3.14*r*r);
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the radius of the circle ");
        float r= input.nextFloat();
        circle(r);
        input.close();
    }
}
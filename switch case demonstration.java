import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("lets check which day is lucky for you . i have shuffled the days of the week in random ");
        System.out.println("Enter the name between 1 to 7 ");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Thursday");
                break;
            case 2:
                System.out.println("Wednesday");
                break;
            case 3:
                System.out.println("Monday");
                break;
            case 4:
                System.out.println("Tuesday");
                break;
            case 5:
                System.out.println("Sunday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Friday");
                break;
            default:
                System.out.println("ninge luck ee illa ");
        }sc.close();
    }
}
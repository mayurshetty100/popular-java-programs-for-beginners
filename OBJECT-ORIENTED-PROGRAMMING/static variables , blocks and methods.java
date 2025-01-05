class UseStatic {
    static int a = 3;//static variable
    static int b;//static variable
   //static method
    static void meth(int x) {
    System.out.println("x = " + x);
    System.out.println("a = " + a);
    System.out.println("b = " + b);
    }
    //static block
    static {
    System.out.println("Static block initialized.");
    b = a * 4;
    }
    public static void main(String args[]) {
    meth(42);
    }
}
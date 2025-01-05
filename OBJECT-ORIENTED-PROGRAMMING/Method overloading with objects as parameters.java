class Test {
    int a, b;
    Test(int i, int j) {
    a = i;
    b = j;
    }
    // return true if o is equal to the invoking object
    boolean equals(Test o) {
    if(o.a == a && o.b == b) return true;
    else return false;
    }
}
    class PassOb {
    public static void main(String args[]) {
    Test ob1 = new Test(100, 22);
    Test ob2 = new Test(100, 22);// ob1 == ob2
    Test ob3 = new Test(-1, -1);// ob1 != ob3
    System.out.println("ob1 == ob2: " + ob1.equals(ob2));
    System.out.println("ob1 == ob3: " + ob1.equals(ob3));
    }
}
class thiskeyword2{
    public void printMessage() {
    System.out.println("Hello from printMessage!");
    }
    public void callPrintMessage() {
    this.printMessage(); // Invokes the printMessage method in the same class
    }
    public static void main(String[] args) {
    thiskeyword2 obj = new thiskeyword2();
    obj.callPrintMessage(); // Output: Hello from printMessage!
    }
    }
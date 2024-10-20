class reverseString{
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("HelloWorld");
        for(int i=0;i<sb.length()/2;i++){
            int front=i;// front index
            int back=sb.length()-i-1;// back index
            char frontchar=sb.charAt(front);// character at front of the string
            char backchar=sb.charAt(back);//character at back position of the string 
            sb.setCharAt(front,backchar);// sets the front character as backcharacter 
            sb.setCharAt(back,frontchar);// sets the back character as front character
        }
        System.out.println("The String after reversing is: "+sb);// prints the result of reversing to the console
    }
} 
    


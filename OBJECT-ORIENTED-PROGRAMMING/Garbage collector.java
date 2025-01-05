class garbageCollector{ 
    public void finalize()//finalize method
    {
        System.out.println("object is garbage collected");
    } 
    public static void main(String args[]){ 
     garbageCollector s1=new garbageCollector(); 
     garbageCollector s2=new garbageCollector(); 
     s1=null; //giving null reference to the objects created
     s2=null; 
     System.gc(); // invoking the garbage collector 
    } 
}
class Demo {
    int x; // instance (Object) member variable
    int y; // instance (Object) member variable
   
    
    void fun1() { // instance (Object) member method
        System.out.println("fun1");
    }
    
    void fun2() { // instance (Object) member method
        System.out.println("fun2");
    }
}

class Object {
    public static void main(String[] args) {
        Demo a1 = new Demo();
        Demo a2 = new Demo();
        a1.x = 10; // assigning a value to x
        a1.y = 20; // assigning a value to y
        a2.y = 20; // assigning a value to y
        
        System.out.println("Hello");
        System.out.println("a1.x = " + a1.x); // accessing x
        System.out.println("a1.y = " + a1.y); // accessing x
        System.out.println("a2.y = " + a2.y); // accessing y
        
    }
}



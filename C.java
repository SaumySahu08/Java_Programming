class A {
    int x = 5;
    
    A() {
        printValue();
    }
    
    void printValue() {
        System.out.println("Value from A: " + x);
    }
    }
    
    class B extends A {
    int x = 10;
    
    void printValue() {
        
        System.out.println("Value from B: " + x);
    }
    }
    
    public class C {
    public static void main(String[] args) {
    B obj = new B();
    }
    }
    
    
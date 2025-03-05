
class Calculator{
    public void add(int n1,int n2){
        System.out.println(" int sum = "+(n1+n2));        
    }
    public void add(double n1,double n2){
        System.out.println("double sum = "+(n1+n2));
    }
    public void multiply(int n1,int n2){
        System.out.println("int Multiply = "+(n1*n2));
    }
    public void multiply(double n1,double n2){
        System.out.println("double Multiply = "+(n1*n2));
    }
}


public class MathOperations {

    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(10.3,20);
        c.multiply(10,20);
        c.add(-10.5,20);

    }
    
}

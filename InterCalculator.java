@FunctionalInterface
interface Calculator {
    void calculateSum(int... x);    
}



class SimpleCalculator implements Calculator{
    @Override
    public  void calculateSum(int... x) {
        int sum=0;
        for(int z : x){
            sum=sum+z;
        }
        System.out.println("Sum of the numbers: "+sum);
    };
}





public class InterCalculator {
    public static void main(String[] args) {
        SimpleCalculator s = new SimpleCalculator();
        s.calculateSum(1,2,3);
        s.calculateSum(10,29,36);
    }
}

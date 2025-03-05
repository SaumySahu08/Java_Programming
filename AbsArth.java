interface  AdvancedArithmetic {
    public abstract int divisorSum(int n);

}
class MyCalculator implements AdvancedArithmetic{
    @Override
    public int divisorSum(int k){
        if(k<=0){
            System.err.println("Error: Input must be a positive integer.");
            System.exit(0);
        }
        int sum=0;
        for(int i =1;i<=k;i++){
            if(k%i==0){
                sum=sum+i;
            }
           
        }
        return sum;
    }
    public int divisorSum(String s){
        System.out.println("Error: Invalid input. Please enter a valid positive integer.");
        return 0;
    }
}





public class AbsArth {
    public static void main(String[] args) {
        MyCalculator m = new MyCalculator();
        System.out.println(m.divisorSum(6));
    }
}

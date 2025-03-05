public class TwoDigitSum {
    public static int getSumOfDigits(int n){
        int r=n%10;
        n=n/10;

        
        return n-r;
    }
    
}

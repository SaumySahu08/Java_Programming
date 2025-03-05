

public class x_power_n_recursion {
    static int sum=1;
   static int fb(int x,int n){
    
    if(n==0){
        return 0;
    }
    
   sum=sum*x;//sum2 n2//sum4 n1//sum8 n0
   //System.out.println(sum);
    fb(x, n-1);
    return sum;
        
        

        


    }



    public static void main(String[] args) {
        int x=2,n=8;
        int z=fb(x,n);
        System.out.println(sum);
        
        
    }
    
}

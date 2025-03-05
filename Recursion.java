public class Recursion {
    //add until became one digit
    public static void chekczero(int n)//123
    {
        int sum=0;
        if(n>=1)
        {
            System.out.println("inside if");
            sum+=n%10;
            
            chekczero(n/10);//
            System.out.println(sum);
        }
        else
        {
            System.out.println("inside else");
            System.out.println(sum);
        }
     
    }
    public static void main(String[] args) {
        chekczero(123);
       
    }
    
}

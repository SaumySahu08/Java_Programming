public class St {
    public static void main(String[] args) {

       int n=1004;
       String s = String.valueOf(n);
       s=s.replace('0', '5');
       
       //System.out.println(s);
       n=Integer.parseInt(s);
       System.out.println(n);
    }
}

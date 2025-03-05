import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Function2 {

   /*  public static void main(String[] args) {
        Predicate<Integer> isEven = num-> num%2==0;
        Predicate<Integer> isGreater = num-> num>10;
        Predicate<Integer> isPrime = num->{
            for(int i=2;i<=num/2;i++){
                if(num%i==0){
                    return false;
                }
            }
            return true;
        };
        int y=13;
        System.out.println(y+" is Even: "+testPredicate(y, isEven));
        System.out.println(y+" is Greater than 10: "+testPredicate(y, isGreater));
        System.out.println(y+" is Prime: "+testPredicate(y, isPrime));
    }
    public static boolean testPredicate(int x, Predicate<Integer> p){
        return p.test(x);  
    }
        */

       /*  public static void main(String[] args) {
            Consumer<Integer> doubleValue = num-> System.out.println("After doubling the value: "+(num*2));
            Consumer<Integer> increamentBy = num->System.out.println("After incrementing the value by 3: "+(num+3));
            Consumer<Integer> sqr = num->System.out.println("After squaring the value: "+(num*num));
            int x=5;
            System.out.println("original value "+x);
            modifyValue(x, doubleValue);
            modifyValue(x, increamentBy);
            modifyValue(x,sqr);
        }
       public static void modifyValue(int value, Consumer<Integer> c) {
        c.accept(value);       
        

       }  
        */
       /*  public static void main(String[] args) {
            Function<Integer,Integer> add = num-> num+5;
            Function<Integer,Integer> mul = num-> num*2;
            Function<Integer,Integer> sub = num-> num-3;
            int x = 10;
            System.out.println("After adding 5 "+applyFunction(x, add));
            System.out.println("After multiplying by 2: "+applyFunction(x, mul));
            System.out.println("After subtracting 3: "+applyFunction(x, sub));
        }
        public static int applyFunction(int value, Function<Integer,Integer> f) {
            return f.apply(value) ;                       
        }
    */


    public static void main(String[] args) {
        System.out.println("Random number generated: "+generateRandomNumber(100, 200));
    }
    public static int generateRandomNumber(int min,int max) {
        Supplier<Integer> random = ()->{
            Random r = new Random();
            return r.nextInt(min, max);
        };
       return random.get();
    }
}

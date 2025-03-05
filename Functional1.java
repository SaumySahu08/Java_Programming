import java.util.Random;
import java.util.function.*;
public class Functional1 {
    public static void main(String[] args) {
       /*  Predicate<Integer> isEven =  num-> num%2==0;  
        Predicate<Integer> isPrime =  num->
        {
            int c=1;
            for(int i=2;i<=num/2;i++){
                c++;
            }
            return (c==1);
        }  ;
        System.out.println("Number is even :"+isEven.test(3));
        System.out.println("Number is prime :"+isPrime.test(12)); */

       /*  Consumer<String> stringConsumer= str-> System.out.println(str.toUpperCase());
        Consumer<Integer> integerConsumer= num-> System.out.println(num*num);
        stringConsumer.accept("aBbuU");
        integerConsumer.accept(7); */

        /*Supplier<String> str = ()->{
            Random randomint = new Random();
            int r = randomint.nextInt(10000);
            return "NIT"+r;
        };
        int min = 32;
        int max = 100;
        Supplier<Integer> in = ()->{
            Random randomint = new Random();
            Integer r= randomint.nextInt((max-min)+1);
            return r+min;

        };
        System.out.println(str.get());
        System.out.println(in.get());*/

        Function<String,Integer> getStringLength = str-> str.length();
        Function<Integer,Double> divideAndFormat = num-> num/2.0;
        System.out.println(getStringLength.apply("Saumhy"));
        System.out.println(divideAndFormat.apply(18));

    }
}

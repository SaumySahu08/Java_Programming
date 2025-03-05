import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
record Employe(Integer id,String name){

}
public class Day3_27Feb {
    public static void main(String[] args) {
        /*Write a program to process a list of strings. 
        Use a custom predicate to filter strings that start with a vowel and have a length greater than 5.
        */
        Predicate<String> p = new Predicate<String>() {
            @Override
            public boolean test(String t) {
                char c = t.charAt(0);
                if((c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')&& t.length()>5){
                    return true;
                }
                return false;
            };
        };
        List<String> l = Arrays.asList("Ara", "saga","java","loc","applee","entry"  );
        System.out.println(l.stream().filter(p).toList());
        System.out.println("----------------------------");
        /*
         Use Stream.iterate or Stream.generate to create an infinite stream. 
         Then filter and map the data to produce the first 10 odd squares.
         */

         System.out.println(Stream.iterate(0,n->n+1).filter(n->n%2!=0).map(n->n*n).limit(10).toList());
        System.out.println("----------------------------");

        /* 
         Given a list of strings,
          sort them by length first and lexicographically second. Implement this using sorted.
        */
        List<String> ll = Arrays.asList("Ara", "saga","java","loc","applee","entry"  );
        System.out.println(ll.stream().sorted((s1,s2)->Integer.valueOf(s1.length()).compareTo(Integer.valueOf(s2.length()))).toList());
        System.out.println(ll.stream().sorted((s1,s2)->s1.compareTo(s2)).toList());
        System.out.println("----------------------------");
        /*
         Given a list of sentences (Strings), use flatMap to 
         create a list of all unique words in lowercase.
         */
        List<String> sentences = Arrays.asList("Ara is Good girl.","Arav is Bad boy.","Ankit is very Good girl.");
        
        
        //Arrays.asList(l1).stream().flatMap(sent->sent.replaceAll("\\s","")).;
         Set<String> uniqueWordsLowercase = sentences.stream()
                .flatMap(sentence -> Stream.of(sentence.toLowerCase().split("\\s"))) // Split into words, lowercase, stream
                .distinct() // Get unique words
                .collect(Collectors.toSet());
                System.out.println(uniqueWordsLowercase);
        System.out.println("----------------------------");

                /*
                 Implement a method using streams to convert a list of objects (e.g., Employee) 
                 into another list containing only one property of the object (e.g., Employee.name).
                 */

            List<Employe> lEmployes=Arrays.asList(
                new Employe(11, "Saumy"),
                new Employe(11, "Shiva Kumar"),
                new Employe(11, "Kishore"),
                new Employe(11, "Natraj"),
                new Employe(11, "Ravi")
            );

            System.out.println(lEmployes.stream().map(emp->emp.name()).toList());
    }
}

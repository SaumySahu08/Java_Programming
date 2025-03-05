//package Stream;
import java.util.stream.*;
import java.util.*;
record Student(String name, String course){

}
public class Day1_25Feb {
    public static void main(String[] args) {
        // Integer number[]={2,3,4,5,6,7,8,9,10,11};
        // Arrays.stream(number).filter(n->{
        //     boolean f = true;
        //     for(int i=2;i<=n/2;i++){
        //         if(n%i==0){
        //             f=false;
        //             break;
        //         }
        //     }
        //     return f;
        // }).forEach(System.out::println);

/*        Write a Java program that creates a stream of integers using Stream.of, filters out the even numbers and then prints each squared number using forEach.
 Input (Stream):
1, 2, 3, 4, 5, 6, 7, 8, 9, 10*/
System.out.println(Stream.of(1,2,3,4,5,6,7,8,9).filter(n->n%2==0).map(n->n*n).toList());
System.out.println("---------------------");

/* Write a Java program that uses the Stream.of method to create a stream of strings, filters out the empty strings, and then concatenate the remaining strings into a single string..

Input:
A stream of strings ["Hello", "", "World", " ", "from", " ", "Java", "!"].

Output:
A single concatenated string:
HelloWorld from Java!
        
*/
     System.out.println(Stream.of("Hello", "", "World", " ", "from", " ", "Java", "!").collect(Collectors.joining("","[","]")));
     System.out.println("---------------------");


    /*You have a Student record with the following fields:
name : (String)
course : (String)

Create a ELC class StudentFilter.
Given a list of Student objects, where each student is enrolled in different courses, write a Java program to filter out the students who are enrolled in the "Java" course and print their names using the forEach method and the stream API.

Test Case 1:
Input:
List<Student> students =  [("Alice", "Java"),
   ("Bob", "Python"),
   ("Charlie", "Java"),
   ("David", "C++"),
   ("Eve", "JavaScript")]
Expected Output:
Alice
Charlie */
List<Student> students = new ArrayList<>();

System.out.println(Arrays.asList(
    new Student("Alice", "Java"),
new Student("Bob", "Python"),
new Student("Charlie", "Java"),
new Student("David", "C++"),
new Student("Eve", "JavaScript")).stream().filter(s->s.course().equalsIgnoreCase("java")).map(s->s.name()).toList());

System.out.println("---------------------");

        /*Write a Java program that reads an array of integers, filters out the negative numbers, and then calculates the sum of the squares of the remaining positive numbers using streams and the reduce method.

Input:
Input array: [-3, 2, -5, 6, -1, 4]
Output:
Sum of squares of positive numbers: 52 */

System.out.println(Arrays.asList(-3, 2, -5, 6, -1, 4).stream().filter(n->n>=0).map(n->n*n).reduce(0, Integer::sum).toString());

System.out.println("---------------------");



    }
}

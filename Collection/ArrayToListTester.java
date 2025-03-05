import java.util.Arrays;
import java.util.List;

class ArrayToList{
    public static List<String> convertToList(String[] inputArray){
        return Arrays.asList(inputArray);
    }
}


public class ArrayToListTester {
    public static void main(String[] args) {
        String s[] ={"ab","ss","dd"};
       List<String> a= ArrayToList.convertToList(s);
       System.out.println(a);
    }    
}

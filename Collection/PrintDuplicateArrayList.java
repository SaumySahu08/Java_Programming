import java.util.List;
import java.util.Arrays;
import java.util.HashMap;

public class PrintDuplicateArrayList {
  public static void main(String[] args) {
    Integer a[] = { 66, 66, 66, 77, 66 };
    List<Integer> al = Arrays.asList(a);
    HashMap<Integer, Integer> h1 = new HashMap<>();
    if (al.isEmpty()) {
      System.out.println("List is Null");
      return;
    }
    for (int i = 0; i < al.size(); i++) {
      Integer c = al.get(i);
      if (h1.containsKey(c)) {
        h1.put(c, h1.get(c) + 1);
      } else {
        h1.put(c, 1);
      }
    }
    h1.forEach((k, v) -> {
      if (v > 1) {
        System.out.println(k);
      }
    });
  }
}

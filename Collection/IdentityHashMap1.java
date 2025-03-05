import java.util.*;

public class IdentityHashMap1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		IdentityHashMap<String,Integer> h = new IdentityHashMap<>();
        h.put("A", 1);
        h.put("A", 2);
        h.put(new String("A"), 3);
        System.out.println(h);

	}

}
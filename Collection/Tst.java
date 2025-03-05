import java.util.*;
class Tst {
    public static void main(String [] args){
        String s = "swiss";

        LinkedHashMap<String,Integer> n = new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            String c = String.valueOf(s.charAt(i));
            if(n.containsKey(c)==false){
                n.put(c,1);
            }
            else{
                n.put(c,n.get(c)+1);
            }
        }
        //System.out.println(n);
        for(int i=0;i<s.length();i++){
            String s1 = String.valueOf(s.charAt(i));
            if(n.get(s1)==1){
                System.out.println(s1);
                break;
            }
        }
    }
}
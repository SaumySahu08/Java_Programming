
import java.util.*;

public class infi {
  static boolean vow(char ch){
    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
      return true;

    }
    else
    return false;

  }

  

  public static void main(String[] args){
    String s="cg ax uv dm snjc ws a x nkr wdh ofni x bgxod m m r x kus a yap ajil bvmckzgnonlwuz azuvb";
    StringBuilder st= new StringBuilder(s);
    for(int i=0;i<st.length();i++){
        if(i==0&&(st.charAt(i)>=97&&st.charAt(i)<=122)){
            int k=(int) st.charAt(i);
            k=k-32;
            st.setCharAt(i,(char)k);
            
        }
        else if(st.charAt(i)==' '&&(st.charAt(i+1)>=97&&st.charAt(i+1)<=122)){
            int k=(int) st.charAt(i+1);
            k=k-32;
            st.setCharAt(i+1,(char)k);
            
            
        }
    }
    String sr=st.toString();
    System.out.println(sr);
   
   
      }
      
}
    
      

    
     
  

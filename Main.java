import java.util.*;

public class Main {
  
    public static void main(String[] args) {
     int a[]={1,2,3,3};
     
     for(int i=0;i<a.length;i++){
      int s1=0,s2=0;

      for(int j=0;j<a.length;j++){
        if(j<i){
          s1=s1+a[j];
        }        
        else if(j>i){
          s2=s2+a[j];
        }
      }
      if(s1==a[i]&&s2==a[i]){
        System.out.println(a[i]);
      }
     }     

      }
    }
    

  
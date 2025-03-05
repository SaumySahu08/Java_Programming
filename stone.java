
import java.util.*;

public class stone {
  
  
  public static void main(String[] args){
    int a[]={1,2,1,1,3,1};
    int b[]=new int [10];
    int y=0;
    int i=0;
    int j=i+1;
    int f=0;
    
    while(i<a.length-1){
      if(j<a.length){
      if(a[i]==a[j]){
        if(f==0){      
        b[y]=a[i];
        y++;
      }
        f++;
        
        a[j]=0;
        j++;
      }
      else
      j++;
    }
    else{
      i++;
      j=i+1;
      f=0;
    }
      
      }
      for(int h=0;h<y;h++){
        System.out.print(b[h]+" ");
      }

        
      }

    }
    
    
    
    
      
      
      

    
    
      
    
    
    
      
      

    
      

    
     
  

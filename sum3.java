import java.util.*;

public class sum3 {
  
  
  public static void main(String[] args){
    int a[]={-1,0,1,2,-1,-4};
    Arrays.sort(a);
    Set<List<Integer>> b = new HashSet<>();
    int y=0;
    for(int i=0;i<a.length;i++){
      int sum=0;
      int k=0,l=1;
      while(k<=l){
        if(i==0){
          k++;
          l++;

        }
        else if(i==l){
          l++;
        }
        else if(i==k){
          k++;
        }
        if(l>a.length-1||k>a.length-1){
          break;
        }
        sum=a[i]+a[k]+a[l];
        if(sum==0){
          b.add(Arrays.asList(a[i],a[k],a[l]));
          
          k++;
          l++;
        }
        else{
          k++;
          l++;
        }
      }
    }
    System.out.println(b);

  }

}
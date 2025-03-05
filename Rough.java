import java.util.Arrays;

public class Rough {

    public static void main(String[] args) {

        // int a[]={10,20,30,40,50};
        // int n=a.length,k=2,j=0;
        // for(int i=0;i<k;i++){
        //     int x=a[0];
        //     //int l=i;
        //     for(j=0;j<n-1;j++){
        //         a[j]=a[j+1];
        //        // l++;
        //     }
        //     a[j]=x;

        // }
        
        // for(int p=0;p<n;p++){
        //     System.out.println(a[p]);
        // }

        // int a[]={4,2,3,2,1,4,3,4,5};
        // for(int i=0;i<a.length;i++){
        //     if(a[i]==-1){
        //         continue;
        //     }
        //     int c=1;
        //     for(int j=i+1;j<a.length;j++){
                
        //         if(a[i]==a[j]){
        //             c++;
        //             a[j]=-1;
        //         }
        //     }
        //     System.out.println(a[i]+" = "+c);
        // }
    int a[]={1,2,3,4,5};
    int d=3;
    d=d%arr.length;
        reverse(arr,0,arr.length-1);
        reverse(arr,arr.length-d,arr.length-1);
        reverse(arr,0,arr.length-1-d);
    System.out.println(Arrays.toString(a));


}
static void reverse(int[]arr,int start,int end){
    while(start<end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
    }
}
}

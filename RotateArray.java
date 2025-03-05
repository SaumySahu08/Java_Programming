
public class RotateArray {

    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int n=5,k=2;
        for(int i=0;i<2;i++){
            int t = a[n-1];
            for(int j=n-1;j>=1;j--){
                a[j]=a[j-1];
            }
            a[0]=t;
        }
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
    
}

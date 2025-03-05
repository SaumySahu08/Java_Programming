public class binarysearch {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8};
        int l=0;
        int h=a.length-1;
        int k=3;
        

        while(l<h){
            int mid=(l+h)/2;
            if(a[mid]==k){
                System.out.println(mid);
                return;
            }
            else if(a[mid]>k){
                h=mid;
            }
            else{
                l=mid;
            }
            

        }

    }
    
}

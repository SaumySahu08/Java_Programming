public class AreaCakculatorExcp {
    public static double calculateArea(double l, double w){
        if(l<0||w<0){
            throw new IllegalArgumentException();
        }
        return l*w;
    }
    public static void main(String[] args) {
        int a=12,b=-1;
        try{
           System.out.println( "Area of rectangle with length "+a+" and width"+b+" is: "+calculateArea(a,b));
        }
        catch(IllegalArgumentException e){
            System.out.println("IllegalArgumentException caught: Dimensions must be positive: length= "+a+" width= "+b);
        }
    }
}

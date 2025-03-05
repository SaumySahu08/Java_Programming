
class CalculateArea{
    public void calculateArea(int sideLength){
        if(sideLength<0){
            System.out.println("Side length must be non-negative.");
            return;
        }
        System.out.println("area of square = "+(sideLength*sideLength));        
    }
    public void calculateArea(int length,int width){
        if(length<0||width<0){
            System.out.println("Length and width must be non-negative.");
            return;
        }
        System.out.println("area of rectangle = "+(length*width));
    }
    public void calculateArea(double radius){
        if(radius<0){
            System.out.println("radius must be non negative");
            return;
        }
        System.out.println("area of circle = "+(3.1416*radius*radius));
    }
}





public class ShapeCalculator {

    public static void main(String[] args) {
        CalculateArea c = new CalculateArea();
        c.calculateArea(7.0);
        c.calculateArea(-5);
        c.calculateArea(-5,10);
    }
    
}

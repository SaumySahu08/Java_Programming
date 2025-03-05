
class Circle{
    double radius;
    Circle(){
        this.radius=1;
    }
    Circle(double r){
        this.radius=r;
    }
    public double getArea(){
        if(radius<0){
            return -1;
        }
        return 3.14*radius*radius;
    }
}

class Cylinder extends Circle{
    double height;
    Cylinder(){
        super();
        this.height=1;
    }
    Cylinder(double r,double h){
        super(r);
        if(r<=0||h<=0){
            System.out.println("Error");
            System.exit(0);
        }
        this.height=h;

    }
    public double getVolume(){
        if(height<0){
            return -1;
        }
        return 3.14*radius*radius*height;
    }
}

public class CircleTest {
    public static void main(String[] args) {
        Cylinder c= new Cylinder(7.5, 8);
        System.out.println("H"+c.getVolume());
    }
    
}

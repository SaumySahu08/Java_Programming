
class Student{
    protected String name;
    protected int rollNumber;
    Student(String nm,int rol){
        this.name=nm;
        this.rollNumber=rol;
    }
    public void displayDetails(){
        System.out.println("Name = "+name);
        System.out.println("rollNumber = "+rollNumber);
    }
    public double calculatePercentage(){
        return 0;
    }
}
class ScienceStudent extends Student{
    private int phy;
    private int chem;
    private int math;
    

    ScienceStudent(String nm,int rol,int p,int c,int m){
        super(nm, rol);
        if(rol<=0||p<=0||c<=0||m<=0){
            System.out.println("Error");
        System.exit(0);
        }
        this.phy=p;
        this.chem=c;

        this.math=m;
    }
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Physics = "+phy);
        System.out.println("Chem = "+chem);      
        System.out.println("Math = "+math);      
        

    }
    public double calculatePercentage(){
        double v = (double)(phy+chem+math)*100;
        return v/300;

    }
}
class ArtsStudent extends Student{
    private int his;
    private int geo;
    private int eng;

    ArtsStudent(String nm,int rol,int h,int g,int e){
        super(nm, rol);
        if(rol<=0||h<=0||g<=0||e<=0){
            System.err.println("Error");
        System.exit(0);
        }
        this.his=h;
        this.geo=g;
        this.eng=e;
    }
    public void displayDetails(){
        super.displayDetails();
        System.out.println("History = "+his);
        System.out.println("Geology = "+geo);      
        System.out.println("English = "+eng);      
        

    }
    public double calculatePercentage(){
        return (double)((his+geo+eng)*100)/300;

    }
}


public class StTest {
    public static void main(String[] args) {
        ScienceStudent s=new ScienceStudent("Saumy", 10000, 92, 91, 97);
     
        ArtsStudent a = new ArtsStudent("Sachin", 184322, 5, 90, 90);
        
        s.displayDetails();
        System.out.println("Percentage"+s.calculatePercentage());
        a.displayDetails();
        System.out.println("Percentage"+a.calculatePercentage());

        
    }
    
}


class Student{
    int studentId;
    String name;
    double examFee;

    Student(int id,String n,double f){
        this.studentId=id;
        this.name=n;
        this.examFee=f;
    }

    public void  displayDetails(){
        System.out.println("[StudentId = "+studentId+" Name = "+name+" ExamFee = "+examFee+"]"); 

    }
    public double payFee(){
        return 0;
    }
}
class DayScholar extends Student{
    double transportFee;
    DayScholar(int i,String n,double f,double t){
        super(i, n, f)
        this.transportFee=t;
    }
    public void displayDetails(){
        System.out.println("[StudentId = "+studentId+" Name = "+name+" ExamFee = "+examFee+"transportfee"+transportFee+"]");


    }

}
class Hosteller extends Student{
    double hostelFee;
    Hosteller(int i,String n,double f,double h){
        super(i, n, f)
        this.hostelFee=h;
    }
    public void displayDetails(){
        System.out.println("[StudentId = "+studentId+" Name = "+name+" ExamFee = "+examFee+"HostelFee"+hostelFee+"]");


    }
}


public class StudentManagementTest {
    
}

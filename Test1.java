class Student {
   private int sid;
   private String snm;
   private int marks;
   private char grade;

   public Student(int id,String snmm,int marks){
    this.sid=id;
    this.snm=snmm;
    this.marks=marks;
    calculateGrade();
   }
   void calculateGrade(){
    if(marks>90){
        grade='A';
    }
    else if(marks>80&&marks<=90){
        grade='B';
    }
    else if(marks>70&&marks<=80){
        grade='C';
    }
    else if(marks>60&&marks<=70){
        grade='D';
    }
    else if(marks<61){
        grade='E';
    }
   }
   void displaySetails(){
    System.out.println("Sid= "+sid);
    System.out.println("name= "+snm);
    System.out.println("marks= "+marks);
    System.out.println("Graade= "+grade);
   }


    
}
public class Test1{
    public static void main(String[] args) {
        Student s1=new Student(102, "Sahu", 91);
        s1.displaySetails();
    }
}

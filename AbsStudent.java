
abstract class Student{
    protected String studentName;
    protected String studentClass;
    protected static int totalNoOfStudents;
    Student(){
        super();
    }
    Student(String s,String c){
        this.studentName=s;
        this.studentClass=c;
        Student.totalNoOfStudents+=1;
       
    }
    public abstract int getPercentage();
    public static int getTotalNoOfStudents(){
        return totalNoOfStudents;
    }
    

}
class ScienceStudent extends Student{
    
    private int pyMarks;
    private int chMarks;
    private int mathMarks;
    ScienceStudent(String s,String c,int p,int ch,int m){
        super(s, c);
        this. pyMarks=p;
        this.chMarks=ch;
        this.mathMarks=m;
    }

    @Override
    public  int getPercentage(){
        return (pyMarks+chMarks+mathMarks)/3;
    }
    public String toString(){
        return "Name = "+studentName+" class = "+studentClass+" \n"+" percent = "+getPercentage()+"\n";
    }
    

}
class HistoryStudent extends Student{
    private int histMarks;
    private int civicMarks;
    HistoryStudent(String s,String c,int h,int ci){
        super(s, c);
        this.histMarks=h;
        this.civicMarks=ci;
    }
    @Override
    public int getPercentage(){
        return (civicMarks+histMarks)/2;
    }
    public String toString(){
        return "Name = "+studentName+" class = "+studentClass+" \n"+" percent = "+getPercentage()+"\n";
    }
}




public class AbsStudent {
    public static void main(String[] args) {
        ScienceStudent s = new ScienceStudent("Saumy", "12th", 90, 90, 90);
        //s.addStudent();
        System.out.println(s);
        System.out.println();
        ScienceStudent s1 = new ScienceStudent("Sudeep", "12th", 90, 90, 80);
        System.out.println(s1);

        HistoryStudent h = new HistoryStudent("Suraj", "12th", 70, 90);
        System.out.println(h);
        HistoryStudent h1 = new HistoryStudent("Vivek", "12th", 60, 80);
        System.out.println(h1);
        System.out.println("ToStud = "+Student.totalNoOfStudents);




       
        



    }
}

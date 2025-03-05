class Course{
    int courseId;
    String courseName;
    double courseFee;
    Course(int cid,String cnm, double cfe){
        this.courseId=cid;
        this.courseName=cnm;
        this.courseFee=cfe;
    }
    public int getCid(){
        return courseId;
    }
    public String getCnm(){
        return courseName;
    }
    public double getCfee(){
        return courseFee;
    }
    public String toString(){
        return "courseId: "+courseId+" courseName: "+courseName+" courseFee: "+courseFee;
    }
}
class Offer{
    String offerText;
    Offer(String ot){
        this.offerText=ot;
    }
    public String getOfferText(){
        return offerText;
    }
}
class EducationInstitute{
    Course [] courses;
    Offer [] offers;
    EducationInstitute(Course [] c,Offer [] o){
        this.courses=c;
        this.offers=o;
    }
    public Course[] getCourses(){
        return courses;
    }
    public Offer[] getOffers(){
        return offers;
    }

    public void enrollStudentInCourse(int courseId, String studentName){
        System.out.println(studentName+" is enrolled.");
        System.out.println("courseId: "+courseId);
        for (Course course : courses) {
            if(course.getCid()==courseId){
                System.out.println("CourseName: "+course.getCnm());
            }
        }
    }
}
class Student{
    String name;
    EducationInstitute e;
    Student(String s,EducationInstitute e){
        this.name=s;
        this.e=e;
    }
    public void viewCoursesAndFees(){
        for (Course c1 : e.getCourses() ) {
            System.out.println("CourseName: "+c1.getCnm());
            System.out.println("CourseFee: "+c1.getCfee());                        
        }
    }
    public void viewOffers(){
        for (Offer o1 : e.getOffers() ) {
            System.out.println("CourseName: "+o1.getOfferText());
                                    
        }
    }
    public void enrollInCourse(int courseId){
        e.enrollStudentInCourse(courseId,this.name);
    }
}
public class EducationInstituteAppMLT {

    public static void main(String[] args) throws InterruptedException {
        Course []c1 = {new Course(1,"Java",1000),new Course(2, ".Net", 500),new Course(3, "SpringBoot", 2000)};
        Offer [] o1= {new Offer("On java get 10% off"),new Offer("on SpringBoot get 5% off")};
        EducationInstitute e1=new EducationInstitute(c1, o1);
        Student virat= new Student("Virat", e1);
        Student dhoni= new Student("Dhoni", e1);
        Student saumy= new Student("Saumy", e1);
        Runnable r1 = new Runnable() {
            @Override
            public void run(){
                virat.viewCoursesAndFees();
                virat.viewOffers();
                virat.enrollInCourse(1);
                System.out.println("---------------");
            }
        };
        Runnable r2 = new Runnable() {
            @Override
            public void run(){
                dhoni.viewCoursesAndFees();
                dhoni.viewOffers();
                dhoni.enrollInCourse(2);
                System.out.println("---------------");

            }
        };
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        
        Thread t3 = new Thread(){
            public void run(){
                saumy.viewCoursesAndFees();
                saumy.viewOffers();
                saumy.enrollInCourse(3);
                System.out.println("---------------");

            }
        };
        t3.start();
    }
}
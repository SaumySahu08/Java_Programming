
interface Employee {
    public double calculateSalary();  
    public void   generatePayroll();
        
}
class FullTimeEmployee implements Employee{
    private int employeeId;
    private String employeeName;
    private double monthSalary;
    private double benefits;
    FullTimeEmployee(int ei,String en,double ms, double b){
        if(ms<0){
            System.err.println("Error: Monthly salary cannot be negative.");
        }
        else if(en.equals("")){
            System.err.println("Error: Employee name cannot be empty.");
        }
        this.employeeId=ei;
        this.employeeName=en;
        this.monthSalary=ms;
        this.benefits=b;
    }
    @Override
    public double calculateSalary(){
        return (monthSalary+benefits);
    }
    public void generatePayroll(){
        System.out.println("Salary is: "+calculateSalary());
    }

}






public class AbsEmployee {
    public static void main(String[] args) {
        FullTimeEmployee f = new FullTimeEmployee(12, "Saumy", 15000, 1000);
        f.generatePayroll();
    }
}

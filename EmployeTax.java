
import java.util.*;
class Employee{
    int id;
    String name;
    double basicSalary;
    double HRAPer;
    double DAPer;
    Employee(int id,String n,double bs,double hp,double dp){
        if(bs<0){
            System.err.println("Error: Salary components must be non-negative.");
            System.exit(0);
        }
        this.id=id;
        this.name=n;
        this.basicSalary=bs;
        this.HRAPer=hp;
        this.DAPer=dp;
    }
    public double calculateGrossSalary(){
        return (basicSalary+HRAPer+DAPer);
    }
}
class Manager{
    int id;
    String name;
    double basicSalary;
    double HRAPer;
    double DAPer;
    double  projectAllowance;
    Manager(int id,String n,double bs,double hp,double dp,double pa){
        if(bs<0){
            System.err.println("Error: Salary components must be non-negative.");
            System.exit(0);
        }
        this.id =id;
        this.name=n;
        this.basicSalary=bs;
        this.HRAPer=hp;
        this.DAPer=dp;
        this.projectAllowance=pa;
    }
    public double calculateGrossSalary(){
        return (basicSalary+HRAPer+DAPer+projectAllowance);
    }
}

class Trainer{
    int id;
    String name;
    double basicSalary;
    double HRAPer;
    double DAPer;
    int batchCount;
    double  perkPerBatch;

    Trainer(int id,String n,double bs,double hp,double dp,int bc,double pp){
        if(bs<0){
            System.err.println("Error: Salary components must be non-negative.");
            System.exit(0);
        }
        this.id =id;
        this.name=n;
        this.basicSalary=bs;
        this.HRAPer=hp;
        this.DAPer=dp;
        this.batchCount=bc;
        this.perkPerBatch=pp;
    }
    public double calculateGrossSalary(){
        return (basicSalary+HRAPer+DAPer+(batchCount*perkPerBatch));
    }

}
class Sourcing{
    int id;
    String name;
    double basicSalary;
    double HRAPer;
    double DAPer;
    int enrollmentTarget;
    int enrollmentReached;
    double perkPerEnrollment;
    Sourcing(int id,String n,double bs,double hp,double dp,int et,int em,double pe){
        if(bs<0){
            System.err.println("Error: Salary components must be non-negative.");
            System.exit(0);
        }
        this.id =id;
        this.name=n;
        this.basicSalary=bs;
        this.HRAPer=hp;
        this.DAPer=dp;
        this.enrollmentTarget=et;
        this.enrollmentReached=em;
        this.perkPerEnrollment=pe;
    }

    public double calculateGrossSalary(){
        return (basicSalary+HRAPer+DAPer+((enrollmentReached/enrollmentTarget)*100)*perkPerEnrollment);
    }

}
class TaxUtil{
    public double calculateTax(Employee e){
        double g=e.calculateGrossSalary();
        if(g>30000){
            double r=g*20;
            return r/100;
        }
        else {
            double r = g*5;
            return r/100;
        }
    }
    public double calculateTax(Manager e){
        double g=e.calculateGrossSalary();
        if(g>30000){
            double r=g*20;
            return r/100;
        }
        else {
            double r = g*5;
            return r/100;
        }
    }
    public double calculateTax(Trainer e){
        double g=e.calculateGrossSalary();
        if(g>30000){
            double r=g*20;
            return r/100;
        }
        else {
            double r = g*5;
            return r/100;
        }
    }
    public double calculateTax(Sourcing e){
        double g=e.calculateGrossSalary();
        if(g>30000){
            double r=g*20;
            return r/100;
        }
        else {
            double r = g*5;
            return r/100;
        }
    }

}




public class EmployeTax{
    public static void main(String[] args) {
        Employee e1 = new Employee(123, "Suraj j2", 22000.0, 500, 500);
        TaxUtil t = new TaxUtil();
        System.out.println("basic salary = "+e1.basicSalary);
        System.out.println("Tax = "+t.calculateTax(e1));
    }
}
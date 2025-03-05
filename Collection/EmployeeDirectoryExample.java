import java.util.ArrayList;
import java.util.Scanner;

class  Employee {
    String name;
    String position;
    double salary;
    Employee(String name, String position, double salary){
        this.name=name;
        this.position=position;
        this.salary=salary;
    }

    public String getName(){
        return name;
    }
    public String getPosition(){
        return position;
    }
    public double getSalary(){
        return salary;
    }
    public void setName(String s){
        this.name=s;
    }
    public void setPosition(String s){
        this.position=s;
    }
    public void setSalary(double s){
        this.salary=s;
    }



    public String toString(){
        return "Name: "+name+"\nposition: "+position+"\nsalary: "+salary;
    }

}

class Directory {
    ArrayList<Employee> employees;

    Directory() {
        this.employees = new ArrayList<Employee>();
    }

    public void addEmployee(Employee emp){
        this.employees.add(emp);
    }

    public void displayAllEmployees(){
        employees.forEach(emp->System.out.println(emp));
    }

    public void updateEmployee(int index){
        Scanner s = new Scanner(System.in);
        System.out.println("which info you want to update of"+this.employees.get(index).name+" employee");
        System.out.println("Options:\n"+"\t1.Name\n"+"\t2.Position\n"+"\t3.Salary");
        System.out.println("Enter a choice");
        int c = s.nextInt();
        s.nextLine();
        
        switch(c){
            case 1:System.out.println("Enter Name...");
            this.employees.get(index).setName(s.nextLine());
             
            break;
            case 2:System.out.println("Enter Position...");
            this.employees.get(index).setPosition(s.nextLine());
            
            break;
            case 3:System.out.println("Enter Salary...");
            this.employees.get(index).setSalary(s.nextDouble());
            break;
            default: System.out.println("Invalid Choice...");
        }

    }
    public void deleteEmployee(int index){
        this.employees.remove(index);
    }
}

public class EmployeeDirectoryExample {
    public static void main(String[] args) {
        Employee e1 = new Employee("Alice", "SE", 2000);
        Employee e2 = new Employee("Bob", "TE", 1000);
        Directory d1 = new Directory();
        d1.addEmployee(e1);
        d1.addEmployee(e2);
        d1.displayAllEmployees();
        d1.updateEmployee(1);
        //d1.deleteEmployee(0);
        d1.displayAllEmployees();


    }
}

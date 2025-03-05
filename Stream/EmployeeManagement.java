//package Stream;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

record Employee(String name, String gender, String department, String salary, Integer years_of_experience) {

}

public class EmployeeManagement {

    static List<Employee> list = new ArrayList<>();
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        while(true){
            System.out.println("Enter choice:\n1. Add Employee\n2. Update Employee\n3. Remove Employee\n4. List All Employees\n5. Sort Employees by Name\n6. Find Highest Salary by Department\n7. Categorize and Increase Salary\n8. Exit\n");
int c = Integer.parseInt(s.nextLine());
switch(c){
    case 1:
    addEmployee();
    break;
    case 2:
    updateEmployee();
    break;
    case 3:
    removeEmployee();
    break;
    case 4:
    listAllEmployee();
    break;
    case 5:
    sortEmployeesbyName();
    break;
    case 6:
    findHighestSalaryByDepartment();
    break;
    case 7:

    break;
    case 8:System.out.println("Exiting...");
    System.exit(0);

    break;
}

        }
    }

    public static void addEmployee() {
        System.out.println("Enter name:");
        String n = s.nextLine();
        System.out.println("Enter Gender:");
        String g = s.nextLine();
        System.out.println("Enter Department:");
        String d = s.nextLine();
        System.out.println("Enter Salary:");
        String sal = s.nextLine();
        try {
            Double.parseDouble(sal);
            System.out.println("Enter Years of Exp:");
            int y = Integer.parseInt(s.nextLine());
            if (y >= 0) {
                list.add(new Employee(n, g, d, sal, y));
                System.out.println("Employee Added Successfully.");
            } else
                System.out.println("Error: Years of experience cannot be negative.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.toString() + " Salary and year of experience should be numeric only!");
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }

    public static void updateEmployee() {
        System.out.println("Enter index of employee to update:");
        try {
            int i = Integer.parseInt(s.nextLine());
            list.get(i);

            System.out.println("Enter name:");
            String n = s.nextLine();
            System.out.println("Enter Gender:");
            String g = s.nextLine();
            System.out.println("Enter Department:");
            String d = s.nextLine();
            System.out.println("Enter Salary:");
            String sal = s.nextLine();
            try {
                Double.parseDouble(sal);
                System.out.println("Enter Years of Exp:");

                int y = Integer.parseInt(s.nextLine());
                if (y >= 0) {
                    list.set(i, new Employee(n, g, d, sal, y));
                    System.out.println("Employee Updated Successfully.");

                } else
                    System.out.println("Error: Years of experience cannot be negative.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.toString() + " Salary and year of experience should be numeric only!");
            }

        } catch (IllegalArgumentException e) {
            System.out.println(e.toString() + " index should be numeric.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.toString() + " Error: Employee not found.");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static void removeEmployee() {
        System.out.println("Enter index of Employee to remove:");
        try {
            int i = Integer.parseInt(s.nextLine());

            list.remove(i);
            System.out.println("Employee removed...");
        } catch (IllegalArgumentException e) {
            System.out.println(e.toString() + " index should be numeric.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.toString() + " Error: Employee not found.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void listAllEmployee() {
        if (!(list.isEmpty()))
            list.stream().forEach(System.out::println);
        else
            System.out.println("Error: List is Empty.");
    }

    public static void sortEmployeesbyName() {
        if (!(list.isEmpty()))
            list.stream().sorted((e1, e2) -> e1.name().compareTo(e2.name())).forEach(System.out::println);
        else
            System.out.println("Error: List is Empty.");
    }

    public static void findHighestSalaryByDepartment(){
        Map<String, Employee> highestSalaryByDepartment = list.stream()
        .collect(Collectors.toMap(
            Employee::department,
            emp -> emp,
            (emp1, emp2) -> Integer.parseInt(emp1.salary()) > Integer.parseInt(emp2.salary()) ? emp1 : emp2
        ));

    // Print the highest salary employee in each department
    highestSalaryByDepartment.forEach((department, employee) -> 
        System.out.println("Department: " + department + ", Employee: " + employee));
}

}
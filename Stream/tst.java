import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;



public class tst
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee(111, "Raj", 23789.89, new Department(1, "IT"));
		Employee e2 = new Employee(222, "Rahul", 23789.89, new Department(1, "IT"));
		Employee e3 = new Employee(333, "Scott", 23789.89, new Department(2, "Sales"));
		Employee e4 = new Employee(444, "Smith", 23789.89, new Department(2, "Sales"));
		Employee e5 = new Employee(333, "Virat", 23789.89, new Department(3, "HR"));
		Employee e6 = new Employee(444, "Rohit", 23789.89, new Department(3, "HR"));
			
		
		//Stream<Employee> streamOfEmp = ;		
		
		Map<Department, List<Employee>> deptWiseEmp = Stream.of(e1,e2,e3,e4,e5,e6).collect(Collectors.groupingBy(Employee::dept));
		
		deptWiseEmp.forEach((dep, emps)-> System.out.println(dep+" : "+emps));
		
	}

}
record Employee(Integer empId, String empName, double salary, Department dept)
{
	//111 , "A", 23890.89, new Department(1,"IT");
}
record Department(Integer deptId, String deptName)
{	
}


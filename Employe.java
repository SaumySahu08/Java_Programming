
class Address{
    private String cityName;
    private String districtName;
    private String stateName;
    Address(String cn,String dn, String sn){
        this.cityName=cn;
        this.districtName=dn;
        this.stateName=sn;
    }
    @Override
    public String toString(){
        return " CityName = "+cityName+" DistrictName = "+districtName+" StateName = "+stateName;

    }
}
class Employee{
    private int empId;
    private String empName;
    private Address address;
    Employee(int e, String en,Address a){
        this.empId=e;
        this.empName=en;
        this.address=a;
    }
    @Override
    public String toString(){
        return "EmpId = "+empId+" EmpName = "+empName+" "+address;
    }
}






public class Employe {
    public static void main(String[] args) {
        Address a = new Address("Bhopal", "Bhopal", "MP");
        Employee e = new Employee(123, "Saumy", a);
        System.out.println(e);
    }
    
}

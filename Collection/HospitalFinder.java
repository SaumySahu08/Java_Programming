import java.util.ArrayList;
import java.util.HashMap;

class Hospital {
    private static int hsCode=100;
    private  int hospitalCode = 100;
    private String hospitalName;
    private ArrayList<String> listOfTreatments;
    private String contactPerson;
    private String contactNumber;
    private String location;

    public Hospital(String hospitalName, ArrayList<String> listOfTreatments,
        String contactPerson, String contactNumber, String location) {
        this.hospitalCode=hsCode++;
        this.hospitalName = hospitalName;
        this.listOfTreatments = listOfTreatments;
        this.contactPerson = contactPerson;
        this.contactNumber = contactNumber;
        this.location = location;
    }

    public  int getHospitalCode() {
        return hospitalCode;
    }

    // Static setter for hospitalCode
    public  void setHospitalCode(int hospitalCode) {
        this.hospitalCode = hospitalCode;
    }

    // Getter for hospitalName
    public String getHospitalName() {
        return hospitalName;
    }

    // Setter for hospitalName
    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    // Setter for contactPerson
    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    // Getter for location
    public String getLocation() {
        return location;
    }

    // Setter for location
    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Hospital [hospitalCode=" + hospitalCode +
                ", hospitalName=" + hospitalName +
                ", listOfTreatments=" + listOfTreatments +
                ", contactPerson=" + contactPerson +
                ", contactNumber=" + contactNumber +
                ", location=" + location + "]";
    }
}

class HospitalService{
    ArrayList<Hospital> hospitals;
    HashMap<Integer,String> hoMap;
    HospitalService(){
        hospitals=new ArrayList<>();
        hoMap=new HashMap<>();
    }
    public int addHospital(String hospitalName, ArrayList<String> listOfTreatments,
    String contactPerson, String contactNumber, String location){
        Hospital h1 = new Hospital(hospitalName,listOfTreatments,contactPerson,contactNumber,location);
        hospitals.add(h1);
        hoMap.put(h1.getHospitalCode(), h1.getHospitalName());
        return h1.getHospitalCode();

    }
    public void getHospitals(){
        hoMap.forEach((key, value) -> System.out.println("HospitalCode: " + key + ", Name: " + value));
    }
    public Hospital getHospitalDetails(int hospitalCode){
        for (Hospital hospital : hospitals) {
            if(hospitalCode==hospital.getHospitalCode()){
                return hospital;
            }
        }
        return null;
    }
}

public class HospitalFinder {
    public static void main(String[] args) {
        ArrayList<String> treatMents=new ArrayList<>();
        treatMents.add("Cardiac");
        treatMents.add("ENT");
        treatMents.add("Ortho");
        treatMents.add("Pediatric");
        treatMents.add("Gastro");
        
        HospitalService h = new HospitalService();
        h.addHospital("YASHODA", treatMents, "METHEW", "8468924", "Sec");
        h.addHospital("Aster", treatMents, "Maipathi", "6423453", "Ampt");
        h.getHospitals();


    }
}

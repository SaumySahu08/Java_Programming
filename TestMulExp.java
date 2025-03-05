class ParentClass{
    
    public void loadingClass(String clLoad)throws ClassNotFoundException{
        Class c1;
       
        c1=Class.forName(clLoad);
        System.out.println("ClassLoad Successfully ");
       
    }
}

class ChildClass extends ParentClass{
    
    @Override
    public void loadingClass(String clLoad){
        try{
        if(clLoad==null||clLoad.isEmpty()){
            throw new IllegalArgumentException("Class name cannot be empty");
        }
        
            super.loadingClass(clLoad);
        
    }
    catch(ClassNotFoundException e){
        System.out.println("Error loading class in ChildClass. Converting to unchecked exception.");
        throw new RuntimeException(" RuntimeException from ChildClass");
    }
    }
}





public class TestMulExp {
    public static void main(String[] args) {
        ChildClass c = new ChildClass();
        try{
        c.loadingClass("Car");
        }
        catch(IllegalArgumentException e){
            System.out.println("Exception caught: Class name cannot be empty");
        }
        catch(RuntimeException e){
            System.out.println("Exception caught: Unchecked Exception:"+e.getMessage());
        }

    }
}

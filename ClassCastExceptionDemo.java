public class ClassCastExceptionDemo {
    
    public static void handleClassCastException(){
        Object o []={"Saumy","Hello",123};
        for (Object obj : o) {
            try{
                String s = (String) obj;
                System.out.println(s);
            } 
            catch(ClassCastException e){
                System.out.println("ClassCastException: Cannot cast ");
                e.printStackTrace();
            }           
        }
    }
    public static void main(String[] args) {
        handleClassCastException();
    }

}

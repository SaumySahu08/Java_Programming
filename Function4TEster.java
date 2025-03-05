import java.util.Scanner;
import java.util.function.UnaryOperator;

class ClassRoom implements UnaryOperator{
    private int chairs;
    ClassRoom(int c){
        this.chairs=c;
    }
    public int getChairs(){
        return this.chairs;
    }
    public void setChairs(int c){
        this.chairs=c;
    }
    public String toString(){
        return "Chairs: "+chairs;
    }
    
    public static UnaryOperator<ClassRoom> adjustChairs(ClassRoom cla){
        cla.setChairs(70);
        UnaryOperator<ClassRoom> ul= (c)->{
            return c;
        };
        return (UnaryOperator<ClassRoom>) ul.apply(cla);
        
        

    }
}


public class Function4TEster {
    public static void main(String[] args) {
        ClassRoom c1 = new ClassRoom(100);
        System.out.println(c1);
        System.out.println();
        ClassRoom c1=ClassRoom.adjustChairs(c1);
        System.out.println(c1);

    }
}

class CalculationBase{
    int num1;
    int num2;
    CalculationBase(int n1,int n2){
        this.num1=n1;
        this.num2=n2;
    }
    public void performCalculation(){
        System.out.println("sum = "+(num1+num2));
    }
}
class AdvanceCalculation extends CalculationBase{
    double additionalNum;
    String operation;
    AdvanceCalculation(int n1,int n2,double a,String o){
        super(n1,n2);
        this.additionalNum=a;
        this.operation=o;
    }

    public void performAdvancedCalculation(){

        double d= Double.parseDouble(operation);
        System.out.println((d+additionalNum+num1+num2));



    }

    




}










public class CalculationBaseTester{

    public static void main(String arg[]){

        AdvanceCalculation a = new AdvanceCalculation(1,2,3,"2");
        a.performCalculation();
        a.performAdvancedCalculation();

    }

}
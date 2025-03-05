
abstract class Food{
    double protiens;
    double fats;
    double carbs;
    double tastyScore;
    abstract public void getMacroNutrients ();
}

class Egg extends Food{
    double protiens;
    double fats;
    double carbs;
    int tastyScore;
    String type;
    Egg(double p,double f,double c){
        this.protiens=p;
        this.fats=f;
        this.carbs=c;
        this.tastyScore=7;
        this.type="non-vegetarian";
    }
    @Override
    public void getMacroNutrients(){
        System.out.println("An Egg has "+this.protiens +" gms of protiens"+", "+this.fats+" gms of fats and "+this.carbs+" gms of carbs");
    }
}
class Bread extends Food{
    double protiens;
    double fats;
    double carbs;
    int tastyScore;
    String type;
    Bread(double p, double f, double c){
        this.protiens=p;
        this.fats=f;
        this.carbs=c;
        this.tastyScore=8;
        this.type="vegetarian";
    }
    @Override
    public void getMacroNutrients(){
        System.out.println("A slice of Bread has "+this.protiens +" gms of protiens"+", "+this.fats+" gms of fats and "+this.carbs+" gms of carbs");
    }
}






public class TestingFood {
    public static void main(String[] args) {
      Bread b = new  Bread(4.0, 1.1, 12.8)  ;
      b.getMacroNutrients();
    }
}

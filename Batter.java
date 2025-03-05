class Batter1 {
    private String name;
    private int runs;
    private int matches;
    private float batting_avg;

    
    public void batterDetails(String nm,int r,int m ){
        if(r<0||m<0){
            System.out.println("ERROR1");
            return;
        }
        this.name=nm;
        this.runs=r;
        this.matches=m;
    }
    public void computeBattingAverage(){
        if(matches==0&&runs>0){
            System.out.println("ERROR2");
            return;
        }
        this.batting_avg=(float)runs/matches;
        System.out.println("batting average = "+batting_avg);

    }

}

public class Batter {

    public static void main(String[] args) {
        Batter1 b = new Batter1();
        b.batterDetails("Sachin", 18000, 463);
        b.computeBattingAverage();
    }
}
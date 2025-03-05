class Bowler1 {
    private String name;
    private int wickets;
    
    private int matches;
    private int balls_bowled;
    private int runs_conceded;

    public void bowlerDetails(String nm,int w,int m,int b,int r){
        if(w<0||m<0||b<0||r<0){
            System.out.println("ERROR1");
            return;
        }
        this.name=nm;
        this.wickets=w;
        this.matches=m;
        this.balls_bowled=b;
        this.runs_conceded=r;

    }
    public void computeBowlingAverage(){
        if(matches==0&&runs_conceded>0||matches==0&&balls_bowled>0){
            System.out.println("ERROR2");
            return;
        }
        System.out.println(name);
        System.out.println("bowling_avg = "+((double)runs_conceded/wickets));
    }
    
}

public class Bowler {

    public static void main(String[] args) {
        Bowler1 b = new Bowler1();
        b.bowlerDetails("Sachin", 10, 5, 750, 463);
        b.computeBowlingAverage();
    }
}
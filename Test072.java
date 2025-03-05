class Cricket{
    String matchType;
    boolean isDayMatch;
    Cricket(String m,boolean is){
        this.matchType=m;
        this.isDayMatch=is;
    }
    public Cricket getMatchDetails(){
        System.out.println("Preparing for a generic cricket match");

        System.out.println("Match Type: Generic Match");
        System.out.println("Day Match: Yes");
        return new Cricket(matchType, isDayMatch);
    }

}
class TestMatch extends Cricket{
    TestMatch(String m,boolean is){
        super(m, is);
    }
    @Override
    public TestMatch getMatchDetails() {
        System.out.println("Preparing for a "+matchType);
        System.out.println("Match duration: 5 days. No restrictions on overs.");
        if(isDayMatch==true){
            System.out.println("Day Match: Yes");
        }
        else{
            System.out.println("Day Match: No");

        }
        return new TestMatch(matchType, isDayMatch);
    }
}
class ODIMatch extends Cricket{
    ODIMatch(String m,boolean is){
        super(m, is);
    }
    @Override
    public ODIMatch getMatchDetails() {
        System.out.println("Preparing for a "+matchType);
        System.out.println("Match duration: 50 overs per side.");
        if(isDayMatch==true){
            System.out.println("Day Match: Yes");
        }
        else{
            System.out.println("Day Match: No");

        }
        return new ODIMatch(matchType, isDayMatch);
    }
    
}

class T20Match extends Cricket{
    T20Match(String m,boolean is){
        super(m, is);
    }
    @Override
    public T20Match getMatchDetails() {
        System.out.println("Preparing for a "+matchType);
        System.out.println("Match duration: 20 overs per side. High-intensity game.");
        if(isDayMatch==true){
            System.out.println("Day Match: Yes");
        }
        else{
            System.out.println("Day Match: No");

        }
        return new T20Match(matchType, isDayMatch);
    }

}





public class Test072 {
    public static void main(String[] args) {
        Cricket c=new Cricket("Generic", true);
        c.getMatchDetails();
        System.out.println();
        TestMatch t = new TestMatch("TestMatch", false);
        t.getMatchDetails();
        System.out.println();
        ODIMatch o = new ODIMatch("ODIMatch", true);
        o.getMatchDetails();
        System.out.println();
        T20Match t2=new T20Match("T20 Match", true);
        t2.getMatchDetails();
    }
}

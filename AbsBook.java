abstract class Book{
    String title;
    public abstract void setTitle(String t);
    public abstract String getTitle();
}
class MyBook extends Book{
    @Override
    public void setTitle(String s){
        super.title=s;
    }
    @Override
    public String getTitle(){
        return "The title of my book is: "+super.title;
    }

}



public class AbsBook {
    public static void main(String[] args) {
        MyBook m = new MyBook();
        m.setTitle("A tale of Naruto Uzumaki");
        System.out.println(m.getTitle());
    }
}

import java.util.Scanner;

interface  MediaPlayer {
    void play();
    void stop();
    
}
interface AdvancedmediaPlayer extends MediaPlayer {
    void pause();
    
}
class MusicPlayer implements AdvancedmediaPlayer{
    @Override
    public void play() {
        System.out.print("Music Play");
    }; 
    @Override
    public void stop() {
        System.out.print("Music Stop");
    };
    @Override
    public void pause() {
        System.out.print("Music Pause");
    };

}
class VideoPlayer implements AdvancedmediaPlayer{
    @Override
    public void play() {
        System.out.print("Vide Play");
    }; 
    @Override
    public void stop() {
        System.out.print("Vide Stop");
    };
    @Override
    public void pause() {
        System.out.print("Video Pause");
    };
}

public class InterMediaPlayer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Song Title: ");
        String s = sc.nextLine();
        if(s.equals("")||s.equals(" ")||s.equals("  ")){
            System.out.println("Title is not be empty string.");

        }
        else{
            MusicPlayer m = new MusicPlayer();
            m.play(); System.out.println(" "+s);
            m.pause(); System.out.println(" "+s);
            m.stop(); System.out.println(" "+s);
        }
        
    }
}

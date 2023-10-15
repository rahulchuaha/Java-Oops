import java.util.*;

class youtubeVideo{
    String song;
    String artist;
    int view;
    int like;
    int release;
    int n;
    ArrayList<String> comments;
}
class shortvedio extends youtubeVideo{
    int time;
    int impression;
    shortvedio(String song, String artist, int view, int like, int release, int n, ArrayList<String> comments, int time, int impression){
        this.song = song;
        this.artist = artist;
        this.view = view;
        this.like = like;
        this.release = release;
        this.n = n;
        this.comments = comments;
        this.time = time;
        this.impression = impression;
    }
    public void printValue(){
        System.out.println(song);
        System.out.println(artist);
        System.out.println(view);
        System.out.println(like);
        System.out.println(release);
        System.out.print(n);
        for(String val : comments){
            System.out.println(val);
        }
        
        System.out.println(time);
        System.out.println(impression);
    }
}
public class Inheritance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String song = sc.nextLine();
        String artist = sc.nextLine();
        int view = sc.nextInt();
        int like = sc.nextInt();
        int release = sc.nextInt();
        int n = sc.nextInt();
        ArrayList<String> comments = new ArrayList<>();
        for(int i=0; i<=n; i++){
            String str = sc.nextLine();
            if(str.equals(" ") == false) comments.add(str);
        }
        int time = sc.nextInt();
        int impression = sc.nextInt();
        shortvedio s1 = new shortvedio(song, artist, view, like, release, n, comments, time, impression);
        s1.printValue();
    }
}
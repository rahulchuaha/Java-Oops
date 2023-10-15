import java.util.*;

class youtubeVideo{
    String song;
    String artist;
    int view;
    int like;
    int release;
    int n;
    ArrayList<String> comments;
    
    youtubeVideo(int view, int like){
        this.view = view;
        this.like = like;
    }
    
    public void add(int x){
        
        this.view += x;
        System.out.println("Views are added");
        System.out.println(this.view);
        System.out.println(this.like);
    }
    public void add(int x, int y){
        this.view += x;
        this.like += y;
        System.out.println("Views and likes are added");
        System.out.println(this.view);
        System.out.println(this.like);
    }
}
public class MethodeOveriding {

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
            String ans = sc.nextLine();
            if(ans.equals(" ") == false) comments.add(ans);
        }
        int k = sc.nextInt();
        if(k == 1){
            int x = sc.nextInt();
            youtubeVideo y1 = new youtubeVideo(view, like);
            y1.add(x);
        } else if(k == 2){
            int x = sc.nextInt();
            int y = sc.nextInt();
            youtubeVideo y2 = new youtubeVideo(view, like);
            y2.add(x , y);
        }
    }
}
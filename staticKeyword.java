 import java.util.*;

class YoutubeVideo {
    private static int totalVideos = 0;

    private String song;
    private String artist;
    private int views;
    private int likes;
    private int releasedYear;
    private int n;
    private ArrayList<String> comments;

    public YoutubeVideo(String song, String artist, int views, int likes, int releasedYear, ArrayList<String> comments) {
        this.song = song;
        this.artist = artist;
        this.views = views;
        this.likes = likes;
        this.releasedYear = releasedYear;
        this.comments = comments;
        this.n = comments.size();

        totalVideos++;
    }

    public static int getTotalVideos() {
        return totalVideos;
    }

    public void readDataFromInput(Scanner scanner) {
        song = scanner.nextLine();
        artist = scanner.nextLine();
        views = scanner.nextInt();
        likes = scanner.nextInt();
        releasedYear = scanner.nextInt();
        n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after n

        comments = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            comments.add(scanner.nextLine());
        }
    }
}

public class staticKeyword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after x

        for (int i = 0; i < x; i++) {
            YoutubeVideo video = new YoutubeVideo("", "", 0, 0, 0, new ArrayList<>());
            video.readDataFromInput(scanner);
        }

        System.out.println(YoutubeVideo.getTotalVideos());
 
    }
}
import java.util.*;

class Instainf {
    String name;
    int totalPosts;
    int totalReels;
    boolean blueTick;
    int followers;
    int following;
    String category;
    String gender;

    public Instainf(String name, int totalPosts, int totalReels, boolean blueTick, int followers,
                               int following, String category, String gender) {
        this.name = name;
        this.totalPosts = totalPosts;
        this.totalReels = totalReels;
        this.blueTick = blueTick;
        this.followers = followers;
        this.following = following;
        this.category = category;
        this.gender = gender;
    }

    public void printDetails() {
        System.out.println( name);
        System.out.println( totalPosts);
        System.out.println(totalReels);
        System.out.println((blueTick ? "Yes" : "No"));
        System.out.println( followers);
        System.out.println(following);
        System.out.println( category);
        System.out.println( gender);
    }
}

public class ClassAndObject {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
                Instainf raftaar = new Instainf("Raftaar", 340, 400, true, 7, 200, "Rapper", "M");
        Instainf rachelGupta = new Instainf("Rachel Gupta", 550, 350, true, 15, 10, "Artist", "M");
        Instainf nikhilChinapa = new Instainf("Nikhil Chinapa", 500, 220, true, 5, 210, "VJ", "M");
        Instainf baseerBob = new Instainf("Baseer", 500, 120, false, 2, 230, "VJ", "M");

        raftaar.printDetails();
        rachelGupta.printDetails();
        nikhilChinapa.printDetails();
        baseerBob.printDetails();
    }
}

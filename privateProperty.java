import java.util.*;

class Movie{
    String name;
    int rating;
    int money;
    int profit;
    String actor;
    String actress;
    private int view;
    private int like;
    
    Movie(String name, int rating, int money, int profit, String actor, String actress, int view, int like){
        this.name = name;
        this.rating = rating;
        this.money = money;
        this.profit = profit;
        this.actor = actor;
        this.actress = actress;
        this.view = view;
        this.like = like;
    }
    
    public int displayView(){
         //System.out.println(view);
        return view;
    }
    public int displayLike(){
        //System.out.println(like);
        return like;
    }
    public void printObject(){
        //System.out.println(this.name);
        System.out.println(this.rating);
        System.out.println(this.money);
        System.out.println(this.profit);
        System.out.println(this.actor);
        System.out.println(this.actress);
    }
    
}
public class privateProperty {

    public static void main(String[] args) {
        Movie m1 = new Movie("Superman 1", 8, 90000, 1000, "Rachel Gupta and Prince Narula", "Aarushi", 10000, 500);
        m1.printObject();
        System.out.println(m1.displayView());
        System.out.println(m1.displayLike());
    }
}
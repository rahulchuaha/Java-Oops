import java.util.*;

class Movie{
    String name;
    int rating;
    int money;
    int profit;
    String actor;
    String actress;
    Movie(String name, int rating, int money, int profit, String actor, String actress){
        this.name = name;
        this.rating = rating;
        this.money = money;
        this.profit = profit;
        this.actor = actor;
        this.actress = actress;
    }
    void propDisplay(){
        System.out.println(this.name);
        System.out.println(this.rating);
        System.out.println(this.money);
        System.out.println(this.profit);
        System.out.println(this.actor);
        System.out.println(this.actress);
}
}
public class Function {

    public static void main(String[] args) {
       Movie m1 = new Movie("Batman 1", 8, 200000, 5000, "Rachel Gupta & Nikhil Chinapa", "Disha");
        
        Movie m2 = new Movie("Batman 2", 9, 500000, 8000, "Rannvijay Singha & Prince Narula", "Neha Dhupia");
        
        Movie m3 = new Movie("Batman 3", 10, 700000, 6000, "Rachel Gupta & Prince Narula", "Neha Dhupia");
        m1.propDisplay();
        m2.propDisplay();
        m3.propDisplay();
    }
}
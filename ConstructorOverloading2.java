import java.util.*;


class Movie{
    String name;
    int rating;
    int money;
    int profit;
    String actor;
    String actress;
    
    Movie(int rating, int money, int profit, String actor, String actress){
        this.rating = rating;
        this.money = money;
        this.profit = profit;
        this.actor = actor;
        this.actress = actress;
            
        System.out.println("Lead actor has the main role.");
    }
    Movie(String actress, String actor, int rating, int money, int profit){
        this.actress = actress;
        this.actor = actor;
        this.rating = rating;
        this.money = money;
        this.profit = profit;
        System.out.println("Lead actress has the main role.");
    }
}
public class ConstructorOverloading2 {

    public static void main(String[] args) {
        Movie m1 = new Movie(8, 900000, 8000, "Rachel Gupta", "Disha");
        Movie m2 = new Movie("Vaani Gupta", "Prince Narula", 9, 1900000, 28000);
    }
}
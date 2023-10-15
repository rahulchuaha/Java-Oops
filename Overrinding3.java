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
    public void displayRating(){
        System.out.println(rating);
        System.out.println("This is the function of movies class.");
    }
}
class commercialMovie extends Movie{
    int view;
    int likes;
     commercialMovie(String name, int rating, int money, int profit, String actor, String actress, int view, int likes){
          
         super(name, rating, money, profit, actor, actress);
         this.view = view;
         this.likes = likes;
         
     }
    public void displayRating(){
        System.out.println(rating);
        System.out.println("This is the function of the commercial movies class.");
    }
}
class creativeMovies extends Movie {
    int view;
    int likes;
        creativeMovies(String name, int rating, int money, int profit, String actor, String actress, int view, int likes){
          
         super(name, rating, money, profit, actor, actress);
            this.view = view;
         this.likes = likes;
         
     }
    public void displayRating(){
        System.out.println(rating);
        System.out.println("Inside the creativeMovies class");
    }
    
}
public class Overrinding3 {

    public static void main(String[] args) {
        commercialMovie londonDreams  = new commercialMovie("London Dreams", 10, 9000000, 7000000, "Salman khan", "Asin", 10000, 500);
        creativeMovies andhadhun = new creativeMovies("Andhadhun", 10, 7000000, 800000, "Ayushman Khurana", "Disha", 20000, 400);
        londonDreams.displayRating();
        andhadhun.displayRating();
    }
}
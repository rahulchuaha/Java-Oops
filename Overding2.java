 import java.util.*;

class Movie{
    public String name;
    public int rating;
    public long moneycollection;
    public int profit;
    public String leadActor;
    public String leadActress;
    
    public void displayRating(){
        System.out.println(rating);
        System.out.println("This is the function of movies class.");
    }
}
class commercialMovies extends Movie{
    
    public void displayRating(){
        System.out.println(rating);
        System.out.println("This is the function of the commercial movies class.");
    }
}
public class Overding2 {

    public static void main(String[] args) {
        commercialMovies londonDreams = new commercialMovies();
        londonDreams.name = "London Dream";
        londonDreams.rating = 10;
        londonDreams.moneycollection = 9000000;
        londonDreams.profit = 70000000;
        londonDreams.leadActor = "Salman Khan";
        londonDreams.leadActress = "Asin";
        londonDreams.displayRating();
    }
}
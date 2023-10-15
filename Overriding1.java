

import java.util.*;

class Movie{
    public String name;
    public int rating;
    public long moneycollection;
    public long profit;
    public String leadActor;
    public String leadActress;
    
    public void displayRating(){
        System.out.println(rating);
        System.out.println("This is the function of movies class.");
    }
}
class commercialMovies extends Movie{
    
}
public class Overriding1 {

    public static void main(String[] args) {
        commercialMovies londonDreams = new commercialMovies();
        londonDreams.name = "London Dreams 2";
        londonDreams.rating = 10;
        londonDreams.moneycollection = 9000;
        londonDreams.profit = 8850;
        londonDreams.leadActor = "Rannvijay Singha, Rachel Gupta, Prince Narula";
        londonDreams.leadActress = "Prajakta";
        
        System.out.println(londonDreams.moneycollection);
        System.out.println(londonDreams.profit);
        System.out.println(londonDreams.leadActor);
        
        londonDreams.displayRating();
    }
}
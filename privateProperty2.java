import java.util.*;
class Movie{
    public String name;
    public int rating;
    public long moneyCollecton;
    public int profit;
    public String leadactor;
    public String leadActress;
    public int likes;
    public int views;
    
    public void displayView(){
        System.out.println(views);
    }
    public void displayLike(){
        System.out.println(likes); 
    }
    private int calculateGrade(int view, int likes){
            int finalGrade = 10*likes + views;
         return finalGrade;
        }
        
        
        public void printGrade(){
            System.out.println(calculateGrade(views, likes));
        }
}

public class privateProperty2 {

    public static void main(String[] args) {
       Movie superman1 = new Movie();
        superman1.name = "Superman 1";
        superman1.rating = 8;
        superman1.moneyCollecton = 90000;
        superman1.profit = 1000;
        superman1.leadactor = "Rachel Gupta and Prince Narula";
        superman1.leadActress = "Aarushi";
        superman1.likes = 500;
        superman1.views = 10000;
        
         superman1.printGrade();
    }
}

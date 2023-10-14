import java.util.*;

public class  Movie{
    String Name;
    int Rating;
    int Money;
    int Profit;
    String Actor;
    String Actress;
    
    Movie(int Rating,int Money){
      this.Rating=Rating;
      this.Money=Money;
      System.out.println("Stored rating and money.");
    }
    Movie(int Rating,int Money,int Profit){
      this.Rating=Rating;
      this.Money=Money;
      this.Profit=Profit;
      System.out.println("Stored rating, money, profit are given.");
    }
    Movie(int Rating,int Money,int Profit,String Actor){
      this.Rating=Rating;
      this.Money=Money;
      this.Profit=Profit;
      this.Actor=Actor;
      System.out.println("Stored rating, money, profit, lead actors are given.");
    }
    
  }
  
      //## night->coder##//
  
  public class ConstructorOverloading {
  
      public static void main(String[] args) {
          Scanner scn=new Scanner(System.in);
        Movie m1=new Movie(8,900000);
        Movie m2=new Movie(8,900000,8000);
        Movie m3=new Movie(8,900000,8000,"Ranveer Singh");
      }
  }  

import java.util.*;

 class Movie{
    String name;
    int rating;
    int MoneyCollection;
    int profit;
    String leadActor;
    String leadActress;
    Movie(String newname,int rat, int mc,int p,String a,String act){
        name=newname;
        rating=rat;
        MoneyCollection=mc;
        profit=p;
        leadActor=a;
        leadActress=act;
        
        System.out.println(rating);
        System.out.println(MoneyCollection);
        System.out.println(profit);
        System.out.println(leadActor);
        System.out.println(leadActress);
    }
}
public class Constructors  {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Movie m1=new Movie("Batman 1",8,200000,5000,"John","Disha");
        Movie m2=new Movie("Batman 2",9,500000,8000,"Akshay","Anushka");
        Movie m3=new Movie("Batman 3",10,700000,6000,"Ajay","Deepika");
        
        
    }
}

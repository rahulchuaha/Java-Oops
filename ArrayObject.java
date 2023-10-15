import java.util.*;


class Movies {
    public String name;
    public int rating;
    public int moneyCollection;
    public int profit;
    public String leadActor;
    public String leadActress;
}

public class ArrayObject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine(); // Move to the next line

        Movies[] movies = new Movies[n];

        for (int i = 0; i < n; i++) {
            Movies movie = new Movies();

            movie.name = scanner.nextLine();
            movie.rating = scanner.nextInt();
            movie.moneyCollection = scanner.nextInt();
            movie.profit = scanner.nextInt();
            scanner.nextLine(); // Move to the next line
            movie.leadActor = scanner.nextLine();
            movie.leadActress = scanner.nextLine();

            movies[i] = movie;
        }

        for (Movies movie : movies) {
            System.out.println(movie.name);
            System.out.println(movie.rating);
            System.out.println(movie.moneyCollection);
            System.out.println(movie.profit);
            System.out.println(movie.leadActor);
            System.out.println(movie.leadActress);
        }
    }
}
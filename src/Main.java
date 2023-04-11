import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Theater TheIMAX = new IMAXTheater();
        Movie movie1 = new Movie("The Super Mario Bros. Movie", 92, "Family", 7.4);
        Movie movie2 = new Movie("John Wick: Chapter 4", 169, "Thriller", 8.3);
        Movie movie3 = new Movie("Avatar: The Way of Water", 192, "Action", 7.7);
        TheIMAX.addMovie(movie1);
        TheIMAX.addMovie(movie2);
        TheIMAX.addMovie(movie3);

        Theater ThePrytania = new SmallTheater("The Prytania");
        Movie movie4 = new Movie("Tommy", 111, "Musical", 6.6);
        ThePrytania.addMovie(movie4);

        Theater[] theaters = { TheIMAX, ThePrytania };

        System.out.println("Select a theater:");
        for (int i = 0; i < theaters.length; i++) {
            System.out.println((i + 1) + ". " + theaters[i].getName());
        }
        int theaterChoice = in.nextInt() - 1;
        Theater selectedTheater = theaters[theaterChoice];

        System.out.println("Select a movie:");
        for (int i = 0; i < selectedTheater.getMovies().size(); i++) {
            System.out.println((i + 1) + ". " + selectedTheater.getMovies().get(i).getTitle());
        }
        int movieChoice = in.nextInt() - 1;
        Movie selectedMovie = selectedTheater.getMovies().get(movieChoice);

        System.out.println("Enter the row number:");
        int row = in.nextInt();
        System.out.println("Enter the seat number:");
        int seatNumber = in.nextInt();

        selectedTheater.bookSeat(row, seatNumber);

        System.out.println(
                "You went to see " + selectedMovie.getTitle() + " at " + selectedTheater.getName() + ". "
                        + "You sat in row "
                        + row + " and seat number " + seatNumber + ". It was a " + selectedMovie.getGenre()
                        + " that went on for " + selectedMovie.getDuration() + " minutes. You rated it "
                        + selectedMovie.getRating() + " out of 10!");
    }
}
import java.util.ArrayList;

public class Theater {
    private String name;
    private Seat[][] seats;
    private ArrayList<Movie> movies;

    public Theater(String name, int numRows, int numSeatsPerRow) {
        this.name = name;
        this.seats = new Seat[numRows][numSeatsPerRow];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numSeatsPerRow; j++) {
                seats[i][j] = new Seat(i + 1, j + 1);
            }
        }
        this.movies = new ArrayList<>();
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public String getName() {
        return name;
    }

    public void bookSeat(int row, int seatNumber) {
        Seat seat = seats[row - 1][seatNumber - 1];
        if (!seat.isTaken()) {
            seat.setTaken(true);
            System.out.println("Seat booked successfully!");
        } else {
            System.out.println("Sorry, this seat is already taken.");
        }
    }
}
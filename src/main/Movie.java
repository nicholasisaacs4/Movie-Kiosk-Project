import java.time.LocalDate;

public class Movie {
    String title;
    String genre;
    String director;
    int IDNum;
    double price;
    int ranking;
    LocalDate dateRented;
    LocalDate dateDue;
    LocalDate dateReturned;

    public Movie(String title, String director, String genre){
        this.title=title;
        this.genre=genre;
        this.director=director;
    }
}

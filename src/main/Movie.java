
public class Movie {
    String title;
    String genre;
    String director;
    int IDNum;
    double price;
    int ranking;
    dateTime dateRented;
    dateTime dateDue;
    dateTime dateReturned;

    public Movie(String title, String director, String genre){
        this.title=title;
        this.genre=genre;
        this.director=director;
    }
}

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

    int getIDNum(){ //returns ID Number
        return IDNum;
    }

    void setIDNum(){
        //get IDNum of last movie and add 1 to it
    }

    double getPrice(){ //returns movie price
        return price;
    }

    void setPrice(){
        if(ranking>=10){ //if rented >10 times
            price = 20;
        }
        else if(ranking>1 && ranking<10){ //if rented between 2-10 times
            price = 10;
        }
        else if(ranking<=1){ //if rented 0 or 1 time
            price = 5;
        }
    }

    int getRanking(){ //returns movie ranking
        return ranking;
    }

    void setRanking(){
        
    }

    LocalDate getDateRented(){
        return dateRented;
    }

    void setDateRented(){
        dateRented = LocalDate.now(); //when this method is called is the same date that it is rented
    }
}

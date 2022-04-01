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

    void setRanking(int newRank){//adds whatever int is passed to ranking
        ranking+= newRank;
    }

    void resetRanking(){ //resets the ranking to zero
        ranking=0;
    }

    LocalDate getDateRented(){
        return dateRented;
    }

    void setDateRented(LocalDate rentDate){
        dateRented = rentDate; //method requires a date as a parameter, which will be set as rent date
    }

    LocalDate getDateReturned(){
        return dateReturned;
    }

    void setDateReturned(LocalDate returnDate){
        dateReturned = returnDate; //method requires a date as a parameter, which will be set as return date
    }

    LocalDate getDateDue(){ //returns due date
        return dateDue;
    }

    void setDateDue(){
        if(ranking>10){ //if higher ranked movie
            dateDue = dateRented.plusDays(3); //3 days from rental date
        }
        else if(ranking>1 && ranking<10){ //if middle ranked movie
            dateDue = dateRented.plusDays(5); //5 days  from rental date
        }
        else{ //if lower ranked movie
            dateDue = dateRented.plusDays(7); //1 week from rental date
        }
        
    }
}

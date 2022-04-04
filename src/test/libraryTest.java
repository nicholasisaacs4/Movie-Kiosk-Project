package test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

public class libraryTest {
    public libraryTest(){
       
    }
    @Test
    void sortByRankTest(){ 
        /*INTEGRATION TEST: Tests movie (setRanking) and library (sortByRank) methods */

        /*Creates 7 new movies*/
        Movie THG = new Movie("Harry Potter", "Chris Colombus", "Action");
        Movie HP = new Movie("The Hunger Games", "Francis Lawrence", "Sci Fi");
        Movie TW = new Movie("Twilight", "Chris Weitz", "Action");
        Movie DV = new Movie("Divergent", "Neil Burger", "Sci Fi");
        Movie SW = new Movie("Star Wars", "George Lucas", "Sci Fi");
        Movie TMR = new Movie("The Maze Runner", "Wes Ball", "Sci Fi");
        Movie PJ = new Movie("Percy Jackson", "Chris Colombus", "Sci Fi");

        /* ADDING ALL MOVIES TO LIBRARY */
        allMovies.add(THG);
        allMovies.add(HP);
        allMovies.add(TW);
        allMovies.add(DV);
        allMovies.add(SW);
        allMovies.add(TMR);
        allMovies.add(PJ);

        /*RANKING MOVIES*/
        THG.setRanking();
        THG.setRanking();
        THG.setRanking(); //THG ranking = 3
        assertEquals(3, THG.getRanking()); //makes sure ranking is what it should be

        HP.setRanking();
        HP.setRanking();
        HP.setRanking();
        HP.setRanking();
        HP.setRanking();
        HP.setRanking();
        HP.setRanking();
        assertEquals(7, HP.getRanking());

        TW.setRanking();
        TW.setRanking();
        TW.setRanking();
        TW.setRanking();
        TW.setRanking();
        assertEquals(5, TW.getRanking());

        DV.setRanking();
        DV.setRanking();
        DV.setRanking();
        DV.setRanking();
        assertEquals(4, DV.getRanking());

        SW.setRanking();
        SW.setRanking();
        SW.setRanking();
        SW.setRanking();
        SW.setRanking();
        SW.setRanking();
        SW.setRanking();
        SW.setRanking();
        SW.setRanking();
        SW.setRanking();
        assertEquals(10, SW.getRanking());

        TMR.setRanking();
        assertEquals(1, TMR.getRanking());

        assertEquals(0, PJ.getRanking());

        /* SORT BY RANK TEST*/
        assertEquals(null, allMovies.sortByRank()); //TODO: fix this when sort by rank is written
    }
}

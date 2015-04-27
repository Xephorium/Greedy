/*
  Christopher Cruzen                              LaunchCode CS50
  "ChangeMakerTest.java"                               04.24.2015

  Problem Set #5

    A temporary file intended only to be used in testing the
  ChangeMaker class, this class contains a number of functionally
  standalone methods which each address a specific runtime case.

*/
import com.xephorium.greedy.ChangeMaker;
import com.xephorium.greedy.currency.*;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class ChangeMakerTest
{
    @Test
    public void ifChangeIsNeverSetgetCoinsShouldReturnZero()
    {
        ChangeMaker chMkr = new ChangeMaker();
        assertTrue(chMkr.getNumCoins() == 0);
    }

}

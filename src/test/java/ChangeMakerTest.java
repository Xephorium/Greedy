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

public class ChangeMakerTest
{
    /*--- setCurrency Method Test Cases ---*/

    @Test
    public void dollarSymbolMeansDollarCurrency()
    {
        ChangeMaker chMkr = new ChangeMaker("$25.35");
    }

}

/*
  Christopher Cruzen                              LaunchCode CS50
  "CurrencyTesting.java"                               04.23.2015

  Problem Set #5

    A temporary file intended only to be used in testing the
  ChangeMaker class, this class contains a number of functionally
  standalone methods which each address a specific runtime case.
    Note: This kind of method-by-method code evaluation is
  called Unit Testing. Unit Testing is the industry standard
  for large-scale software production and can only be
  accomplished through a unit testing Framework (in this case,
  JUnit).

*/
import com.xephorium.greedy.ChangeMaker;
import com.xephorium.greedy.Utilities;
import org.junit.Test;
import static org.junit.Assert.*;                   // +++ Static? +++

public class UtilitiesTest
{
    /*--- validInput Method Test Cases ---*/

    @Test
    public void firstCharMustBeValidSymbol()
    {
        assertTrue(Utilities.validInput("$56.70"));
    }

    @Test
    public void remainingCharsMustBeValidAmount()
    {
        assertTrue(Utilities.validInput("$255.99"));
    }

}

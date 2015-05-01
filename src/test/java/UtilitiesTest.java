/*
  Christopher Cruzen                              LaunchCode CS50
  "UtilitiesTest.java"                                 04.23.2015

  Problem Set #5

    A temporary file intended only to be used in testing the
  Utilities class, this class contains a number of functionally
  standalone methods which each address a specific runtime case.
    Note: This kind of method-by-method code evaluation is
  called Unit Testing. Unit Testing is the industry standard
  for large-scale software production and can only be
  accomplished through a unit testing Framework (in this case,
  JUnit).

*/
import com.xephorium.greedy.Utilities;
import org.junit.Test;
import static org.junit.Assert.*;                   // +++ Static? +++

public class UtilitiesTest
{
    /*--- validInput Method Test Cases ---*/

    @Test
    public void firstCharMustBeValidSymbol()
    {
        assertEquals(true, Utilities.validInput("$56.70"));
        assertEquals(true, Utilities.validInput("€56.70"));
        assertEquals(true, Utilities.validInput("€456.12"));
        assertEquals(false, Utilities.validInput(("K56.70")));
        assertEquals(false, Utilities.validInput((".56.70")));
        assertEquals(false, Utilities.validInput(("756.70")));
    }

    @Test
    public void remainingCharsMustBeValidAmount()
    {
        assertEquals(true, Utilities.validInput("$255.99"));
        assertEquals(true, Utilities.validInput("€45999.00"));
        assertEquals(true, Utilities.validInput("$300"));
        assertEquals(false, Utilities.validInput("€255.945"));
        assertEquals(false, Utilities.validInput("$2.55.99"));
    }

}

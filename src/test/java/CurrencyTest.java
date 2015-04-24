/*
  Christopher Cruzen                           LaunchCode CS50
  "CurrencyTest.java"                               04.23.2015

  Problem Set #5

    A temporary file intended only to be used in testing each
  of the Greedy application's currencytype classes, this class
  contains a number of functionally standalone methods which
  each address a specific runtime case.

*/

import com.xephorium.greedy.currency.Dollar;
import com.xephorium.greedy.currency.Euro;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class CurrencyTest
{
    /////////////////////////////
    // Dollar Class Test Cases //
    /////////////////////////////

    /*---  convertToBaseUnit Method ---*/

    @Test
    public void doubleDollarValueShouldBeConvertedToIntCents()
    {
        Dollar dollar = new Dollar();
        int temp = dollar.convertToBaseUnit(25.52);
        assertTrue(temp == 2552);

        temp = dollar.convertToBaseUnit(99.99);
        assertTrue(temp == 9999);

        temp = dollar.convertToBaseUnit(1000.00);
        assertTrue(temp == 100000);
    }


    ///////////////////////////
    // Euro Class Test Cases //
    ///////////////////////////

    /*--- convertToBaseUnit Method ---*/

    @Test
    public void doubleEuroValueShouldBeConvertedToIntEuroCents()
    {
      Euro euro = new Euro();
      int temp = euro.convertToBaseUnit(25.52);
      assertTrue(temp == 2552);

      temp = euro.convertToBaseUnit(99.99);
      assertTrue(temp == 9999);

      temp = euro.convertToBaseUnit(1000.00);
      assertTrue(temp == 100000);
    }
}

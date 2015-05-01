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
import static org.junit.Assert.*;

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
        assertEquals(2552, temp);

        temp = dollar.convertToBaseUnit(99.99);
        assertEquals(9999, temp);

        temp = dollar.convertToBaseUnit(1000.00);
        assertEquals(100000, temp);
    }

    /*--- getMinNumCoins Method ---*/

    @Test
    public void evenDollarsShouldBeThatManyCoins()
    {
        Dollar dollar = new Dollar();
        int temp = dollar.getMinNumCoins(dollar.convertToBaseUnit(1.00));
        assertEquals(1, temp);

        temp = dollar.getMinNumCoins(dollar.convertToBaseUnit(5.00));
        assertEquals(5, temp);

        temp = dollar.getMinNumCoins(dollar.convertToBaseUnit(25.00));
        assertEquals(25, temp);
    }

    @Test
    public void singleCoinValuesShouldBeOneCoin()
    {
        Dollar dollar = new Dollar();
        int temp = dollar.getMinNumCoins(dollar.convertToBaseUnit(.01));
        assertEquals(1, temp);

        temp = dollar.getMinNumCoins(dollar.convertToBaseUnit(.05));
        assertEquals(1, temp);

        temp = dollar.getMinNumCoins(dollar.convertToBaseUnit(.10));
        assertEquals(1, temp);

        temp = dollar.getMinNumCoins(dollar.convertToBaseUnit(.25));
        assertEquals(1, temp);

        temp = dollar.getMinNumCoins(dollar.convertToBaseUnit(1.00));
        assertEquals(1, temp);
    }

    @Test
    public void otherDollarValueTests()
    {
        Dollar dollar = new Dollar();
        int temp = dollar.getMinNumCoins(dollar.convertToBaseUnit(.75));
        assertEquals(3, temp);

        temp = dollar.getMinNumCoins(dollar.convertToBaseUnit(1.25));
        assertEquals(2, temp);

        temp = dollar.getMinNumCoins(dollar.convertToBaseUnit(.83));
        assertEquals(7, temp); // 3 Quarters, 1 Nickel, 3 Pennies

        temp = dollar.getMinNumCoins(dollar.convertToBaseUnit(25.16));
        assertEquals(28, temp); // 25 Dollars, 1 Dime, 1 Nickel, 1 Penny
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
      assertEquals(2552, temp);

      temp = euro.convertToBaseUnit(99.99);
      assertEquals(9999, temp);

      temp = euro.convertToBaseUnit(1000.00);
      assertEquals(100000, temp);
    }

    /*--- getMinNumCoins Method ---*/

    @Test
    public void multiplesOfTwoEurosShouldBeHalfThatManyCoins()
    {
        Euro euro = new Euro();
        int temp = euro.getMinNumCoins(euro.convertToBaseUnit(2.00));
        assertEquals(1, temp);

        temp = euro.getMinNumCoins(euro.convertToBaseUnit(4.00));
        assertEquals(2, temp);

        temp = euro.getMinNumCoins(euro.convertToBaseUnit(18.00));
        assertEquals(9, temp);
    }

    @Test
    public void oddNumbersOfEurosShouldBeHalfThatManyCoinsTruncatedPlusOne()
    {
        Euro euro = new Euro();
        int temp = euro.getMinNumCoins(euro.convertToBaseUnit(3.00));
        assertEquals(2, temp);

        temp = euro.getMinNumCoins(euro.convertToBaseUnit(5.00));
        assertEquals(3, temp);

        temp = euro.getMinNumCoins(euro.convertToBaseUnit(21.00));
        assertEquals(11, temp);
    }

    @Test
    public void otherEuroValueTests()
    {
        Euro euro = new Euro();
        int temp = euro.getMinNumCoins(euro.convertToBaseUnit(2.50));
        assertEquals(2, temp);

        temp = euro.getMinNumCoins(euro.convertToBaseUnit(0.34));
        assertEquals(4, temp);

        temp = euro.getMinNumCoins(euro.convertToBaseUnit(1.86));
        assertEquals(6, temp);
    }

}

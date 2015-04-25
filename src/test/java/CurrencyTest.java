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

    /*--- getMinNumCoins Method ---*/

    @Test
    public void evenDollarsShouldBeThatManyCoins()
    {
        Dollar dollar = new Dollar();
        int temp = dollar.getMinNumCoins(dollar.convertToBaseUnit(1.00));
        assertTrue(temp == 1);

        temp = dollar.getMinNumCoins(dollar.convertToBaseUnit(5.00));
        assertTrue(temp == 5);

        temp = dollar.getMinNumCoins(dollar.convertToBaseUnit(25.00));
        assertTrue(temp == 25);
    }

    @Test
    public void singleCoinValuesShouldBeOneCoin()
    {
        Dollar dollar = new Dollar();
        int temp = dollar.getMinNumCoins(dollar.convertToBaseUnit(.01));
        assertTrue(temp == 1);

        temp = dollar.getMinNumCoins(dollar.convertToBaseUnit(.05));
        assertTrue(temp == 1);

        temp = dollar.getMinNumCoins(dollar.convertToBaseUnit(.10));
        assertTrue(temp == 1);

        temp = dollar.getMinNumCoins(dollar.convertToBaseUnit(.25));
        assertTrue(temp == 1);

        temp = dollar.getMinNumCoins(dollar.convertToBaseUnit(1.00));
        assertTrue(temp == 1);
    }

    @Test
    public void otherDollarValueTests()
    {
        Dollar dollar = new Dollar();
        int temp = dollar.getMinNumCoins(dollar.convertToBaseUnit(.75));
        assertTrue(temp == 3);

        temp = dollar.getMinNumCoins(dollar.convertToBaseUnit(1.25));
        assertTrue(temp == 2);

        temp = dollar.getMinNumCoins(dollar.convertToBaseUnit(.83));
        assertTrue(temp == 7); // 3 Quarters, 1 Nickel, 3 Pennies

        temp = dollar.getMinNumCoins(dollar.convertToBaseUnit(25.16));
        assertTrue(temp == 28); // 25 Dollars, 1 Dime, 1 Nickel, 1 Penny
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

    /*--- getMinNumCoins Method ---*/

    @Test
    public void multiplesOfTwoEurosShouldBeHalfThatManyCoins()
    {
        Euro euro = new Euro();
        int temp = euro.getMinNumCoins(euro.convertToBaseUnit(2.00));
        assertTrue(temp == 1);

        temp = euro.getMinNumCoins(euro.convertToBaseUnit(4.00));
        assertTrue(temp == 2);

        temp = euro.getMinNumCoins(euro.convertToBaseUnit(18.00));
        assertTrue(temp == 9);
    }

    @Test
    public void oddNumbersOfEurosShouldBeHalfThatManyCoinsTruncatedPlusOne()
    {
        Euro euro = new Euro();
        int temp = euro.getMinNumCoins(euro.convertToBaseUnit(3.00));
        assertTrue(temp == 2);

        temp = euro.getMinNumCoins(euro.convertToBaseUnit(5.00));
        assertTrue(temp == 3);

        temp = euro.getMinNumCoins(euro.convertToBaseUnit(21.00));
        assertTrue(temp == 11);
    }

    @Test
    public void otherEuroValueTests()
    {
        Euro euro = new Euro();
        int temp = euro.getMinNumCoins(euro.convertToBaseUnit(2.50));
        assertTrue(temp == 2);

        temp = euro.getMinNumCoins(euro.convertToBaseUnit(0.34));
        assertTrue(temp == 4);

        temp = euro.getMinNumCoins(euro.convertToBaseUnit(1.86));
        assertTrue(temp == 6);
    }

}

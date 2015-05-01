/*
  Christopher Cruzen                                LaunchCode CS50
  "ChangeMaker.java"                                     04.23.2015

  Problem Set #5

    If Greedy is the driver class of this application, ChangeMaker
  is the engine. Depending on what value it's sent, this class
  selects the appropriate working currency, calculates the minimum
  number of coins for that currency, and returns the requested data
  to Greedy.

*/
package com.xephorium.greedy;
import com.xephorium.greedy.currency.*;

public class ChangeMaker
{
    /*--- Fields ---*/

    private CurrencyFactory currencyFactory;
    private Currency        currency = null;
    private int             baseUnitValue;


    /*--- Constructors ---*/

    public ChangeMaker(String input)
    {
        currencyFactory = new CurrencyFactory();
        setCurrency(input.charAt(0));
        baseUnitValue = currency.convertToBaseUnit(getValue(input));
    }


    /*--- Public Methods ---*/

    public int getNumCoins()
    {
        if(currency == null)
            return 0;
        return currency.getMinNumCoins(baseUnitValue);
    }


    /*--- Private Methods ---*/

    private void setCurrency(char symbol)
    {
        currency = currencyFactory.currencyFromSymbol(symbol);
    }

    private double getValue(String s)
    {
        return Double.parseDouble(s.substring(1));
    }

}

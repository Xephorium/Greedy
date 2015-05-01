/*
  Christopher Cruzen                             LaunchCode CS50
  "CurrencyFactory.java"                              04.23.2015

  Problem Set #5

    Employed to hide instantiation of specific currency classes,
  this class creates and returns a specified currency object to
  the calling code.

*/
package com.xephorium.greedy.currency;

public class CurrencyFactory
{
    /*--- Methods ---*/

    public Currency currencyFromSymbol(char symbol)
    {
        if(symbol == '$')
            return new Dollar();
        else if(symbol == '€')
            return new Euro();
        else
            return null;
    }

    public Currency currencyFromName(String name)
    {
        if(name.equalsIgnoreCase("dollar"))
            return new Dollar();
        else if(name.equalsIgnoreCase("euro"))
            return new Euro();
        else
            return null;
    }

}

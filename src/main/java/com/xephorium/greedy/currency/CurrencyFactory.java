/*
  Christopher Cruzen                             LaunchCode CS50
  "CurrencyFactory.java"                              04.23.2015

  Problem Set #5

    Employed to hide instantiation of specific currency classes,
  this class creates and returns a specified currency object to
  the calling code.

*/
package com.xephorium.greedy.currency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("currencyFactory")
@Scope("singleton")
public class CurrencyFactory
{
    /*--- Fields ---*/

    @Autowired
    private Dollar dollar;
    @Autowired
    private Euro   euro;


    /*--- Methods ---*/

    public Currency currencyFromSymbol(char symbol)
    {
        if(symbol == '$')
            return dollar;
        else if(symbol == '€')
            return euro;
        else
            return null;
    }

    public Currency currencyFromName(String name)
    {
        if(name.equalsIgnoreCase("dollar"))
            return dollar;
        else if(name.equalsIgnoreCase("euro"))
            return euro;
        else
            return null;
    }

}

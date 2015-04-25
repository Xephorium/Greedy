/*
  Christopher Cruzen                      LaunchCode CS50
  "Dollar.java"                                04.23.2015

  Problem Set #5

    This class contains a set of algorithms that apply to
  calculations done specifically in US Dollar currency.

*/
package com.xephorium.greedy.currency;

public class Dollar implements Currency
{
    /*--- Fields ---*/

    private final int[] COIN = {100, // Dollar
                                25,  // Quarter
                                10,  // Dime
                                5,   // Nickel
                                1};  // Penny

    /*--- Methods ---*/

    public int convertToBaseUnit(Double value)
    {
        return (int)(value * 100);
    }

    public int getMinNumCoins(int value)
    {
        int remainingChange = value;
        int numCoins = 0;

        for(int x = 0; x < 5; x++)
        {
            if (remainingChange >= COIN[x])
            {
                numCoins = numCoins + (remainingChange / COIN[x]);
                remainingChange = (remainingChange % COIN[x]);
            }
        }

        return numCoins;
    }

}

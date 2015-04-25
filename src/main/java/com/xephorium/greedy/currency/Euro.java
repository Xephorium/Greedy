/*
  Christopher Cruzen                      LaunchCode CS50
  "Euro.java"                                  04.23.2015

  Problem Set #5

    This class contains a set of algorithms that apply to
  calculations done specifically in EU Euro currency.

*/
package com.xephorium.greedy.currency;

public class Euro implements Currency
{
    /*--- Fields ---*/

    private final int[] COIN = {200,  // 2€ Coin
                                100,  // 1€ Coin
                                50,   // .5€ Coin
                                20,   // .2€ Coin
                                10,   // .1€ Coin
                                5,    // .05€ Coin
                                2,    // .02€ Coin
                                1};   // .01€ Coin

    /*--- Methods ---*/

    public int convertToBaseUnit(Double value)
    {
        return (int)(value * 100);
    }

    public int getMinNumCoins(int value)
    {
        int remainingChange = value;
        int numCoins = 0;

        for(int x = 0; x < COIN.length; x++)
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
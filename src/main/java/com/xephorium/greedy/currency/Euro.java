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

    // Coin Name/Value Hash

    /*--- Constructor(s) ---*/

    /*--- Methods ---*/

    public int convertToBaseUnit(Double value)
    {
        return (int)(value * 100);
    }

    public int getMinNumCoins(int value)
    {
        int temp = 5;
        return temp;
    }

}
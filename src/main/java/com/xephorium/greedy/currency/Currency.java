/*
  Christopher Cruzen                            LaunchCode CS50
  "Currency.java"                                    04.23.2015

  Problem Set #5

    Designed as a set of implementation standards to which each
  form of currency must conform, this interface illustrates
  important core currency type functions.

*/
package com.xephorium.greedy.currency;

public interface Currency
{
    /*--- Methods ---*/

    public int convertToBaseUnit(Double value);

    public int getMinNumCoins(int value);

    public String getMinCoins(int value);

}

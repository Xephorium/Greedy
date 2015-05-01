/*
  Christopher Cruzen                             LaunchCode CS50
  "ChangeMakerFactory.java"                           04.30.2015

  Problem Set #5

    Creates and returns a new ChangeMaker object with specified
  monetary amount.

*/
package com.xephorium.greedy;
import org.springframework.stereotype.Component;

@Component("changeFactory")
public class ChangeMakerFactory
{
    /*--- Method ---*/

    public ChangeMaker newMaker(String s)
    {
        return new ChangeMaker(s);
    }
}

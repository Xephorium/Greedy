/*
  Christopher Cruzen                         LaunchCode CS50
  "Greedy.java"                                   04.23.2015

  Problem Set #5

    Calculate the fewest number of coins that can be used to
  represent a user-specified amount of money. Verify user
  input is valid with a sentinel and automatically adjust
  currency based on preceding symbol.

*/
package com.xephorium.greedy;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Greedy
{

  public static void main(String[] args)
  {
    // Initialize Spring Context
    ApplicationContext context =
            new ClassPathXmlApplicationContext("application.xml");

    // Run Program
    Greedy program = (Greedy) context.getBean("greedy");
    program.run(context);
  }


  public void run(ApplicationContext context)
  {
    /*--- Main Program ---*/

    // Greeting
    Utilities.customGreeting("Change Maker!");

    // Input User Data
    System.out.print("Enter monetary amount: ");
    ChangeMakerFactory changeFactory = (ChangeMakerFactory) context.getBean("changeFactory");
    ChangeMaker changeMaker = changeFactory.newMaker(Utilities.inputSentinel());

    // Print Number of Coins
    int coins = changeMaker.getNumCoins();
    if(coins == 1)
      System.out.println("Minimum: 1 Coin");
    else
      System.out.printf("Minimum: %d Coins\n", coins);
  }
}
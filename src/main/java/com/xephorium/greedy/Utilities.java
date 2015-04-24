/*
  Christopher Cruzen                         LaunchCode CS50
  "Utilities.java"                                04.23.2015

  Problem Set #5

    A collection of standalone utility methods which exist
  well outside the Greedy program's object structure, this
  class exists to help clean up Greedy's Code.

*/
package com.xephorium.greedy;

import java.util.Scanner;

public final class Utilities
{
    /*--- Constructor ---*/

    private Utilities() {}

    /*--- Methods ---*/

    // Output A Standard Greeting
    public static void standardGreeting()
    {
        System.out.println("##############");
        System.out.println("## Welcome! ##");
        System.out.println("##############\n");
    }

    // Output A Custom Greeting
    // Parameter: (String "Program Name!")
    public static void customGreeting(String s)
    {
        StringBuilder output = new StringBuilder();

        output.append("##############");
        for(int x = 0; x < (s.length() + 3); x++)
            output.append("#");
        output.append("\n## Welcome to ");
        output.append(s);
        output.append(" ##\n");
        output.append("##############");
        for(int x = 0; x < (s.length() + 3); x++)
            output.append("#");
        output.append("\n");

        System.out.println(output);
    }

    // Persistently Prompt User For Valid Input
    // Return: (String input)
    public static String inputSentinel()
    {
        Scanner reader = new Scanner(System.in);
        String input;

        input = reader.nextLine();
        while(!validInput(input))
        {
            System.out.println("Improper format. Enter a valid amount including");
            System.out.print("currency symbol (ie. \'$29.99\'): ");
            input = reader.nextLine();
        }
        return input;
    }

    // Validate Monetary Amount
    // Parameter: (String <amount>)
    // Return:    (Boolean <valid>)
    public static boolean validInput(String amount)
    {
        // Validate Currency Symbol
        if(amount.charAt(0) != '$' && amount.charAt(0) != '€')
            return false;

        // Validate Numeric Value
        double value;
        try
        {
            value = Double.parseDouble(amount.substring(1));
            if(value <= 0)
                return false;
        }
        catch(NumberFormatException e)
        {
            return false;
        }

        // Validate Number Of Characters After Decimal
        for(int x = (amount.length() - 1); x > 0; x--)
            if(amount.charAt(x) == '.' && (amount.length() - x) > 3)
                return false;

        return true;
    }

}

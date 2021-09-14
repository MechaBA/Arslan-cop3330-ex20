/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Berkay Arslan
 */

package org.example;
import java.util.Scanner;
public class App
{
    public static void main(String[] args)
    {
        Scanner n = new Scanner(System.in);
        int x;
        double taxTotal = 0.0, tax = 0.0;
        System.out.print("What is the order amount? ");
        x = n.nextInt();
        System.out.print("What state do you live in? ");
        String state = n.next();
            if(state.equals("Wisconsin"))
            {
            System.out.print("What county do you live in? ");
            String county = n.next();
            if(county.equals("Eau Claire"))
            {
                tax = (x * 5.005) / 100;
                taxTotal = tax + x;
            }
            else if(county.equals("Dunn"))
            {
                tax = (x * 5.004) / 100;
                taxTotal = tax + x;
            }
            else
            {
                System.out.println("Enter county: ");
            }
            }
            else if(state.equals("Illinois"))
            {
            tax = (x * 8) / 100;
            taxTotal = tax + x;
            }
            else
            {
            tax = 0;
            taxTotal = x;
            }
            System.out.println("The tax is  $" +String.format("%.2f", tax));
            System.out.println("The total is  $" +String.format("%.2f", taxTotal));
    }
}
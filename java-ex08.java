/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Drew Butler
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("How many people?");
        int numPeople = myObj.nextInt();

        System.out.println("How many pizzas do you have?");
        int numPizza = myObj.nextInt();

        System.out.println("How many slices per pizza?");
        int numSlices = myObj.nextInt();

        int totSlices = numSlices * numPizza;

        System.out.println(numPeople + " people with " + numPizza + " pizzas (" + totSlices + " slices)");

        int perPerson = totSlices / numPeople;
        int leftover = totSlices % numPeople;

        System.out.println("Each person gets " + perPerson + " pieces of pizza.");
        System.out.println("There are " + leftover + " leftover pieces.");


        myObj.close();
    }
}
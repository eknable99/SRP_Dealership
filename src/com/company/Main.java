package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to SRP Dealership.");

        boolean cont = true;

        while(cont == true){
            System.out.println("\nPlease enter your choice from the list bellow:\nchoices are case-sensitive\nL- Get a list of cars\n" +
                    "A- Add a new car to inventory\nR- Remove a car from the Inventory\nU-Update a car in inventory\nD-Get details about a car\nX-Exit");
            Scanner scanner = new Scanner(System.in);
            String choice = scanner.nextLine();
            switch (choice){
                case "L":
                    DoI.printList();
                    break;
                case "A":
                    DoI.addCar();
                    break;
                case "R":
                    DoI.removeCar();
                    break;
                case "U":
                    DoI.updatePrice();
                    break;
                case "D":
                    DoI.getDetails();
                    break;
                case "X":
                    cont = false;
                    break;
                default:
                    System.out.println("Please make another choice");
            }
        }

    }
}

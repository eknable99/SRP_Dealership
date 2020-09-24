package com.company;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DoI {


    public static HashMap<String, Double> carList = new HashMap<String, Double>();

    public DoI(HashMap<String, Double> carList) {
        this.carList = carList;
    }

    public static void addCar(){
        System.out.println("In order to add a car to the list, you need a name and a price.\n Enter the car's name: ");
        Scanner scanner = new Scanner(System.in);
        String carString = scanner.nextLine();
        System.out.println("Now please enter the price of the car: ");
        Double priceDouble = scanner.nextDouble();
        addCar(carString, priceDouble);
    }


    public static void addCar(String carString, double priceDouble){
        carList.put(carString, priceDouble);
    }


    public static void removeCar(){
        System.out.println("Please enter the name of the car you wish to remove. To view a list of the cars, type L , case-insensitive");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        if(answer == "l" || answer.toUpperCase() == "L"){
            printList();
        } else if(carList.get(answer) != null){
            System.out.println("Car found. Are you sure you want to remove this car with price of " + carList.get(answer) + "Y/N case-Sensitive");
             if(scanner.next() == "Y"){
                removeCar(answer);
                 System.out.println("The car " + carList.get(answer) + " has been removed.");
             }
          }

        }

    //remove a car based on key (car name)
    public static void removeCar(String carString){
        carList.remove(carString);
    }

    public static void updatePrice(){
        System.out.println("updating car");
    }

    public static void printList(){
        System.out.println("printing list");
    }

    public static void getDetails(){
        System.out.println("getting deatails on a car");
    }
}


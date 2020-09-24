package com.company;
import java.util.*;

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
        Set set = carList.entrySet();
        Iterator it = set.iterator();
        while(it.hasNext()){
            Map.Entry mapEntry = (Map.Entry)it.next();
            System.out.println("The name is: " + mapEntry.getKey() + "and price is: " + mapEntry.getValue());
        }
    }


    public static void getDetails(){
        System.out.println("To receive details about a car, please enter the car's name");
        Scanner scanner = new Scanner(System.in);
        String carName = scanner.nextLine();
        getDetails(carName);
    }
    public static void getDetails(String carName){
        System.out.printf("The price of this car is: " + carList.get(carName));
    }
}


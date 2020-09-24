package com.company;
import java.util.*;

public class DoI {

    public static HashMap<String, Double> carList = new HashMap<>();

    //carList.put("SUV", 35000);

    public DoI(HashMap<String, Double> carList) {
        this.carList = carList;
    }

    //to add a car to inventory
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

    //to remove a car from inventory
    public static void removeCar(){
        System.out.println("Please enter the name of the car you wish to remove. To view a list of the cars, type L , case-insensitive");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        if(answer == "l"){
            printList();
        } else if(carList.containsKey(answer)){
            System.out.println("Car found. Are you sure you want to remove this car with price of " + carList.get(answer) + "? - y/n case-Sensitive");
             if(scanner.next() == "y"){
                 carList.remove(answer);
                 System.out.println("The car " + carList.get(answer) + " has been removed.");
             }
          }
           else{
            System.out.println("car not found");
            }
        }

    //remove a car based on key (car name)
    /*public static void removeCar(String carString){
        carList.remove(carString);
    }*/

    public static void updatePrice(){
        System.out.println("Please enter the name of the car you wish to update:\n");

        Scanner scanner = new Scanner(System.in);
        String carName = scanner.nextLine();

        if(carList.containsKey(carName)){
            System.out.println("The car " + carName + " is currently priced " + carList.get(carName) +
                    ".\nEnter the new price to update:\n");
            double newPrice = scanner.nextDouble();
            carList.replace(carName, newPrice);
            System.out.println("The car " + carName + " has been updated with the new price: " + carList.get(carName));
        }
    }

    //to print a list of cars in inventory
    public static void printList(){
        System.out.println("printing list");
        Set set = carList.entrySet();
        Iterator it = set.iterator();
        while(it.hasNext()){
            Map.Entry mapEntry = (Map.Entry)it.next();
            System.out.println("The name is: " + mapEntry.getKey() + " and price is: " + mapEntry.getValue());
        }
    }

    //to get the price of  a car
    public static void getDetails(){
        System.out.println("To receive details about a car, please enter the car's name");
        Scanner scanner = new Scanner(System.in);
        String carName = scanner.nextLine();
        getDetails(carName);
    }
    public static void getDetails(String carName){
        System.out.printf("The price of this car is: " + carList.get(carName));
    }

    //function to call from CFO to receive price of a car
    public static double getPrice(String carName){
        return carList.get(carName);
    }

}


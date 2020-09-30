package com.company;

import java.util.Scanner;

public class VPS {
    public static double discountRate;

    public static void customerCar(){
        System.out.println("Please enter the number of years for the payments: ");
        Scanner scanner = new Scanner(System.in);
        int numMonths = scanner.nextInt()/12;
        scanner.nextLine();
        System.out.println("Do you have a discount? y-n");
        char discountAnswer = scanner.next().charAt(0);

        if(discountAnswer == 'y'){
            System.out.println("Please enter your discount rate in digits:");
            discountRate = scanner.nextDouble();
        }else{
            discountRate =0.0;
        }

        //printing the list of cars with prices after discount
        DoI.printAfterDiscount();


 /*       System.out.println("Please enter the name of the car that the customer would like: ");
        String carName = scanner.nextLine();
        System.out.println("Please enter the interest for the sale (Ex: .0038): ");
        double interest = scanner.nextDouble();
        double carPrice = DoI.getPrice(carName);
        double calculatedPayment = CFO.calculatePayment(carPrice, interest, numMonths);
        System.out.printf("Monthly Payment: $%.2f", calculatedPayment);*/
    }

    }

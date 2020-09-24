package com.company;

import java.util.Scanner;

public class VPS {

    public static void customerCar(){
        System.out.println("Please enter the name of the car that the customer would like: ");
        Scanner scanner = new Scanner(System.in);
        String carName = scanner.nextLine();
        System.out.println("Please enter the interest for the sale (Ex: .0038): ");
        double interest = scanner.nextDouble();
        System.out.println("Please enter the number of months for the payments: ");
        int numMonths = scanner.nextInt();

        double carPrice = DoI.getPrice(carName);
        double calculatedPayment = CFO.calculatePayment(carPrice, interest, numMonths);
        System.out.printf("Monthly Payment: $%.2f", calculatedPayment);



    }
}

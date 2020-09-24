package com.company;

public class CFO {
    static double payment;
    int numMonths;
    double interestRate = .0038;
    double principle;
    double downPayment;

    public double getDownPayment() {
        return downPayment;
    }

    public void setDownPayment(double downPayment) {
        this.downPayment = downPayment;
    }

    public double getPrinciple() {
        return principle;
    }

    public void setPrinciple(double principle) {
        this.principle = principle;
    }

    public int getNumMonths() {
        return numMonths;
    }

    public void setNumMonths(int numMonths) {
        this.numMonths = numMonths;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public static double calculatePayment(double principle, double interestRate, int numMonths){
        payment = (principle * (1 +(interestRate/12) * numMonths))/ numMonths;
        return payment;
    }
}

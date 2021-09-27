/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Caila Coates
 */
package ex26;

import java.lang.Math;

public class PaymentCalculator {

    /*n is the number of months.
    i is the daily rate (APR divided by 365).
    b is the balance.
    p is the monthly payment. */

    double n;
    double apr;
    double i;
    double b;
    double p;

    public PaymentCalculator(double b, double apr, double p){
        this.apr = apr;
        this.b = b;
        this.p = p;

    }


    public double calculateMonthsUntilPaidOff(){
        this.i = (this.apr / 100) / 365 ;
        this.n = (-(1.0/30.0) * Math.log(1 + b/p * (1- Math.pow((1 + i),30))) / Math.log(1 + i));
        this.n = Math.ceil(n);
        return(n);
    }


}

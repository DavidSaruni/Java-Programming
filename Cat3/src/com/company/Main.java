package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        SaloonCar obj = new SaloonCar();
        System.out.println("Value of wheels is : "+obj.wheels);

        System.out.println("Value of cc is: "+obj.cc);

        System.out.println("Value of color is "+obj.color);

        System.out.println("Value of seats is "+obj.seats);

        obj.moveFoward ();
        //Toyota  = new Toyota();
    }
}

package com.company;

public class SaloonCar {

    int cc;

    String color;

    int seats;

    static int wheels = 4;

    protected int doors = 4;

    String fuel = "Petrol";


    SaloonCar() {


        int cc = 2000;

        String color = "White";

        int seats = 4;

    }


    SaloonCar(String model) {

        switch (model) {

            case "Toyota":

                int cc = 1500;

                String color = "grey";

                int seats = 5;

                break;

            case "Mercedes":

                cc = 2500;

                color = "blue";

                seats = 5;

                break;

            case "Prado":

                cc = 3000;

                color = "Yellow";

                seats = 7;

                break;

            default:

                cc = 2000;

                color = "White";

                seats = 4;

        }

    }

    public static void main(String args[]) {

        SaloonCar obj = new SaloonCar();

        System.out.println("Value of wheels is : " + obj.wheels);

        System.out.println("Value of cc is: " + obj.cc);

        System.out.println("Value of color is " + obj.color);

        System.out.println("Value of seats is " + obj.seats);

        obj.moveFoward();

    }

    public static void moveFoward() {

        String movement = "Moving Forward";

        System.out.println("The car is : " + movement);

    }

}

package com.company;

public class SaloonCar {
    int cc;

    String color;

    int seats;

    static int wheels = 4;

    protected int doors = 4;

    final String fuel = "Petrol";


    void SaloonCars(){


        int cc = 2000;

        String color = "White";

        int seats = 4;

    }


     void SaloonCars (String model){

        switch (model) {

            case "Toyota":

                 cc = 1500;

                 color = "grey";

                 seats = 5;

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


    public static void moveFoward (){

        String movement = "Moving Forward";

        System.out.println("The car is : "+movement);

    }
}

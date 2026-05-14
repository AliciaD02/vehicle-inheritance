package com.pluralsight;

public class MainApp {
    // creating a main method
    public static void main(String[] args) {


        // created the objects for each child
        Car myCar = new Car();
        Moped slowRide = new Moped();
        SemiTruck theTruck = new SemiTruck();
        Hovercraft hover = new Hovercraft();

        // using the objects we created we are getting the setters from the vehicle
        myCar.setColor("blue");
        myCar.setNumberOfPassengers(4);
        myCar.setCargoCapacity(10);
        myCar.setFuelCapacity(12);


        slowRide.setColor("red");
        slowRide.setNumberOfPassengers(3);
        slowRide.setCargoCapacity(8);
        slowRide.setFuelCapacity(5);


        theTruck.setColor("black");
        theTruck.setNumberOfPassengers(6);
        theTruck.setCargoCapacity(5);
        theTruck.setFuelCapacity(13);

        hover.setColor("white");
        hover.setNumberOfPassengers(2);
        hover.setCargoCapacity(4);
        hover.setFuelCapacity(8);

        System.out.println(slowRide.getColor());
        System.out.println(theTruck.getFuelCapacity());
        System.out.println(myCar.getColor());
        System.out.println(hover.getNumberOfPassengers());
    }

}

package com.herokuApp.OopsRev.InheritanceRev;

public interface IVehicle {

    String fuel= "Petrol";
    void move();

    boolean isFuelTankEmpty();

    void park();

    default void isParked(){
        System.out.println("vehicle is parked");
    };


}

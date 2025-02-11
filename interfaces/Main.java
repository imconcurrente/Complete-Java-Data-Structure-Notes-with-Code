package com.java.interfaces;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.start();
        car.acc();
        car.stop();


        NiceCar mycar = new NiceCar();

        mycar.start();
        mycar.starMusic();
        mycar.upgradeEngine();
        mycar.start();
    }
}

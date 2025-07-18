package com.auto;

public class MainCar {
    public static void main(String[] args) {
        Car miaAuto = new Car(0.07); // 7 litri ogni 100 km

        miaAuto.addGas(10); // Aggiungo 10 litri
        System.out.println("Carburante disponibile: " + miaAuto.getGas() + " litri");

        miaAuto.drive(50);  // Consuma 3.5 litri
        System.out.println("Carburante residuo: " + miaAuto.getGas() + " litri");

        miaAuto.drive(1000); // Troppo lungo: carburante insufficiente
    }
}

package com.auto;

public class Car {
    private double consumoLitriPerKm;     // es. 0.07 litri/km
    private double carburanteAttuale;     // in litri

    // Costruttore
    public Car(double consumoLitriPerKm) {
        this.consumoLitriPerKm = consumoLitriPerKm;
        this.carburanteAttuale = 0.0;
    }

    // Metodo per simulare il percorso
    public void drive(double distanzaKm) {
        double carburanteNecessario = distanzaKm * consumoLitriPerKm;

        if (carburanteNecessario > carburanteAttuale) {
            System.out.println(" Carburante insufficiente per percorrere " + distanzaKm + " km.");
        } else {
            carburanteAttuale -= carburanteNecessario;
            System.out.println(" Percorso completato: " + distanzaKm + " km.");
        }
    }

    // Metodo per ottenere il carburante attuale
    public double getGas() {
        return carburanteAttuale;
    }

    // Metodo per fare rifornimento
    public void addGas(double litri) {
        if (litri <= 0) {
            System.out.println("❌ Quantità non valida.");
        } else {
            carburanteAttuale += litri;
            System.out.println(" Aggiunti " + litri + " litri. Totale ora: " + carburanteAttuale + " litri.");
        }
    }
}

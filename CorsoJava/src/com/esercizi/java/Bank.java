package com.esercizi.java;

public class Bank {
    // attributi
    int balance;
    int firstDeposit;
    int firstDraw;
    int secondDeposit;
    int secondDraw;
//una volta definiti gli atributi si può andare su "source" "generate getter end setter"  generare le parti sotto 
    // metodi della classe

    public int getBalance() {
        return balance;
    }

    public int getFirstDeposit() {
        return firstDeposit;
    }

    public int getFirstDraw() {
        return firstDraw;
    }

    public int getSecondDeposit() {
        return secondDeposit;
    }

    public int getSecondDraw() {
        return secondDraw;
    }

    public int getSaldo() {
        return balance + firstDeposit - firstDraw + secondDeposit - secondDraw;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setFirstDeposit(int firstDeposit) {
        this.firstDeposit = firstDeposit;
    }

    public void setFirstDraw(int firstDraw) {
        this.firstDraw = firstDraw;
    }

    public void setSecondDeposit(int secondDeposit) {
        this.secondDeposit = secondDeposit;
    }

    public void setSecondDraw(int secondDraw) {
        this.secondDraw = secondDraw;
    }

    public static void main(String[] args) {
        System.out.println("><(((º> sabusabu <º)))><");

        Bank bank = new Bank();
        bank.setBalance(0);
        bank.setFirstDeposit(500);
        bank.setFirstDraw(100);
        bank.setSecondDeposit(50);
        bank.setSecondDraw(150);

        System.out.println("Saldo iniziale: " + bank.getBalance());
        System.out.println("Primo deposito: " + bank.getFirstDeposit());
        System.out.println("Primo prelievo: " + bank.getFirstDraw());
        System.out.println("Secondo deposito: " + bank.getSecondDeposit());
        System.out.println("Secondo prelievo: " + bank.getSecondDraw());
        System.out.println("Saldo finale: " + bank.getSaldo());
    }
}
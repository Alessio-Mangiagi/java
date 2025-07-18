package com.esercizi.java;

public class BancaEsercizio {
	// attributi
	public int balance;
	public int firstDeposit;
	public int firstDraw;
	public int secondDeposit;
	public int secondDraw;
	public int finalBalance;

	// costruttore completo
	public BancaEsercizio(int balance, int firstDeposit, int firstDraw, int secondDeposit, int secondDraw,
			int finalBalance) {
		this.balance = balance;
		this.firstDeposit = firstDeposit;
		this.firstDraw = firstDraw;
		this.secondDeposit = secondDeposit;
		this.secondDraw = secondDraw;
		this.finalBalance = finalBalance;
	}

	// costruttore semplificato (opzionale)
	public BancaEsercizio(int balance, int firstDeposit, int firstDraw, int secondDeposit, int finalBalance) {
		this(balance, firstDeposit, firstDraw, secondDeposit, finalBalance, 0);
	}

	public int calcolaSaldoFinale() {
		return balance + firstDeposit - firstDraw + secondDeposit - secondDraw;
	}

	public static void main(String[] args) {
		BancaEsercizio account = new BancaEsercizio(100, 300, 400, 200, 100);
		System.out.println("Dati iniziali:");
		System.out.println("Saldo: " + account.balance);
		System.out.println("Primo deposito: " + account.firstDeposit);
		System.out.println("Primo prelievo: " + account.firstDraw);
		System.out.println("Secondo deposito: " + account.secondDeposit);
		System.out.println("Secondo prelievo: " + account.secondDraw);
		System.out.println("Saldo finale: " + account.calcolaSaldoFinale());
	}
}

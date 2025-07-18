package com.secondBank;

public class MainSecondBank {

	public static void main(String[] args) {
		SecondBank conto = new SecondBank(505,200,150,150,200,200,300,50,100);
		System.out.println("deposito : " + conto.getBilancio());
		System.out.println("deposito : " + conto.getPrimoPrelievo());
		System.out.println("deposito : " + conto.getPrimoVersamento());
		System.out.println("deposito : " + conto.getSecondoPrelievo());
		System.out.println("deposito : " + conto.getSecondoVersamento());
	}

}

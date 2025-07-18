package com.frelance;

public class MainFrelancer {

	public static void main(String[] args) {
		
		// CREO L'OGGETTO DELLA CLASSE E INVOCO IL METODO PER IL REDDITO ANNUO NETTO

		Frelancer reddito = new Frelancer(65000, 67, 26, 15);
 
		System.out.println("REDDITO ANNUO NETTO: € " + reddito.getRedditoAnnuoNetto());

	}

}
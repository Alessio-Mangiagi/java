package com.esercizi.java;

import java.util.*;

public class EsercizioGestioneEccezioni {

	public static void main(String[] args) {
//		int a = 4;
//		int b = 0;
//		int c = a/b;
//		System.out.println(c); //codice con errore non gestito

		try {
			int a = 4;
			int b = 0;
			int c = a / b;
		} catch (Exception e) {

		} finally {
			System.out.println("gestito");
		}
		System.out.println("---------------------------------------------------");
//		String [] nomi = {"Luca","Maria","Chiara"};
//		System.out.println("nomi" + nomi[4]);codice con errore non gestito

		try {
			String[] nom = { "Luca", "Maria", "Chiara" };

		} catch (Exception e) {

		} finally {
			System.out.println("gestito");
		}

		System.out.println("---------------------------------------------------");
		// Scrivi un metodo che converte una stringa in intero e gestisce l’eccezione
		// NumberFormatException.
		String testo = "455";
		try {
			int cast = Integer.parseInt(testo);
		} catch (NumberFormatException n) {
			System.out.println("non gestto");
		} finally {
			System.out.println("gestito");
		}
		System.out.println("---------------------------------------------------");
		// ArrayIndexOutOfBoundsException accedendo a un indice non valido in un array.
		try {
			String[] elenco = { "1", "2", "3", "4" };
			System.out.println("elenco: " + elenco[10]);
		} catch (ArrayIndexOutOfBoundsException n) {
			System.out.println("non gestito");
			System.out.println(n.getMessage());
		} finally {
			System.out.println("gestito");
		}
		System.out.println("---------------------------------------------------");
		// Gestisci input non numerico usando Scanner.
		Scanner input = new Scanner(System.in);

		int numeroOne = 0;
		int numeroTwo = 0;

		boolean insertValidation = false;

		while (!insertValidation) {
			try {
				System.out.println("inserisci primo numero");
				numeroOne = input.nextInt();

				System.out.println("inserisci secondo numero");
				numeroTwo = input.nextInt();

				insertValidation = true;

				System.out.println("hai inserito tutto ok");
				System.out.println("numero1: " + numeroOne);
				System.out.println("numero2: " + numeroTwo);

			} catch (InputMismatchException n) {
				System.out.println("inserimento non valido");
				break;
			} finally {
				System.out.println("ciao gianfranco ho usato il not nel while");
				System.out.println("gianfranco sei mitico");
			}

		}
		System.out.println("---------------------------------------------------");
//		In un array di stringhe, controlla se uno degli elementi è null e lancia NullPointerException

		String[] parole = { "parola1", null, "parola3" };
		try {
			for (String p : parole) {
				System.out.println(p.toUpperCase());
			}
		} catch (NullPointerException n) {
			System.out.println(n.getMessage());
		}
		System.out.println("---------------------------------------------------");
		//

	}
}
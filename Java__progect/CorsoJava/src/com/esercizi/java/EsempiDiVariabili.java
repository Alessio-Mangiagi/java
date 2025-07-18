package com.esercizi.java;

public class EsempiDiVariabili {

	public static void main(String[] args) {
		
		System.out.println("\"><(((º> sabusabu <º)))><\"");
	//ctrl+a + shift + f per formattare il codice
		String Cognome = "Mangiagi";
		String Name = "Alessio";
		int number = 10;
		boolean ok = true;
		char symbol = 'A';
		long pIva = 10000000000L;
		double pi = 3.14;
		float e = 2.718f;
		short smallNumber = 1000;
		
		System.out.println("Boolean: " + ok);
		System.out.println("Number: " + number);
		System.out.println("Name: " + Name);
		System.out.println("Cognome: " + Cognome);
		System.out.println("Symbol: " + symbol);
		System.out.println("PIva: " + pIva);
		System.out.println("Pi: " + pi);
		System.out.println("E: " + e);
		System.out.println("Small Number: " + smallNumber);
		
		int code = number + 5; //passaggio di variabile
		System.out.println("Code: " + code);
		
		double a1 = 100;
		float a2 = (float) a1; //cast da double a float	
		
		System.out.println("A2: " + a2);
		
		// catena di cast implicito
		
		int numero2 = 20;
		float num3 = numero2;
		double num4 = num3;
		System.out.println("num4 =" + num4);
		//caste esplicito
		
		double aa = 100.5;
		int bb = (int) aa; // cast da double a int
		System.out.println("bb = " + bb);
				
		
		//int  flot long double gerarchia di peso
		
		
	}

}
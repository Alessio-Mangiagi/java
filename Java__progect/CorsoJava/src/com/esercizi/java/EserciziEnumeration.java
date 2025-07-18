package com.esercizi.java;
import java.util.Scanner;
import java.time.DayOfWeek;
public class EserciziEnumeration {
enum Color{
RED,
YELLOW,
WHITE,
BLUE
}
//------------------------------
enum Week{
	LUNEDì,
	MARTEDI,
	MERCOLEDì,
	GIOVEDì,
	VENERDì,
	SABATO,
	DOMENICA
}
//-------------------------------
enum Stagioni{
	PRIMAVERA,
	ESTATE,
	AUTUNNO,
	INVERNO
}
enum Taglia {
	XS,
	S,
	M,
	L,
	XL,
	XXL
}
//------------------------------
enum Colori{
RED,
YELLOW,
WHITE,
BLUE
}
	public static void main(String[] args) {
		Color red = Color.RED;
		Color yellow = Color.YELLOW;
		Color white = Color.WHITE;
		Color blue = Color.BLUE;
		System.out.println("colore : " + red + yellow + blue + white);
		
		System.out.println("------------------------------------------------------");
		
		//Crea un enum chiamato Giorno con i giorni della settimana. Stampa tutti i valori usando un ciclo for.
		for (Week g :Week.values()){
			System.out.println("giorno: " + g);
		}
		System.out.println("------------------------------------------------------");
		//Crea un enum Stagione con quattro valori. Usa switch per stampare un messaggio diverso per ogni stagione.
		Stagioni s = Stagioni.INVERNO;
		switch (s) {

		case ESTATE:
			System.out.println("estate");
		case AUTUNNO:
			System.out.println("autunno");
		case INVERNO:
			System.out.println("inverno");
		case PRIMAVERA:
			System.out.println("primavera");
		default:
			System.out.println("non c'è niente qui");
		}
		System.out.println("------------------------------------------------------");
		//Chiedi all’utente il giorno della settimana e verifica se è lavorativo.
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter a day of the week (e.g. Monday):");
	        String input = scanner.nextLine().trim().toUpperCase();

	        try {
	            // Convert input string to DayOfWeek enum (case insensitive handling)
	            DayOfWeek day = DayOfWeek.valueOf(input);

	            if (day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY) {
	                System.out.println("It's a weekend.");
	            } else {
	                System.out.println("It's a working day.");
	            }
	        } catch (IllegalArgumentException e) {
	            System.out.println("Invalid day entered.");
	        }

	        scanner.close();
			System.out.println("------------------------------------------------------");
			for(Taglia maglia : Taglia.values()) {
				
				System.out.println("Nome: " + maglia.name() + " Posizione: " + maglia.ordinal());
				//ordinal aggiunge l'indice
				System.out.println("------------------------------------------------------");
				
				//Chiedi all'utente di inserire più colori finché non digita "fine", e verifica se il colore esiste nell'enum.
			System.out.println("inserisci colore ");
			String input1;
			do {
				input1 = scanner.nextLine().toUpperCase();

				if (input1.equals("fine"))
					break;
				try {
					Colori c = Colori.valueOf(input1);
					System.out.println("hai selezionato " + c);
				} catch (IllegalArgumentException e) {
					System.out.println("colore non riconosciuto");
				}

			} while (true);
			scanner.close();
			
		}
	

	}

}

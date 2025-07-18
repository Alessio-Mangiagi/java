package com.esercizi.java;
import java.time.*;
import java.time.temporal.*;
import java.time.Period.*;

public class EserciziDate {

	public static void main(String[] args) {

			/**
			 * System.out.println("\"><(((º> sabusabu <º)))><\"");
			 */
			LocalDate oggi = LocalDate.now();        //LocalDate = classe . oggi= oggetto. LocalDate.now = metodo.
			System.out.println(oggi);
			//stampa la data 1/1/25
			LocalDate data = LocalDate.of(2025, 1, 1);
			System.out.println(data);
			//aggiungi 30 giorni alla data corrente	
			LocalDate trentta = oggi.plusDays(30);
			System.out.println(trentta);
			//giorni a natale
			LocalDate a_natale = LocalDate.now();
			LocalDate Natale = LocalDate.of(2025, 12, 25);
			long giorni = ChronoUnit.DAYS.between(a_natale,Natale);
			System.out.println("giorni a natale : " + giorni);
			//Controlla se il 1 gennaio 2000 è una data passata.
			LocalDate data1 = LocalDate.of(2000, 1, 1);
			boolean passato = data1.isBefore(LocalDate.now());
			System.out.println(passato);
			//
	        LocalDate oggi1 = LocalDate.now();
	        System.out.println("anno : " + oggi1.getYear() +
	                           "\nmese : " + oggi1.getMonth() +
	                           "\ngiorno : " + oggi1.getDayOfMonth());
	        //controllase l'anno è bisestile
	        LocalDate bIsestile = LocalDate.now();
	        boolean annobisestile = bIsestile.isLeapYear();
	        System.out.println("anno corrente bisestile: " + annobisestile);
	        //Dalla data di nascita 2000-04-15, calcola l’età attuale.
	        LocalDate età = LocalDate.now();
	        LocalDate nascita = LocalDate.of(2000, 4, 5);
	        Period adesso = Period.between(età, nascita);
	        System.out.println("oggi ha : " + adesso.getYears());
			//Stampa il giorno della settimana per il 4 luglio 2025.
			LocalDate luglio = LocalDate.of(2025, 7, 4);
			DayOfWeek luglio1 = luglio.getDayOfWeek();
			System.out.println("il 4 era : " + luglio1);
			//Stampa oggi e i prossimi 4 giorni consecutivi.
			LocalDate consecutivi = LocalDate.now();
			
			for (int gii = 0 ; gii<5 ;gii++) {
				System.out.println( consecutivi.plusDays(gii));
			}
			//Stampa la data e l’ora correnti usando LocalDateTime
			LocalDate consecutivi1 = LocalDate.now();
			System.out.println("Data e ora: " + consecutivi1);
			//
			ZonedDateTime oraRoma = ZonedDateTime.now(ZoneId.of("Europe/Rome"));
	        // Ora attuale a New York
	        ZonedDateTime oraNY = ZonedDateTime.now(ZoneId.of("America/New_York"));
	        // Calcolo della differenza
	        long differenzaOre = Duration.between(oraNY.toInstant(), oraRoma.toInstant()).toHours();
	        System.out.println("La differenza oraria tra Roma e New York è di " + differenzaOre + " ore.");
	      //Dato un giorno qualsiasi, trova il giorno lavorativo successivo (lunedì-venerdì).
		
	  		LocalDate questoGiornoQui = LocalDate.of(2025, 07, 11);
	  		LocalDate prossimoGiornoLavorativo = LocalDate.of(2025, 07, 11);
	  				
	  		do {
	  			prossimoGiornoLavorativo = prossimoGiornoLavorativo.plusDays(1);
	  		} while (prossimoGiornoLavorativo.getDayOfWeek() == DayOfWeek.SATURDAY || prossimoGiornoLavorativo.getDayOfWeek() == DayOfWeek.SUNDAY);
	  				
	  		System.out.println("Il prossimo giorno lavorativo dopo il ");
	  		
	  	//Trova la differenza in ore tra Roma e New York in questo momento
			
	  			Instant now = Instant.now();

	  	        ZonedDateTime newYork = now.atZone(ZoneId.of("America/New_York"));
	  	        ZonedDateTime roma = now.atZone(ZoneId.of("Europe/Rome"));
	  	        
	  	        ZoneOffset offsetNewYork = newYork.getOffset();
	  	        ZoneOffset offsetRoma = roma.getOffset();
	  	            
	  	        int differenza = offsetRoma.getTotalSeconds() / 3600 - offsetNewYork.getTotalSeconds() / 3600;
	  	        
	  
			  	System.out.println("La differenza in ore tra Roma e New York è " + differenza);
		
			  	
			  	
			
			
			
		}

	}

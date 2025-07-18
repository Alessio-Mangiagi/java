public class eserciziocicli {public static void main(String[] args) {
System.out.println("inserisci il numero");
		double numero = 6;
		
		if (numero> 0) {
			System.out.println("numero pari");
		}else if (numero < 0) {
			System.out.println("numero non valido");
		}
		else {
			System.out.println(" numero dispari");
		}
				
		System.out.println("-----------------------------------------------------------");
		
		int num1 = 7;
		
		if(num1 %2 == 0) { //modulo(%)il risultato dopo la virgola
			System.out.println("pari");
		} else if(num1<0) {
			System.out.println("numero non valido");
		}else {
			System.out.println("numero dispari");
		}
		System.out.println("-----------------------------------------------------------");
		
		int età = 23;
				
		if(età >= 18) {
			System.out.println("maggiorenne");
		}else {
			System.out.println("minorenne");
		}
		System.out.println("-----------------------------------------------------------");	
		
		int num2 = 25;
		
		if(num2 %5 == 0) {
			System.out.println("multiplo di 5");
		}else {
			System.out.println("non multiplo di 5");
		}
		System.out.println("-----------------------------------------------------------");	
		
		int num3 = 55;
		
		if(num3 >= 10 && num3 <= 100) {
			System.out.println("numero compreso tra 10 e 100");
		}else 
			System.out.println("numero non compreso tra 10 e 100");
		System.out.println("-----------------------------------------------------------");
		
		int num4 = 5;
		int num5 = 6;
		
		if (num4 == num5) {
			System.out.println("numeri uguali");
		}else {
			System.out.println("diversi");
		}
		
		System.out.println("-----------------------------------------------------------");
		
		String ciclo = "";
		if(ciclo.isEmpty()){
			System.out.println("stringa vuota");
		}else {
			System.out.println("stringa piena");
		}
		
		System.out.println("-----------------------------------------------------------");
		//  calcolo anno bisestile
		int anno = 2024;
		
		if((anno % 4 == 0 && anno % 100 != 0 ) ||(anno % 400 == 0)) {
			System.out.println("anno bisestile");
		}else {
			System.out.println("anno non bisestile");
		}
		System.out.println("-----------------------------------------------------------");

		int num6 = 21;
		
		if(num6 %2 == 0 && num6 %3 == 0) {
			System.out.println("divisibile per 2-3");
		}else if (num6 %2 == 0 && num6 %3 != 0) {
			System.out.println("divisibile per 2");
		}else if (num6 %2 != 0 && num6 %3 == 0) {
			System.out.println("divisibile per 3");
		}else {
			System.out.println("numero non valido");
		}
		
		System.out.println("-----------------------------------------------------------");

		//CONFRONTA TRE NUMERI E STAMPA IL MAGGIORE
		
		int a = 1;
		int b = 9;
		int c = 3;
		
		if(a>b && a>c) {
			System.out.println("il maggiore e a = "+ a);
		}else if (b>a && b>c) {
			System.out.println("il maggiore e b = "+b);
		}else {System.out.println("il maggiore e c = "+ c);}
		
		System.out.println("-----------------------------------------------------------");
//CALCOLA IL PREZZO FINALE CON SCONTO: SE>100€, SCONTO 10%; SE >500€; SCONTO 20%
		 float prezzo = 130;
		 float prezzoFinale = prezzo; // Inizializza prezzoFinale con il prezzo originale

        if (prezzo > 500) {
            float sconto = prezzo * 0.20f; // Sconto del 20%
            prezzoFinale = prezzo - sconto;
            System.out.println("Sconto del 20%");
        } else if (prezzo >= 100) {
            float sconto = prezzo * 0.10f; // Sconto del 10%
            prezzoFinale = prezzo - sconto;
            System.out.println("Sconto del 10%");
        }

        System.out.println("Prezzo originale: " + prezzo + "€");
        System.out.println("Prezzo finale: " + prezzoFinale + "€");
        
		System.out.println("-----------------------------------------------------------");

		//DATO UN VOTO DA 0 A 10, STAMPA INSUFFICIENTE, SUFFICIENTE, BUONO, OTTIMO
		int voto = 6;
		
		if(voto<=5) {
			System.out.println("INSUFFICIENTE");
		}else if (voto == 6) {
			System.out.println("SUFFICIENTE");
		}else if (voto == 7) {
			System.out.println("BUONO");
		}else if (voto >= 8 && voto <=10) {
			System.out.println("OTTIMO");
		}else {
			System.out.println("voto non inserito");
		}
		
		System.out.println("-sabu----------------------------------------------------------");

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

    


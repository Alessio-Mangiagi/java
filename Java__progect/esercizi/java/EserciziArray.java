package com.esercizi.java;

public class EserciziArray {
	public static void main(String[] args) {
	

	


	//Crea un array di interi e stampane ogni elemento.

		int[] numero = new int[5];
		numero[0] = 45;
		numero[1] = 65;
		numero[2] = 76;
		numero[3] = 54;
		numero[4] = 23;
		
		
		for (int num = 0; num<numero.length; num++) {
			System.out.println(numero[num]);
		}
			
	System.out.println("--------------------------------------------");
	//Calcola la somma di tutti gli elementi di un array
	
		int[] numeri = new int[5]; //crea un array vuoto di 5 posti
		
		numeri[0] = 1;
		numeri[1] = 10;
		numeri[2] = 24;
		numeri[3] = 6;
		numeri[4] = 2;
		
		int somma = 0; //inizializa la somma
		
		for (int i = 0; i < numeri.length; i++) {
			System.out.print(numeri[i] + " "); //stampa ogni elemento dell array
			somma = somma + numeri[i]; //aggiorna la somma
		}
		
		System.out.println();

		System.out.println("La somma degli elementi del Array è: " + somma);
	
		int [] elementi = {6, 8, 2, 3, 66, 77, 102, 13};
				
				for(int i = elementi.length - 1; i >= 0; i--) {
					
					System.out.println(elementi[i]);
				}	
		
						//Copia tutti gli elementi di un array in un secondo array e stampalo.
		int [] numeri0 = {1 ,2 , 4, 5, 11, 12};
		int [] lista2 = new int[numeri0.length];
		for(int i = 0; i < numeri0.length; i++) {
			 lista2[i] = numeri0[i];
			 }
		for(int i = 0; i < lista2.length; i++) {
			
		}System.out.println(lista2.length + "  " +  numeri0.length);
		//Conta quanti elementi nell’array sono maggiori di 10.
		int [] numeri1 = {1 ,2 , 4, 5, 11, 12};
		int contatore = 0;
		int numeroVerifica = 2;
		for(int i = 0; i < numeri1.length; i++) {
			if(numeri1[i] > numeroVerifica) {
				contatore++;
			}
		}System.out.println(contatore);
		//Controlla se un numero dato (es. 10) è presente nell’array.
		int [] numeri2 = {1 ,2 , 4, 5};
		int cercare = 10;
		for(int i = 0; i < numeri2.length; i++) {
			if(numeri2[i] == 10) {
				System.out.println("numero trovato");
		}else {
			System.out.println("numero non trovato");
			}
		}	
			
		//Calcola la somma di tutti gli elementi di un array.
		System.out.println();
		int [] lista = {1,2,3,4,5,6,7};
		int somma1 = 0;
		for(int i = 0; i < lista.length; i++) {
			somma1 = somma1 + lista[i];
		}System.out.println(somma1);
		// Controlla se gli elementi dell’array sono ordinati 
		int[] array = { 3, 5, 8, 11, 50 };

		boolean ordinata = true;

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] > array[i + 1]) {
				ordinata = false;
				break;
			}
		}

		if (ordinata) {
			System.out.println("ordinato giusto");

		} else {
			System.out.println("ordinato sbagliato");
		}
		
		
			
		//	Dato un array, crea un nuovo array con solo i numeri positivi.
        int[] originali = { -2, 4, -1, 3, 0, 7 };

        // 1. Conta quanti numeri positivi ci sono
        int count = 0;
        for (int i = 0; i < originali.length; i++) {
            if (originali[i] > 0) {
                count++;
            }
        }

        // 2. Crea un nuovo array con la lunghezza esatta
        int[] numeriPositivi = new int[count];

        // 3. Inserisci i numeri positivi nell'array
        int j = 0;
        for (int i = 0; i < originali.length; i++) {
            if (originali[i] > 0) {
                numeriPositivi[j] = originali[i];
                j++;
            }
        }

        // 4. Stampa il nuovo array
        System.out.print("Numeri positivi: ");
        for (int n : numeriPositivi) {
            System.out.print(n + " ");
            //Conta quante volte compare il numero 3 in un array.
            
            
            
        }
	}
}
		
		
		
		
		
		
		
			
			


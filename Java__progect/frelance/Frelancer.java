package com.frelance;

public class Frelancer {
	
	
	// MODEL DELLA CLASSE

		// ATTRIBUTI

		int redditoAnnuoLordo;
		int coeffRedd;
		int tassaInps;
		int tassaIrpef;
		
		// COSTRUTTORE DELLA CLASSE

		public Frelancer(int redditoAnnuoLordo, int coeffRedd, int tassaInps, int tassaIrpef) {

			this.redditoAnnuoLordo = redditoAnnuoLordo;
			this.coeffRedd = coeffRedd;
			this.tassaInps = tassaInps;
			this.tassaIrpef = tassaIrpef;
			
			
		}
		
		
		// METODI DELLA CLASSE

		public int getUtileTasse() {

			return redditoAnnuoLordo * coeffRedd / 100;

		}

		public int getTassaInps() {

			return getUtileTasse() * tassaInps / 100;

		}

		public int getTassaIrpef() {

			return getUtileTasse() * tassaIrpef/100;

		}

		public int getRedditoAnnuoNetto() {

			return (redditoAnnuoLordo - (getTassaInps() + getTassaIrpef()));

		}

	}
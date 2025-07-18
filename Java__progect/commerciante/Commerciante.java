package com.commerciante;

public class Commerciante {
	int redditoAnnuoLordo;
	int coerffRedd;
	int aliquotaInps;
	int aliquotaIrpef;

	public int getUtileTasse() {
		return redditoAnnuoLordo * coerffRedd/100;
	}
	
	public int getTassaIrpef() {
		return getUtileTasse() * aliquotaIrpef/ 100;
	}
	
	public int getRedditoNettoMensile() {
		return redditoAnnuoLordo - (getTassaIrpef() +aliquotaInps );
	}
	
	
	public void setredditoAnnuoLordo(int redditoAnnuoLordo) {
		this.redditoAnnuoLordo = redditoAnnuoLordo;
	}


	public void setCoerffRedd(int coerffRedd) {
		this.coerffRedd = coerffRedd;
	}


	public void setaliquotaInps(int aliquotaInps) {
		this.aliquotaInps = aliquotaInps;
	}


	public void setaliquotaIrpef(int aliquotaIrpef) {
		this.aliquotaIrpef = aliquotaIrpef;
	}


	public Commerciante(int redditoAnnuoLordo, int coerffRedd, int aliquotaInps, int aliquotaIrpef) {
		super();
		this.redditoAnnuoLordo = redditoAnnuoLordo;
		this.coerffRedd = coerffRedd;
		this.aliquotaInps = aliquotaInps;
		this.aliquotaIrpef = aliquotaIrpef;
	}


	public Commerciante() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

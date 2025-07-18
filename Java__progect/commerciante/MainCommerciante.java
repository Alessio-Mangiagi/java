package com.commerciante;

public class MainCommerciante {

	public static void main(String[] args) {
	
		Commerciante reddito = new Commerciante();
		reddito.setredditoAnnuoLordo(120000);
		reddito.setaliquotaIrpef(384);
		reddito.setaliquotaInps(34);
		reddito.setCoerffRedd(56);
		System.out.println();
		
	}

}

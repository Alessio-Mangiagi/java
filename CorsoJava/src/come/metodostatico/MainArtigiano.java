package come.metodostatico;

public class MainArtigiano {

	public static void main(String[] args) {
		Artigiano.setRedditoAnnuoLordo(85000);
		Artigiano.setCoeffRedd(67);
		Artigiano.setImportoInps(3500);
		Artigiano.setAliquotaIrpef(15);
		System.out.println("Reddito mensile annuo : " + Artigiano.getRedditoNettoMensile());
		
	}

}

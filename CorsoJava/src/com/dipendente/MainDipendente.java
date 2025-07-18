package com.dipendente;

public class MainDipendente {
	public static void main(String[] args) {
		
		Dipendente dipendente = new Dipendente (3200,160,20);
		System.out.println(" Stipendio: € " + dipendente.getStipendio());
		System.out.println(" Ore:  " + dipendente.getOreLavorate ());
		System.out.println(" retribuzione oraria: € " + dipendente.getRetribuzioneOraria());
		
}

}

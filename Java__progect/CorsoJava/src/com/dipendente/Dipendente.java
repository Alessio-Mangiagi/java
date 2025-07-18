package com.dipendente;



public class Dipendente {
	int stipendio;
	int oreLavorate;
	int retribuzioneOraria;
	
	
	
	
	
	
	
	
	public Dipendente(int stipensio, int oreLavorate, int retribuzioneOraria) {
		super();
		this.stipendio = stipensio;
		this.oreLavorate = oreLavorate;
		this.retribuzioneOraria = retribuzioneOraria;
	}

	public int getStipendio () {
		return retribuzioneOraria * oreLavorate;
	}

	public int getOreLavorate () {
		return stipendio / retribuzioneOraria;
	}

	public int getRetribuzioneOraria() {
		return stipendio / oreLavorate;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

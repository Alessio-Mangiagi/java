package com.oggetti;

public class PrimoOggetto {
	public PrimoOggetto(String nome, String cognome, String città, String nazione) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.città = città;
		this.nazione = nazione;
	}

	String nome;
	String cognome;
	String città;
	String nazione;
	// questi sono attributi con tipo e nome

	// si fa usando i metodi tasto destro- source e poi si scegli ei l costruttore
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getCittà() {
		return città;
	}

	public void setCittà(String città) {
		this.città = città;
	}

	public String getNazione() {
		return nazione;
	}

	public void setNazione(String nazione) {
		this.nazione = nazione;
	}

	public static void main(String[] args) {
		// inizializzazione del costruttore o della variabile di istanza

		// ci va scritto il nome della public class in questo caso il nome del file =
		// PrimoOggetto
		PrimoOggetto intro = new PrimoOggetto("Alessio", "Mangiagi", "Catania", "Italia");
		System.out.println("Nome completo: " + intro.getNome());

	}

}

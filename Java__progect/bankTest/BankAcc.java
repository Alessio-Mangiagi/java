package com.bankTest;

public class BankAcc {
	private int bilancio;
	private int primoVersamento;
	private int primoPrelievo;
	private int secondoVersamento;
	private int secondoPrelievo;
	private int impostaBollo;
	private int canoneAnnuo;

	public int getBilancio() {
		return bilancio;
	}

	public void setBilancio(int bilancio) {
		this.bilancio = bilancio;
	}

	public int getImpostaBollo() {
		return impostaBollo;
	}

	public void setImpostaBollo(int impostaBollo) {
		this.impostaBollo = impostaBollo;
	}

	public int getCanoneAnnuo() {
		return canoneAnnuo;
	}

	public void setCanoneAnnuo(int canoneAnnuo) {
		this.canoneAnnuo = canoneAnnuo;
	}

	public void setPrimoVersamento(int primoVersamento) {
		this.primoVersamento = primoVersamento;
		bilancio += primoVersamento;
	}

	public void setPrimoPrelievo(int primoPrelievo) {
		this.primoPrelievo = primoPrelievo;
		bilancio -= primoPrelievo;
	}

	public void setSecondoVersamento(int secondoVersamento) {
		this.secondoVersamento = secondoVersamento;
		bilancio += secondoVersamento;
	}

	public void setSecondoPrelievo(int secondoPrelievo) {
		this.secondoPrelievo = secondoPrelievo;
		bilancio -= secondoPrelievo;
	}

	public int getSaldoFinale() {
		return bilancio - impostaBollo - canoneAnnuo;
	}
}
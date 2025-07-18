package com.secondBank;

public class SecondBank {
	public int bilancio;
	public int primoVersamento;
	public int primoPrelievo;
	public int secondoVersamento;
	public int secondoPrelievo;
	public int terzoVersamento;
	public int terzoPrelievo;
	public int impostaBollo;
	public int canoneAnnuo;

	public SecondBank(int bilancio, int primoVersamento, int primoPrelievo, int secondoVersamento, int secondoPrelievo,
			int impostaBollo, int canoneAnnuo, int i, int j) {
		super();
		this.bilancio = bilancio;
		this.primoVersamento = primoVersamento;
		this.primoPrelievo = primoPrelievo;
		this.secondoVersamento = secondoVersamento;
		this.secondoPrelievo = secondoPrelievo;
		this.impostaBollo = impostaBollo;
		this.canoneAnnuo = canoneAnnuo;
	}

	public int getPrimoVersamento() {
		return bilancio + primoVersamento;
	}

	public int getPrimoPrelievo() {
		return getPrimoVersamento() - primoPrelievo;
	}

	public int getSecondoVersamento() {
		return getPrimoPrelievo() + secondoVersamento;
	}

	public int getSecondoPrelievo() {
		return getSecondoVersamento()- secondoPrelievo;
	}

	public int getTerzoVersamento() {
		return getSecondoPrelievo() + terzoVersamento;
	}

	public int getTerzoPrelievo() {
		return getTerzoVersamento() - terzoPrelievo;
	}

	public int getImpostaBollo() {
		return getTerzoPrelievo() - impostaBollo;
	}

	public int getCanoneAnnuo() {
		return getImpostaBollo() * canoneAnnuo;
	}

	public int getBilancio() {
		return bilancio;
	}

	public static void main(String[] args) {

	}

}

package com.bankTest;

public class mainBankAcc {

	public static void main(String[] args) {
		BankAcc bankAcc = new BankAcc();
		
		bankAcc.setBilancio(1000);
		bankAcc.setPrimoVersamento(500);
		bankAcc.setPrimoPrelievo(200);
		bankAcc.setSecondoVersamento(300);
		bankAcc.setSecondoPrelievo(100);
		bankAcc.setImpostaBollo(34);
		bankAcc.setCanoneAnnuo(50);

		System.out.println("Saldo finale: " + bankAcc.getSaldoFinale());
	}
}
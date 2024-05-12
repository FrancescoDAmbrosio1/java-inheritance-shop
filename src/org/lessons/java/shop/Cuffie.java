package org.lessons.java.shop;

public class Cuffie extends Prodotto{

	public String colore;
	public boolean wireless;
	
	public Cuffie(String nome, String marca, double prezzo, double iva, String colore,
			boolean wireless) {
		super(nome, marca, prezzo, iva);
		this.colore = colore;
		this.wireless = wireless;
	}
	
	public String isWireless() {
		if(this.wireless == true) {
			return " sono Wireless.";
		} else {
			return " sono cablate.";
		}
	}
	public String toString() {
		return  super.toString() + "Inoltre, le Cuffie selezionate di colore " 
				+ this.colore + isWireless() + " - Codice prodotto: " 
				+ this.codiceLeftPad();
	}
}

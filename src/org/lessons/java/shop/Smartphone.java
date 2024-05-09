package org.lessons.java.shop;

public class Smartphone extends Prodotto{

	public String imei;
	public int memoria;
	
	public Smartphone(String nome, String marca, double prezzo, double iva,
			String imei, int memoria) {
		super(nome, marca, prezzo, iva);
		this.imei = imei;
		this.memoria = memoria;
		
	}
	
	public String getInfoTelefono() {
		return  "Lo smartphone " + marca + " " + nome + " ha IL seguente IMEI: " + this.imei +
				" ed una memoria di " + memoria + " Giga. - " + this.codiceLeftPad();
	}
	
}

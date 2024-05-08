package org.lessons.java.shop;

public class Smartphone extends Prodotto{

	public long imei;
	public int memoria;
	
	public Smartphone(String nome, String marca, double prezzo, double iva,
			long imei, int memoria) {
		super(nome, marca, prezzo, iva);
		this.imei = imei;
		this.memoria = memoria;
		
	}
	
}

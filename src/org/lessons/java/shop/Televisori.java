package org.lessons.java.shop;

public class Televisori extends Prodotto{
	
	public int dimensione;
	public boolean smart;
	
	public Televisori(String nome, String marca, double prezzo, double iva,
			int dimensione, boolean smart) {
		super(nome, marca, prezzo, iva);
		this.dimensione = dimensione;
		this.smart = smart;
	}

}

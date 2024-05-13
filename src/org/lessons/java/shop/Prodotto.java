package org.lessons.java.shop;


public class Prodotto {
	private static int codice;
	public String nome;
	public String marca;
	public double prezzo;
	public double iva;
	
	public Prodotto(String nome, String marca, double prezzo, double iva) {
		this.codice = creaCodice();
		this.nome = nome;
		this.marca = marca;
		this.prezzo = prezzo;
		this.iva = iva;
	}
	public int creaCodice() {
		double codiceProvvisorio = Math.random();
		codice =  (int) (codiceProvvisorio * 100);
		return codice;
	}
	public void prezzoBase() {
		System.out.println("Il prezzo base del prodotto " + nome + " è: " + prezzo + " €");
	}
	public String prezzoConIva() {
		double prezzoIva =  prezzo + (prezzo * (iva/100));
		String prezzoRounded = String.format("%.02f", prezzoIva);
		return prezzoRounded;
	}
	public void nomeEsteso() {
		System.out.println("Il nome esteso del prodotto è: " + codice + "-" + nome);
	}
	public String codiceLeftPad() {
		String codiceStringato = "" + codice;
		String codiceEsteso;
		if(codiceStringato.length() < 8) {
			codiceEsteso = String.format("%08d", codice);	
		} else {
			codiceEsteso = codiceStringato; 
		}
		return codiceEsteso;
	}

	@Override
	public String toString() {
		return "\nIl prodotto selezionato " + marca + " " + nome + " " 
				+ "ha un prezzo di " + prezzoConIva() + " € al quale è stata applicata l'iva al "
				+ iva + " %. \n";
	}
	
}

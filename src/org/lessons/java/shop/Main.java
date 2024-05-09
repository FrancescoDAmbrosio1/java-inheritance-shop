package org.lessons.java.shop;

public class Main {

	public static void main(String[] args) {
		
		Smartphone p = new Smartphone("SMARTPHONE", "iPhone", 359.00, 21, "78934535900", 128);
		System.out.println(p.getInfoTelefono());
		
		Televisori tv = new Televisori("G2-567", "LG", 399.99, 21, 48, true);
		System.out.println(tv.getInfoTv());
		
		Cuffie cuffia1 = new Cuffie("Cuf-Power", "SONY", 250.99, 21, "blu", false);
		System.out.println(cuffia1.getInfoCuffie());
		
	}

}

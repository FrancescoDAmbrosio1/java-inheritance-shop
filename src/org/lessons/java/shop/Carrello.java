package org.lessons.java.shop;

import java.util.Scanner;

public class Carrello {

	public static void main(String[] args) {
		
		Prodotto prodotto = new Prodotto(null, null, 0, 0);

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Selezionare il prodotto a scelta tra : \n" +
		"- Smartphone \n" + "- Televisore \n" + "- Cuffie \n");
		String scelta = scan.nextLine();
		//trasmormo in minuscolo la scelta utente
		String sceltaLower = scelta.toLowerCase();
			
		switch(sceltaLower) {
		case "smartphone" :
			
			System.out.println("Inserisci i seguenti dati del prodotto selezionato: \n");
			System.out.print("Nome --> \n");
			prodotto.nome = scan.nextLine();
			System.out.print("Marca --> \n");
			prodotto.marca = scan.nextLine();
			System.out.print("Prezzo in € --> \n");
			prodotto.prezzo = scan.nextDouble();
			System.out.print("Iva % (indicare 22 o 4 --> ");
			prodotto.iva = scan.nextDouble();
			prodotto = new Smartphone(prodotto.nome, prodotto.marca, prodotto.prezzo,
					prodotto.iva, "78934535900", 128);
			System.out.println(prodotto.toString());
			
			break;
		case "televisore":
			System.out.println("Inserisci i seguenti dati del prodotto selezionato: \n");
			System.out.print("Nome --> \n");
			prodotto.nome = scan.nextLine();
			System.out.print("Marca --> \n");
			prodotto.marca = scan.nextLine();
			System.out.print("Prezzo in € --> \n");
			prodotto.prezzo = scan.nextDouble();
			System.out.print("Iva % (indicare 22 o 4 --> ");
			prodotto.iva = scan.nextDouble();
			prodotto = new Televisori(prodotto.nome , prodotto.marca , prodotto.prezzo, 
					prodotto.iva, 48, true);
			System.out.println(prodotto.toString());
			break;
			
		case "cuffie":
			System.out.println("Inserisci i seguenti dati del prodotto selezionato: \n");
			System.out.print("Nome --> \n");
			prodotto.nome = scan.nextLine();
			System.out.print("Marca --> \n");
			prodotto.marca = scan.nextLine();
			System.out.print("Prezzo in € --> \n");
			prodotto.prezzo = scan.nextDouble();
			System.out.print("Iva % (indicare 22 o 4 )--> ");
			prodotto.iva = scan.nextDouble();
			prodotto = new Cuffie(prodotto.nome, prodotto.marca, prodotto.prezzo, 
					prodotto.iva, "blu", false);
			System.out.println(prodotto.toString());
			break;
		default:
			System.out.println("----------- Prodotto inserito non corretto -----------");
		}
	}

}

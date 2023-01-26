/*
 * Biglietto del treno: Il programma dovrà chiedere all’utente il numero di chilometri che vuole percorrere e l’età del passeggero. 
 * Sulla base di queste informazioni dovrà calcolare il prezzo totale del viaggio, secondo queste regole: il prezzo del biglietto è 
 * definito in base ai km (0.21 € al km) va applicato uno sconto del 20% per i minorenni va applicato uno sconto del 40% per gli over 65 
 * Come sempre create un progetto java con lo stesso nome del repo (java-biglietto-treno), aggiungete un package org.lessons.java e 
 * una classe CalcolaBiglietto. Il programma va implementato nel metodo main della classe CalcolaBiglietto. Per acquisire l’input 
 * dell’utente usate la classe Scanner, come visto stamattina a lezione.
 */

package org.lessons.java.biglietto;

import java.util.Scanner;

public class CalcolaBiglietto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double ticketPricePerKm = 0.21;

		int underagePercentSale = 20;

		int over65PercentSale = 40;

		double travelCost;

		Scanner s = new Scanner(System.in);

		System.out.println("Insert Kms:");
		int kms = Integer.parseInt(s.nextLine());

		System.out.println("Insert your age");
		int age = Integer.parseInt(s.nextLine());

		if (age < 18) {
			travelCost = (kms * ticketPricePerKm) - (kms * ticketPricePerKm) * underagePercentSale / 100;
		} else if (age > 65) {
			travelCost = (kms * ticketPricePerKm) - (kms * ticketPricePerKm) * over65PercentSale / 100;
		} else {
			travelCost = (kms * ticketPricePerKm);
		}

		System.out.println("Your ticket price is: " + travelCost + " Euro");

		s.close();
	}

}

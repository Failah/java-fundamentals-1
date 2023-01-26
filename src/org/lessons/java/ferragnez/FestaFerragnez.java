/*
 * Festa Ferragnez: State lavorando col servizio di sicurezza dei Ferragnez e il vostro compito è di assicurarvi che accedano alla festa 
 * solo gli invitati presenti sulla lista. Nel programma bisogna: creare e inizializzare l’array contenente i nomi degli invitati 
 * chiedere all’utente come si chiama verificare che il nome sia presente nella lista lasciarlo entrare o rispedirlo cortesemente da dove è 
 * venuto :sunglasses: Bonus se avete usato il ciclo for per cercare il nome nella lista nella consegna base, implementare lo stesso 
 * programma usando il ciclo while, e viceversa Buon lavoro e buon weekend! :slightly_smiling_face: :tada: Lista invitati: Dua Lipa, 
 * Paris Hilton, Manuel Agnelli, J-Ax, Francesco Totti, Ilary Blasi, Bebe Vio, Luis, Pardis Zarei, Martina Maccherone, Rachel Zeili
 */

package org.lessons.java.ferragnez;

import java.util.Scanner;

public class FestaFerragnez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] guestsList = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi",
				"Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeili" };

		Scanner s = new Scanner(System.in);
		System.out.println("Insert your name: ");
		String username = s.nextLine().trim();

		s.close();

		for (int i = 0; i < guestsList.length; i++) {
			if (username.toLowerCase().equals(guestsList[i].toLowerCase())) {
				System.out.println("WELCOME " + username + "!");
				return;
			}
		}
		System.out.println("You are not on the list!");
		return;
	}
}

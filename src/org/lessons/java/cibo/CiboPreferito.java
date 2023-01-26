/*
 * Cibi preferiti: Nel programma inizializzate un array (con i metodi visti a lezione) con la classifica dei vostri cibi preferiti 
 * (minimo 5, massimo 10 elementi) Poi stampate a video: - la lunghezza della classifica - il vostro cibo top 
 * (prima posizione della classifica) - il vostro cibo preferito ma non troppo (ultima posizione della classifica) 
 * BONUS Stampate a video anche il cibo di mezza classifica, cioè che si trova nella posizione mediana
 */

package org.lessons.java.cibo;

public class CiboPreferito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] favouriteFoods = { "Pizza", "Frutta", "Carne", "Gelato", "Pasta", "Insalatona", "Sushi" };

		System.out.println("Array length is: " + favouriteFoods.length);

		System.out.println("My first favourite food is: " + favouriteFoods[0]);

		System.out.println("My last favourite food is: " + favouriteFoods[favouriteFoods.length - 1]);

		System.out.println("My middle favourite food is: " + favouriteFoods[(favouriteFoods.length - 1) / 2]);
	}

}

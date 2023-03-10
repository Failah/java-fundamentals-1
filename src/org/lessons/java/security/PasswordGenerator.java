/*
 * Il programma deve fare quanto segue: salvare in opportune variabili il nome, cognome, colore preferito e data di nascita 
 * di un utente suddivisa in giorno, mese e anno in numero generare (e stampare a video) una password concatenando nome, cognome, 
 * colore preferito e somma di giorno, mese e anno di nascita, separate dal carattere -
 * Esempio: ho un utente che si chiama Pinco Pallo, nato il 12/05/1994, il cui colore preferito è il magenta La sua 
 * password sarà Pinco-Pallo-magenta-2011 
 */

package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		String surname;
		String color;
		int year;

		Scanner s = new Scanner(System.in);
		System.out.println("Insert your name: ");
		name = s.nextLine();

		System.out.println("Insert your surname: ");
		surname = s.nextLine();

		System.out.println("Insert your favourite color: ");
		color = s.nextLine();

		System.out.println("Insert your year of birth: ");
		year = s.nextInt();

		s.close();

		System.out.println("Your password is: " + name + "-" + surname + "-" + color + "-" + year);
	}

}

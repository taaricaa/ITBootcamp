package itbootcamp.nesto;

import java.util.Scanner;

public class Zadatak_2_0206 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Napisati program koji na osnovu unetog naziva meseca ispisuje koliko ima
		// meseci u godini koji pocinju na to slovo(na taj glas) - za resavanje ovog
		// zadatka koristiti switch

		System.out.println("Unesete naziv meseca malim slovima");
		Scanner s = new Scanner(System.in);

		String mesec = s.next();

		switch (mesec) {
		case "januar":
		case "jun":
		case "jul":
			System.out.println("Tri meseca u godini pocinju na slovo J ");
			break;
		case "februar":
			System.out.println("Samo ovaj mesec pocinje slovom F");
			break;
		case "septembar":
		System.out.println("Samo ovaj mesec pocinje slovom S");
		break;
		case "oktobar":
			System.out.println("Samo ovaj mesec pocinje slovom O");
			break;
		case "novembar":
			System.out.println("Samo ovaj mesec pocinje slovom N");
			break;
		case "decembar":
			System.out.println(" Samo ovaj mesec pocinje slovom D");
			break;
		case "mart": case "maj":
			System.out.println( "Dva meseca u godini pocinju na slovo M");
			break;
		case "april": case"avgust" :
			System.out.println("Dva meseca u godini pocinju na slovo A");
			break;
			
			default:
				System.out.println("Unesite pravilno naziv meseca");

	}
	}
}

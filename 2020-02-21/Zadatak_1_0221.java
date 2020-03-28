package itbootcamp.nesto;

import java.util.Scanner;

public class Zadatak_1_0221 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Napisati program koji ima meni za samousluznu kasu u prodavnici. Meni za
		 * potrosace sadrzi sledece opcije:
		 * 
		 * 0 - Izlaz iz programa 1 - dodavanje cene proizvoda na racun (ubacivanje u
		 * potrosacku korpu) 2 - naplata racuna
		 * 
		 * Ukoliko korisnik unese opciju 0 program se zavrsava. Ukoliko korisnik unese
		 * opciju 1 program pita korisnika da unese cenu proizvoda i ta cena se dodaje
		 * na racun u prodavnici. Ukoliko korisnik unese opciju 2 program pita korisnika
		 * da unese kolicinu novca za naplatu racuna. Ukoliko korisnik unese vrednost
		 * manju od vrednosti racuna, potrebno je da se ispise greska, bez umanjenja
		 * racuna i da se ponovo ispise meni. Ukoliko korisnik unese vrednost vecu ili
		 * jednaku od cene racuna ispisuje se kusur i racun se ponovo postavlja na nulu.
		 * Zatim se ponovo ispisuje meni.
		 * 
		 */

		System.out.println("Izaberite opciju koju zelite. 0 za izlaz, 1 dodavanje cena, 2 za naplatu racuna");

		Scanner s = new Scanner(System.in);

		Double i = s.nextDouble();
		Double racun = 0.00;
		Double cena = 0.00;

		do {

			if (i < 0 && i > 2) {
				System.out.println(
						" Greska! Unesite ispravnu vrednost, 0 ako zelite da izadjete, 1 za dodavanje, 2 za naplatu");
				i = s.nextDouble();
			}

			if (i == 1) {

				System.out.println("Unesite cenu proizvoda:");
				cena = s.nextDouble();
				racun = racun + cena;
				System.out.println("Trenutno stanje je " + racun);
				System.out.println("Da li zelite da zavrsite kupovinu. Opcija 1 da, 2 da platite, 0 da izadjete");
				i = s.nextDouble();

			}

			if (i == 2) {
				System.out.println("Unesite iznos koji dajete");
				Double iznos = s.nextDouble();
				if (iznos >= racun) {
					Double kusur = iznos - racun;
					System.out.println("Hvala sto se platili. Vas kusur iznosi " + kusur);
					racun = 0.00;
					System.out
							.println("Izaberite opciju koju zelite. 0 za izlaz, 1 dodavanje cena, 2 za naplatu racuna");
					i = s.nextDouble();
				} else {
					System.out.println("Greska");
					System.out.println("Da li zelite da zavrsite kupovinu. Opcija 1 da, 2 da platite, 0 da izadjete");
					i = s.nextDouble();
				}
			}
		} while (i != 0);
		System.out.println("Hvala sto ste koristili samousluznu kasu");

	}

}

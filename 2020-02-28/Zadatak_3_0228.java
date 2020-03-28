package Selenium;

import java.util.Scanner;

public class Zadatak_3_0228 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Napisati program koji ucitava duzinu niza, niz i proverava da li je niz
		 * rastuci. Primer1 niza: 3 54 123 18 Ispis: Niz nije rastuci. Primer2 niza: 71
		 * 422 1001 5054 Ispis: Niz je rastuci.
		 */

		Scanner s = new Scanner(System.in);

		System.out.println("Unesite duzinu niza");
		int d = s.nextInt();
		int[] niz = new int[d];

		System.out.println("Unesite brojeve koje zelite da dodate u niz");

		for (int i = 0; i < d; i++) {
			niz[i] = s.nextInt();
		}

		for (int i = 0; i < niz.length; i++) {

			if (i != 0) {

				if (niz[i] < niz[i - 1]) {
					System.out.println("Niz nije rastuci");
					break;
				}
				if (niz[i] == niz[i-1]) {
					
				System.out.println(" Niz nije rastuci"); break;
				}
				
		        if (i+1==niz.length && niz[i] > niz[i-1]) {
						System.out.println("Niz je rastuci");

					}
					
				}

			}

	}
}


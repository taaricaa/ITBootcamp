package javavracanje;

import java.util.Scanner;

public class Zadatak_1_0302 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Napisati program koji ce na standarnom izlazu ispisati poruku “Niz je
		 * palindrom” ili “Niz nije palindrom” (u zavisnosti da li niz jeste ili nije
		 * palindrom). Korisnik unosi int [ ]
		 */

		Scanner s = new Scanner(System.in);
		System.out.println("Unesite broj elemenata niza");

		int n = s.nextInt();

		while (n <= 1) {
			System.out.println("Niz ne moze imati 0 ili jedan element. Unesite opet:");
			n = s.nextInt();

		}

		int i;
		int[] niz = new int[n];

		System.out.println("Unesite elemente niza");

		for (i = 0; i < n; i++) {
			niz[i] = s.nextInt();
		}

		int nesto = 0;

		for (i = 0; i <= n / 2 && n != 0; i++) {

			if (niz[i] != niz[n - i - 1]) {
				nesto = 1;
				break;
			}
		}

		if (nesto == 1)
			System.out.println("Nije palindrome");
		else
			System.out.println("Niz je palindrome");

	}
}

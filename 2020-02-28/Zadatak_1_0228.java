package Selenium;

import java.io.InputStream;
import java.util.Scanner;

public class Zadatak_1_0228 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Korisnik ucitava niz od n elemenata niza, kao i neki broj br. Program
		 * ispisuje elemente niza deljive brojem br.
		 */

		Scanner s = new Scanner(System.in);

		System.out.println("Unesite broj elemenata u nizu");
		int n = s.nextInt();
		int[] brojevi = new int[n];

		System.out.println("Unesite elemente niza");
		for (int i = 0; i < n; i++) {

			brojevi[i] = s.nextInt();

		}

		System.out.println("Unesite broj sa kojim proveravate deljivost");
		int br = s.nextInt();

		for (int m = 0; m < brojevi.length; m++) {
			if (brojevi[m] % br == 0)
				System.out.println(brojevi[m]);

		}
	}
}

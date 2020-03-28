package Selenium;

import java.util.Scanner;

public class Zadatak_2_0228 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Napisati program koji ucitava duzinu niza, niz i ispisuje niz inverznim
		 * redosledom. Primer niza: 32 54 123 18 Ispis: 18 123 54 32
		 */

		System.out.println("Unesite duzinu niza");

		Scanner s = new Scanner(System.in);

		int d = s.nextInt();
		int[] niz = new int[d];

		System.out.println(" Unesite brojeve u niz");

		for (int i = 0; i < d; i++) {
			niz[i] = s.nextInt();

		}

		for (int i = niz.length - 1; i >= 0; i--) {
			System.out.println(niz[i]);

		}
	}
}

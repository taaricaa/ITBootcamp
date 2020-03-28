package javavracanje;

import java.util.Scanner;

public class Zadatak_2_0302 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*Napisati program koji ce na standardnom izlazu
		 *  ispisati proizvod elemenata niza
		 *   koji su veci od svog indeksa (preko konzole uneti duzinu i clanove niza)
		 */
		
		Scanner s = new Scanner(System.in);
		System.out.println("Unesite broj elemenata niza");

		int n = s.nextInt();

		while (n <= 1) {
			System.out.println("Niz ne moze imati 0 ili jedan element. Unesite opet:");
			n = s.nextInt();

		}

		int i;
		int proizvod=1;
		int[] niz = new int[n];
		boolean provera = false;

		System.out.println("Unesite elemente niza");

		for (i = 0; i < n; i++) {
			niz[i] = s.nextInt(); 
		
			if (niz[i] > i) {
				provera = true;
				proizvod = proizvod * niz[i]; }
		}
			if (provera) {
				System.out.println(
						 " Proizvod brojeva je: " + proizvod);
			} else {
				System.out.println(
						"Nema brojeva u nizu cija je vrednost veca od svog indeksa.");}

		
				
		
	}

}

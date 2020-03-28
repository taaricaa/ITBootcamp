package itbootcamp.nesto;

import java.util.Scanner;

public class Zadatak_2_0220 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Napisati program koji unosi i sabira brojeve dokle god nije unesen negativan
		 * broj, i ispisuje njihov zbir (zbir pozitivnih brojeva). primer: ako korisnik
		 * unese 1 2 5 3 -1, program treba da ispise 11
		 * 
		 */
		Scanner s = new Scanner(System.in);

		int i;
		int zbir;
		zbir=0;

		System.out.println("Unesite brojeve koje zelite da saberete");

		do {
			i = s.nextInt();

			if (i > 0) {
				zbir += i;
			}
		}

		while (i >= 0);
		System.out.println(zbir);
	}

}

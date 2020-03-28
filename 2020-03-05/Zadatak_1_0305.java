package domacijava;

import java.util.Scanner;

public class Zadatak_1_0305 {

	public static int duzina(Scanner s) {
		int n;
		System.out.print("Unesite br clanova ");
		n = s.nextInt();

		while (n <= 1) {
			System.out.println("Niz mora imati vise od jednog clana. unesite opet");
			n = s.nextInt();
		}

		return n;

	}

	public static int[] unesi(Scanner s, int m) {
		int[] n = new int[m];
		System.out.print("Unesite clanove niza");
		for (int i = 0; i < m; i++) {
			n[i] = s.nextInt();
		}
		return n;
	}

	public static void proveri(int[] niz) {
		int nesto = 0;
		int n = niz.length;
		for (int i = 0; i <= n / 2 && n != 0; i++) {

			if (niz[i] != niz[n - i - 1]) {
				nesto = 1;
				break;
			}
		}

		if (nesto == 1)
			System.out.println("Nije palindrome");
		else {
			System.out.println("Niz je palindrome");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;

		n = duzina(sc);
		int[] niz = new int[n];
		niz = unesi(sc, n);
		proveri(niz);

	}

}

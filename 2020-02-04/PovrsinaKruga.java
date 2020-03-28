package itbootcamp.nesto;

import java.util.Scanner;

public class PovrsinaKruga {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Unesite poluprecnik kruga");

		Scanner s = new Scanner(System.in);

		float r = s.nextFloat();

		double rezultat = r * r * 3.14;

		if (r <= 0) {
			System.out.println("Nije dobra forma unosa");
		}

			if (r > 0) {

				System.out.println("Povrsina kruga je");
				System.out.println(rezultat);

	}
		}
}

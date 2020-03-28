package itbootcamp.nesto;

import java.util.Scanner;

public class Zadatak_1_0206 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Unesete broj kilograma");
		Scanner s = new Scanner(System.in);
		
		double kg = s.nextDouble();
		
		if (kg < 660 && kg > 0) {
			System.out.println( "Lift je pokrenut, nema preopterecenja");
		}
		
		else if ( kg == 680) {
			System.out.println("Lift je na granici");
		
		}
		else if (kg > 680) {
			System.out.println("Lift je preopterecen");
		}
		else {
			System.out.println("Unesite pozitivnu vrednost");
		}
	}

}

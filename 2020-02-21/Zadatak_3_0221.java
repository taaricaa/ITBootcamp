package itbootcamp.nesto;

import java.util.Scanner;

public class Zadatak_3_0221 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int a, b, ab, cb;
		System.out.println("Unesite duzine stranica pravougaonika koji se ispisuje: ");
		a = sc.nextInt();
		b = sc.nextInt();
		if (a == 0 || b == 0)
			System.out.println("Duzina stranice mora biti pozitivna");
		else {
			a = Math.abs(a);// 
			b = Math.abs(b);
			for (ab = 0; ab < a; ab++) {
				for (cb = 0; cb < b; cb++)
					System.out.print("* ");
				System.out.println();
			}
		}
	}

		
		
		
	}


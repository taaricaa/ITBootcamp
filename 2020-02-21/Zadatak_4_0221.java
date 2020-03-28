package itbootcamp.nesto;

import java.util.Scanner;

public class Zadatak_4_0221 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Napisati program koji ce ispisati n brojeva Fibonacijevog niza.

		Scanner s= new Scanner(System.in);
		
		int a=0;
		int b=1;
		int c=0;
		
		System.out.println("Unesite broj niza");
		int n=s.nextInt();
		
		while (n<=0) {
			System.out.println("ne moze biti negativno ili jednako nuli. Unesite opet broj niza");
			
			n=s.nextInt();
		}
		for (int i=2; i<n; i++) 
		{c=a+b;
		a=b;
		b=c;
		System.out.println(c);
		

		}
			
		}
		
		
	}



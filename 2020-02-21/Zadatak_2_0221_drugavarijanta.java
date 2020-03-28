package itbootcamp.nesto;

import java.util.Scanner;

public class Zadatak_2_0221_drugavarijanta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Napisati program koji ce prebrojati koliko je brojeva izmedju
		 *  9 i 250 (ukljucujuci i njih) deljivih brojem 3.
		 */
		Scanner sc = new Scanner(System.in);
		
		    System.out.println("Ispis prirodnih brojeva deljivih sa 3 od k do n.");
		 
		    int k,n ;
		    System.out.print("Od broja: ");
		    k = sc.nextInt();
		    System.out.print("Do broja: ");
		    n = sc.nextInt();
		     
		    int i=k;
		    while (i <= n)   {
		        if (i % 5 == 0) {
		            System.out.println(i);
		        }
		    i =i+1;
		    }
		
		
	}


		
		
	}


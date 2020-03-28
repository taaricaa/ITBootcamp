package itbootcamp.nesto;

import java.util.Scanner;

public class Zadatak_2_0221 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Napisati program koji ce prebrojati koliko je brojeva
		 *  od 9 do 250 (ukljucujuci i njih) deljivih brojem 3.
		 */
		Scanner sc = new Scanner(System.in);
		
		    System.out.println("Brojevi od 9 do 250 koji su deljivi sa 3 su:");
		 
		   int k=9;
		   int n=250;
		     
		    int i=k;
		    while (i <= n)   {
		        if (i % 3 == 0) {
		            System.out.println(i);
		        }
		    i =i+1;
		    }	
		
		
	}
}


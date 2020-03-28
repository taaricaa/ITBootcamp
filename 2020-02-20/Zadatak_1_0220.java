package itbootcamp.nesto;

import java.util.Scanner;

public class Zadatak_1_0220 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Napisati program koji racuna sumu parnih brojeva
		 *  i proizvod neparnih brojeva od 0 do n
		 *  za resavanje ovog zadatka koristiti samo jednu petlju*/

		Scanner s =new Scanner(System.in);
		
		
		System.out.println("Unesite n");
	     int n = s.nextInt();
	     
	     int par=0;
	     int nepar=1;
	     
	     for(int i=0; i<=n; i++) {
	    	 System.out.println(i + " ");
	    	 
	    	 if (i%2==0)
	    			 par +=1;
	    	 else 
	    		 nepar *= 1;
	     }
	     System.out.println("Zbir parnih brojeva od 0 do je " + par);
	     System.out.println("Proizvod neparnih brojeva je " + nepar);
	}

}

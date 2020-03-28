package domacijava;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak_2_0305 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int[] nizpiun = new int[2];
		int[] nizskakac = new int[2];
		
		 
		System.out.println("Unesite pozicije piona");
		
		for (int i = 0; i < 2; i++) {
			nizpiun[i] = s.nextInt();
		}	
		
		
	System.out.println("Unesite pozicije skakaca");
		
		for (int i = 0; i < 2; i++) {
			nizskakac[i] = s.nextInt();
		}	
		
		System.out.println(Arrays.toString(nizpiun));
		System.out.println(Arrays.toString(nizskakac));
	
 for (int i=0; i<nizpiun.length; i++ ) {		
	 if(nizpiun[i]>8 || nizpiun[i]<0)
		 System.out.println("greska u unosu");
 }
 
 for (int i=0; i<nizskakac.length; i++ ) {		
	 if(nizskakac[i]>8 || nizskakac[i]<0)
		 System.out.println("greska u unosu");
 }
	
	
	int kolonapiun = nizpiun[0];
	int kolonaskakac = nizskakac[0];
	int razlikaukolonama = kolonapiun-kolonaskakac;
	
	int redpiun = nizpiun[1];
	int redskakac = nizskakac[1];
	int razlikauredovima = redpiun-redskakac;
	
	if(kolonapiun==kolonaskakac && redpiun==redskakac) {
		System.out.println("greska u unosu");
		
	}
	if (razlikauredovima==1 && (razlikaukolonama==1 || razlikaukolonama==-1)) {
		System.out.println("Skakac je ugrozen");
	}
	else
		System.out.println("Skakac nije ugrozen");
	
	boolean razlikauredovimajezadva = false;
	if (razlikauredovima==2 || razlikauredovima == -2) {
		razlikauredovimajezadva=true;
	}
	
	boolean razlikaukolonamajezadva = false;
	if (razlikaukolonama==2 || razlikaukolonama == -2) {
		razlikaukolonamajezadva=true;
	}
	
	if (razlikaukolonama==1 && razlikauredovimajezadva) 
		System.out.println("pion je ugrozen");
	else if (razlikaukolonama==-1 && razlikauredovimajezadva)
		System.out.println("Pion je ugrozen");
	else if (razlikauredovima==1 && razlikaukolonamajezadva) 
		System.out.println("Pion je ugrozen");
	else if (razlikauredovima==-1 && razlikaukolonamajezadva) 
		System.out.println("Pion je ugrozen");
	else 
		System.out.println("Pion nije ugrozen");
	
		}
	
	}



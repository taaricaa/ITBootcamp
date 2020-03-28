package ucionica;

import java.util.ArrayList;

public class Laptop {

	
	/*
	 Laptop poseduje listu polaznika koji ga koriste i marku koji se zadaju prilikom kreiranja. 
	 Marka moze samo da se dohvati. 
	 Lista polaznika koji koriste laptop moze da se prosiri i da se smanji.
	  Moze da se ispise u obliku (koristiti metodu): MARKA{POLAZNIK 1, POLAZNIK 2,.....}
*/
	
	private ArrayList<Polaznik> lista;
	private String marka;
	
	public Laptop(String marka) {
		lista = new ArrayList<Polaznik>();
		this.marka = marka;
		
	}
	
	public String getMarka() {
		return marka;
	}

public String velikamarka(String m) {
	
	marka = marka.toUpperCase();
	return marka;
	}
     public void dodajPolaznika(Polaznik p) {
		lista.add(p);
	}

	public void obrisiPolaznika(Polaznik p) {
		lista.remove(p);
	}
	
	public String toString() {
		
		String ispis= marka.toUpperCase()+":";
		for(int i=0; i<lista.size(); i++) {
			ispis+=(i+1)+". polaznik: "+lista.get(i);
		}
		return ispis;

	
	}
	}

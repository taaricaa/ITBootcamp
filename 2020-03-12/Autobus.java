package Nasledjivanje;

import java.util.ArrayList;

public class Autobus {

	/*
	 * Autobus poseduje naziv, vozaca, cenu karte i listu putnika koji se njime
	 * voze. Naziv i cena karte i zadaju se prilikom kreiranja. Moguce je
	 * dodati/ukloniti putnika kao i vozaca. Moguce je naplatiti kartu putnicima
	 * samo ako je vozac prisutan. Autobus ispisati u sledecem obliku: Naziv ( vozac
	 * - Putnik1[novac], Putnik2 [novac],... )
	 */

	private String naziv;
	private Vozac vozac;
	private double cena;
	private ArrayList<Putnik> spisakPutnika;

	public Autobus(String naziv, double cena) {
		spisakPutnika=new ArrayList<Putnik>();
		this.naziv = naziv;
		this.cena = cena;
	}

	public void dodajPutnika(Putnik p) {
		spisakPutnika.add(p);
	}

	public void ukloniPutnika(Putnik p) {
		spisakPutnika.remove(p);
	}
	

	public String getNaziv() {
		return naziv;
	}

	public Double getCena() {
		return cena;
	}


	
	public Vozac getVozac() {
		return vozac;
	}

	public ArrayList<Putnik> getSpisakPutnika() {
		return spisakPutnika;
	}

	public void setVozac(Vozac vozac) {
		this.vozac = vozac;
	}

	public void naplatiKartu(Putnik p) {
		if (vozac != null) {
			p.umanjiNovac(cena);
		} else {
			System.out.println("Sacekajte vozaca");
		}
		
	}
		public String toString() {
			return naziv + "(" + vozac + "-" +  spisakPutnika;
		
			
		
	}
	}


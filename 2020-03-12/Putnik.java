package Nasledjivanje;

public class Putnik extends Covek {

	/*
	 * Putnik je covek koji poseduje novac Inicijalno poseduje odredjenu kolicinu
	 * novca koja mu se zadaje prilikom kreiranja. Odredjena svota novca moze da mu
	 * se doda i/ili oduzme, gde je potrebno vratiti indikator uspesnosti.
	 */

	private double novac;

	public Putnik(String ime, String prezime, double novac) {
		super(ime, prezime);
		this.novac = novac;
	}

	public boolean dodajNovac(double n) {
		if (n > 0) {
			novac = novac + n;
			return true;
		} else
			return false;

	}

	public void umanjiNovac(double n) {
		if (n > 0 && novac >= n) {
			novac = novac -  n;
		
		}
	}

	public String toString() {
		return ime + " " + prezime + "[" + novac + "]";
	}

}

package Igranje;

public class Dete {

	/*
	 * Dete ima ime, prezime, broj godina i broj klikera. Napraviti mogucnost da se
	 * kreira vise objekata klase Dete. Ako se pozove metoda dodajKlikere ili metoda
	 * oduzmiKlikere, broj klikera se azurira. Napraviti metodu koja ce ispisivati
	 * broj klikera i metodu koja ispisuje prosecan broj decjih godina(ako imamo
	 * troje dece, broj prosecnih godina za njih troje; ako imamo dvoje racunamo
	 * prosecne godine za to dvoje) .
	 */

	private String ime;
	private String prezime;
	private int brgodina;
	private int brklikera;
	public static int ukupnogodina;
	public static int brdece = 0;

	public Dete(String ime, String prezime, int brgodina, int brklikera) {
		this.ime = ime;
		this.prezime = prezime;
		this.brgodina = brgodina;
		this.brklikera = brklikera;
		brdece++;
		ukupnogodina += brgodina;

	}

	public void dodajKlikere(int k) {
		brklikera = brklikera + k;
		// Globalklikeri++;
	}

	public void oduzmiKlikere(int k) {
		brklikera = brklikera - k;
		// Globalklikeri--;
	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public int getbrgodina() {
		return brgodina;
	}

	public int getKlikere() {
		return brklikera;
	}

	public int getBrgodina() {
		return brgodina;
	}

	public int getBrklikera() {
		return brklikera;
	}

	public static int getUkupnogodina() {
		return ukupnogodina;
	}

	public static int getBrdece() {
		return brdece;
	}

	public static double prosek() {
		return ukupnogodina / brdece;
	}

}

// public static int getGlobalklikeri() {
// return Globalklikeri;

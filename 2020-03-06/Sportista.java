package domacijava;

import java.util.Arrays;


public class Sportista {

	/*
	 * Napisati klasu Sportista. Sportista ima 1) ime i prezime (polje tipa String)
	 * koje moze da se dohvati, ali ne i postavi 2) sport kojim se bavi (polje tipa
	 * String) koje moze da se dohvati ali ne i postavi 3) klub za koji igra (polje
	 * tipa String) koje moze da se dohvati. Sportista moze da promeni klub za koji
	 * igra. 4) broj koji nosi na dresu (neka u ovom zadatku bude tipa int) koje
	 * moze i da se dohvati i da se postavi.
	 * 
	 * Napisati glavni program koji kreira tri igraca. U glavnom programu
	 * iskoristiti (proizvoljan broj puta) sve tipove metoda napisanih u klasi
	 * Sportista.
	 */

	private String ip;
	private String klub;
	private String sport;
	private int dres;

	
	public void ispis(Sportista s) {
		System.out.print(dohvatiip() + "," + dohvatiklub() + ", " + dohvatisport() + ","+ dohvatidres());
		}
	
	public Sportista(String imeprezime, String klub, String sport, int broj) {
		
		ip = imeprezime;
		this.klub = klub;
		this.sport = sport;
		dres = broj;
	}
	
	public int dohvatidres() {
		return dres;
	}

	public boolean postavidres(int br) {
		if (br <= 0) {
			System.out.println("Broj mora biti veci od nule");
			return false;
		} else {
			dres = br;
			return true;
		} }
	
    public String dohvatisport() {
		return sport;
	}
    
	public String dohvatiklub() {
		return klub;
	}
	public void postaviklub(String klub) {
		this.klub = klub;
	}
	
	public String dohvatiip() {
		return ip;
	}
}

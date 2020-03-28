package Nasledjivanje;

public class Vozac extends Covek{
	// Vozac je covek koji poseduje i zvanje (zanimanje -> sofer).
	
	private String zvanje;
	
	public Vozac(String ime, String prezime) {
		super(ime, prezime);
		zvanje="sofer";
	}
	
	public String getZvanje() {
		return zvanje;
	}

}

package osmanedelja;

public class Sportista {

	/*Sportista poseduje ime, prezime i godinu rodjenja. 
	 * Ime, prezime i godina rodjenja se zadaju prilikom kreiranja i ne mogu da se promene.
	 *  Sportistu ispisati u obliku: IME_PREZIME: godinaRodjenja
*/
	
	private String ime;
	private String prezime;
	private int godina;
	

	public Sportista (String ime, String prezime, int godina ) {
		this.ime=ime;
		this.prezime=prezime;
		this.godina=godina;
	}
	
	public String getime() {
		return ime;
	}
	public String getprezime() {
		return prezime;
	}
	public int getgodina() {
		return godina;
	}
	
	
	public String velikoime(String i) {
		
		ime = ime.toUpperCase();
		return ime;
	}
	public String velikoprezime(String i) {
		
		prezime = prezime.toUpperCase();
		return prezime;
	}
	
	public String toString() {
		return ime.toUpperCase() + " " + prezime.toUpperCase() + ": " + godina;
	}

	
	
	}

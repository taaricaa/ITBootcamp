package zadatak_2_0313;

public class Zaposleni {

	/*
	 * Zaposleni u pozoristu je opisan imenom (i prezimenom, jedno polje) i
	 * pozoristem u kojem je zaposlen. Svi podaci mogu da se dohvate. Moze da se
	 * sastavi tekstualni opis u obliku ime[naziv_pozorista].
	 */

	protected String imeprezime;
	public Pozoriste pozoriste;
	
	
	public Zaposleni (String imeprezime, Pozoriste pozoriste) {
		this.imeprezime=imeprezime;
		this.pozoriste=pozoriste;
		
	}
	
	public String getImeprezime() {
		return imeprezime;
	}
	
	public Pozoriste getPozoriste() {
	return pozoriste;
	}
	
	

  public String toString() {
  return imeprezime +  "["  + pozoriste + "]"; 
  }

}

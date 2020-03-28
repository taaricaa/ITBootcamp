package zadatak_2_0313;

public class Reditelj extends Zaposleni {
	
	// Reditelj je zaposleni koji je prepoznatljiv po svom nadimku. Tekstualni oblik je nadimak_ime[naziv_pozorista].

	private String nadimak;
	
	
	
	public Reditelj(String imeprezime, Pozoriste pozoriste, String nadimak) {
		super(imeprezime, pozoriste);
		this.nadimak=nadimak;
	}
	
	
  public String getNadimak() {
	  return nadimak;
  }
	
	public String toString() {
		return nadimak + " " + super.toString();
	}
	
	
	
	
}

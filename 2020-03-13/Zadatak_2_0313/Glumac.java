package zadatak_2_0313;

public class Glumac extends Zaposleni {
	
	
//Glumac je zaposleni koji ima i naziv uloge. Tekstualni oblik je uloga_ime[naziv_pozorista].

	private String uloga;
	
	public Glumac (String imeprezime, Pozoriste pozoriste, String uloga) {
		super(imeprezime, pozoriste);
		this.uloga=uloga;
	}

	
	public String getUloga () {
		return uloga;
	}
	
	
	public String toString()
	{
		return uloga + " " + super.toString();
	}
}

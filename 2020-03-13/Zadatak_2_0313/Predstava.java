package zadatak_2_0313;

import java.util.ArrayList;

import Nasledjivanje.Putnik;

public class Predstava {

	/*
	 * Predstava je opisana nazivom, pozoristem u kojem se izvodi i sadrzi zaposlene
	 * koji ucestvuju u realizaciji predstave. Zaposleni za realizaciju predstave
	 * mogu da se dodaju i izbace. Moze da se dohvati broj zaposlenih na predstavi.
	 * Sastavlja se tekstualni opis predstave navodeci naziv predstave i naziv
	 * pozorista u kojem se predstava odrzava razdvojene zarezom, a potom zaposlene
	 * koji ucestvuju u realizaciji predstave (svakog zaposlenog u zasebnom redu).
	 */

	private String naziv;
	private Pozoriste pozoriste;
	private ArrayList<Zaposleni> zaposleni;
	private int brzaposlenih;

	public Predstava(String naziv, Pozoriste pozoriste) {
		this.naziv = naziv;
		this.pozoriste = pozoriste;

		zaposleni = new ArrayList<Zaposleni>();

	}

	public void dodajZaposlenog(Zaposleni z) {
		zaposleni.add(z);
		brzaposlenih++;
	}

	public void ukloniZaposlenog(Zaposleni z) {
		zaposleni.remove(z);
		brzaposlenih--;
	}
	
	public int getBrzaposlenih() {
		return brzaposlenih;
	}
	
	public String toString(){
        StringBuilder  ispis=new StringBuilder();
        ispis.append(naziv).append(", ").append(pozoriste).append("\n");
        ispis.append("Zaposleni: ").append(zaposleni).append("\n");
        
        for(int i=0;i<zaposleni.size();i++){
            ispis.append((i+1)).append(". ").append(zaposleni.get(i)).append("\n");
        }
        return ispis.toString();
    }

    

	}
	
	


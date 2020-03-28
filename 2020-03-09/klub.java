package osmanedelja;

public class klub {

	/*
	 * Klub poseduje naziv, sediste (grad), godinu osnivanja i niz sportista tipa
	 * Sportista. Sva polja mogu da se dohvate, a naziv kluba moze i da se postavi.
	 * Napisati metodu koja ce ispisati ceo objekat klase klub.
	 */

	public String klub;
	public String sediste;
	public int godinao;
	public Sportista[] spr;

	public klub(String klub, String sediste, int godinao, Sportista[] spr) {
		this.klub = klub;
		this.sediste = sediste;
		this.godinao = godinao;

		// int n = spr.length;
		this.spr = new Sportista[2];
		this.spr = spr;

	}

	public String getKlub() {
		return klub;
	}

	public String getSediste() {
		return sediste;
	}

	public int getGodinao() {
		return godinao;
	}

	public Sportista[] getSpr() {
		return spr;
	}

	public void setKlub(String klub) {
		this.klub = klub;
	}

	public String toString() {
		String oznaka = "";
		for (int i = 0; i < spr.length; i++) {
			oznaka += (i + 1) + ". " + spr[i] + "\n";
		}
		return "Klub: " + klub + ";" + sediste + ";" + godinao + "\n" + "Spisak igraca: \n" + oznaka;

	}

}

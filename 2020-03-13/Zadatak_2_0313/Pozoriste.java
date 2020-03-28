package zadatak_2_0313;

public class Pozoriste {

	/*
	 * Pozoriste ima jednoznacan automatski generisan celobrojan identifikator i
	 * naziv koji mogu da se dohvate. Moze da se sastavi tekstualni opis u obliku
	 * naziv[id].
	 */
	
	protected String naziv;
	protected static int idGlobal;
    //private ;
	
	public Pozoriste (String naziv) {
		this.naziv=naziv;
		//id=idGlobal;
		idGlobal++;
	}

	public String getNaziv() {
		return naziv;
	}

	public static int getIdGlobal() {
		return idGlobal;
	}
	
	

	
	//public int getId() {
		//return id;
	//}
	
public String toString () {
	return naziv+ "[" + idGlobal + "]";
}
	
}

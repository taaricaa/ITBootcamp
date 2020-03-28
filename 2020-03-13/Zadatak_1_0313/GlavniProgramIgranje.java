package Igranje;

public class GlavniProgramIgranje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Dete d1 = new Dete("Sima", "Simic", 15, 10);
	Dete d2 = new Dete("Mika", "Mikic", 5, 2);
	
	d1.dodajKlikere(2);
	d2.dodajKlikere(5);
	d2.oduzmiKlikere(1);
	
	System.out.println(d1.getKlikere());
	System.out.println(d2.getKlikere());
	
System.out.println(Dete.getBrdece());
System.out.println(Dete.getUkupnogodina());

System.out.println(Dete.prosek());

	}

}

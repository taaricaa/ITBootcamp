package Nasledjivanje;

public class GlavniProgramNasledjivanje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Putnik p1 = new Putnik ("Pera", "Peric", 500);
		Putnik p2 = new Putnik ("Zika", "Zikic", 300);
		Putnik p3 = new Putnik ("Mika", "Mikic", 700);
		Putnik p4 = new Putnik ("Luka", "Lukic", 900);
		
		Vozac v1 = new Vozac ("Radoje", "Radic");
		Vozac v2 = new Vozac ("Zivojin", "Lukic");
		
		Autobus a1 = new Autobus("BG-NIS", 100);
		Autobus a2 = new Autobus ("BG-NS", 150);
		
		a1.setVozac(v2);
		a2.setVozac(v1);
		
		
		a1.dodajPutnika(p1);
		a1.naplatiKartu(p1);
		a1.dodajPutnika(p2);
		a1.naplatiKartu(p2);
		
		
		
		
	
		
		System.out.println(p1);
		System.out.println(a1);
		
		

	
	}		
	}



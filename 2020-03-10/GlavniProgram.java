package ucionica;

public class GlavniProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Polaznik a=new Polaznik("Zika","Zikic");
		Polaznik b=new Polaznik("Mika","Mikic");
		
		
		Laptop lt1=new Laptop("Acer");
		Laptop lt2=new Laptop("Toshiba");
		Laptop lt3=new Laptop("Dell");
		
		lt1.dodajPolaznika(a);
		lt2.dodajPolaznika(b);
		
		lt1.obrisiPolaznika(a);
		lt3.dodajPolaznika(a);
		
		
		

		System.out.println(lt2.toString());
		
	}

}

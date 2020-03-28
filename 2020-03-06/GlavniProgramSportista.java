package domacijava;

public class GlavniProgramSportista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sportista[] s = new Sportista[3];
		s[0] = new Sportista("Pera Peric", "Zvezda", "kosarka", 3);
		s[1] = new Sportista("Zika Zikic", "Radnicki", "kosarka", 7);
		s[2] = new Sportista("Mika Mikic", "Vojvodina", "kosarka", 9);

		for (int i = 0; i < 3; i++) {
			s[i].ispis(s[i]);
			System.out.println();
		}
		System.out.println(s[0].dohvatiip());
		System.out.println(s[0].dohvatisport());

		s[1].postaviklub("Radnicki");
		s[2].postavidres(3);
		
		for (int i = 0; i < 3; i++) {
			s[i].ispis(s[i]);
		}
		

	}

}

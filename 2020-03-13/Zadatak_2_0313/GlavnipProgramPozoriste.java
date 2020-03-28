package zadatak_2_0313;

//import Igranje.Predstava;

public class GlavnipProgramPozoriste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pozoriste p = new Pozoriste("Puz");
		Pozoriste c = new Pozoriste("Crvenkapa");

		System.out.println(c);

		Glumac g = new Glumac("pera peric", p, "Doroti");

		// System.out.println(g);

		Reditelj r = new Reditelj("Zika Zikic", c, "Lepi");
		// System.out.println(r);

		Predstava l = new Predstava("Nasi dani", p);
		l.dodajZaposlenog(r);
		l.dodajZaposlenog(g);
		System.out.println(l.getBrzaposlenih());

		System.out.println(l);

	}

}

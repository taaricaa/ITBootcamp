package itbootcamp.nesto;

public class Zadatak_3_0220 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Napisati 8 primera za post inkrementu (i++), 
 * pre inkrementu (++i),
 *  post dekrementu (i--) 
 *  i pre dekrementu (--i) 
i u programu u komentarima opisati kako koji primer funkcionise. 
Napisati po 2 primera o svakom, koristeci promenljive a, b, c koje su i deklarisane i definisane */

int a = 3;
int b = 2;
int c = 1;

// primer za pre inkrementu

b = ++b; /*vrednost promenljive a se povecava za 1, pa a promenljiva postaje 4, i  nova
vrednost se dodeljuje promenljivoj b pa i ona postaje 4*/

a = b++; /*vrednost promenljive b se dodeljuje promenljivoj a, pa a postaje 2, a zatim
se vrednost promenljive b povecava za 1 pa postaje 3 */

c = b--; /*vrednost promenljive b se dodeljuje promenljivoj c, pa  postaje 2, a zatim
se vrednost promenljive b umanjuje za 1 pa postaje 1*/

b = --c; /*vrednost promenljive c se umanjuje za 1, pa postaje 0 i njegova nova
vrednost se dodeljuje promenljivoj b pa postaje 0 */

b = a++ + --c; /* Umanjuje vrednost promenljive c za 1 i tome dodaje
		vrednost promenljive a. Dobijenu vrednost se dodeljuje
		promenljivoj b i promenljivu a uvecava za 1,pa a postaje 4, b postaje 3, a c nula*/

a = b-- - c++; /*od vrednosti promenljive b oduzima vrednost
	promenljive c i dobijenu vrednost dodeluje promenljivoj a.
	 Zatim umanjuje vrednost promenljive b za jedan a uvecava
	 vrednost promenljive c za 1. Pa a postaje 1, b 1, a c 2; */

a *= c = b++; /*vrednost promenljive b se dodeljuje promenljivoj c,
	za zaatim se b uvecava za 1. Prethodna vrednost promenljive
	se pomnozi sa vrednoscu promenljive c i tako dobijena
	vrednost dodeljuje promenljivoj a, pa promenljiva a postaje 6, promenljiva b 3, a promenljiva c 1*/

c /= b *= --a; /* a postaje 2, b 4,a c nula */



		
		
	}

}

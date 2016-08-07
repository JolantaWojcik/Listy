import java.util.ArrayList;
import java.util.List;

public class ZadaniaListy {
	public static void main(String[] args) {
		/*
		 * Stworz liste liczb losowych(0-100) [100] a nastepenie: - wypisz
		 * wszystkie elementy na liscie - usun wyszstkie elementy parzyste z
		 * listy - sprawdz czy na liscie znajduja sie liczby pierwsze - na
		 * podstawie pierwsze listy stworz liste liczb pierwszych i znajdz
		 * najwieksza liczbe pierwsza
		 */

		List<Integer> liczby = new ArrayList<>();

		// math.random <0,1) np: 0.534332, max: 0.999999999...
		// math.random * 100 = <0,100) np: 32.1212343 => (int) => 32
		for (int i = 0; i < 100; i++) {
			liczby.add((int) (Math.random() * 100));
		}
		liczby.forEach(System.out::println);

		liczby.removeIf(liczba -> liczba % 2 == 0);
		System.out.println("Po usunieciu:");
		liczby.forEach(System.out::println);
		for (int i = 0; i < liczby.size(); i++) {
			if (isPrimary(liczby.get(i))) {
				System.out.println("Pierwsza: "+liczby.get(i));
			}
		}
		
		//stworz druga liste i wypelnij ja liczbmi pierwszymi z pierwszej listy a nastepnie
		//znajdz najwieksza liczbe na tej drugiej liscie i j¹ wypisz.
		
		
		/*
		 * Stworz klase Impreza (nazwa, data[String], koszt, liczba uczestnikow)
		 * w manie stworz liste Imprez (5-10 imprez) a nastepnie:
		 * - znajdz najdrozsza impreze
		 * - znajdz najtansza impreze
		 * - wypisz wszystkie imprezy ktorych koszt jest wieksz niz 3000pln
		 * - usun imprezy ktorych liczba uczestnikow jest wieksza niz 1000
		 */
		
	}

	public static boolean isPrimary(int number) {
		if (number <= 1) {
			return false;
		}
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}

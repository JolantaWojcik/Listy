import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
	public static void main(String[] args) {
		List<Osoba> listaOsob = new ArrayList<>();

		listaOsob.add(new Osoba("Adam", 30));
		listaOsob.add(new Osoba("Kasia", 28));
		listaOsob.add(new Osoba("Kasia", 20));
		listaOsob.add(new Osoba("Kasia", 20));
		listaOsob.add(new Osoba("Kasia", 20));
		listaOsob.add(new Osoba("Kasia", 20));
		listaOsob.add(new Osoba("Adam", 30));

		//LAMBDA (od javy 1.8)
		//listaOsob.forEach(osoba -> System.out.println(osoba));
		//:: nowy operatory ktory pozwala przekazac funkcje jako argument metody
		listaOsob.forEach(System.out::println);
		
		//usunac wszystkie wszystkie 20 letnie Kasie?
//		for(int i =0; i< listaOsob.size(); i++){
//			//1) listaOsoba.equals => sprawdzacz czy CALA LISTA to "Kasia" 28
//			//1) rozwiazanie: listaOsoba.get(i).equals(...) (czy aktualnie ogladany element na liscie jest equals)
//			//2) X.eqauls("Kasia", 28) sprawdzasz czy X to "Kasia" (String) i 28 (int)  
//			if(listaOsob.get(i).getImie().equals("Kasia") && 
//					listaOsob.get(i).getWiek()==20){
//				listaOsob.remove(i);
//				i--;
//			}
//			//
//		}
		
		//Exception in thread "main" java.util.ConcurrentModificationException
		
		//u¿ywaj¹c "foreach" to tak naprwde u¿ywa¿ ITERATORA
		//Podczas iteracji po elementach danej kolekcji NIE MOZNA MODYFIKOWAC ZAWARTOSCI KOLEKCJI
		//tzn: nie mozna nic nowego dodac, ani nic nowego usunac.
//		for(Osoba o : listaOsob){
//			if(o.getImie().equals("Kasia") && o.getWiek()==20){
//				listaOsob.remove(o);
//			}
//		}
		
		//nowa metoda od javy 1.8
		// argumenty -> implementacja <== LAMBDA
		listaOsob.removeIf(osoba -> osoba.getImie().equals("Kasia") && osoba.getWiek()==20);
		
		System.out.println("Po usunieciu:");
		listaOsob.forEach(System.out::println);
		
		//jak sprawdzic czy na liscie znajduje sie 30 letni Adam?
		//jak dzia³a contains na liscie?
		//pseudo kod:
		//for(Osoba o : wszystkieOsobyNaLiscie)
		//		if(o.equals(szukana)) //domyslnie equals porownuje referencje
		//			return true;
		
		//ODP: trzeba bylo dodac metode equals w klasie Osoba.
		if(listaOsob.contains(new Osoba("Adam", 30))){
			System.out.println("Jest 30 letni adam");
		}else{
			System.out.println("nie ma 30 letniego adama");
		}
		
		System.out.println("Rozmiar listy: "+listaOsob.size());
		System.out.println("Ostani element na liscie: "+ listaOsob.get(listaOsob.size()-1));
		System.out.println("IndexOf -> pokazuje index obiektu na liscie: "+listaOsob.indexOf(new Osoba("Adam", 30)));
		System.out.println("LastIndexOf -> pokazuje index obiektu na liscie: "+listaOsob.lastIndexOf(new Osoba("Adam", 30)));
		System.out.println("jesli nie ma: "+listaOsob.indexOf(new Osoba("Jadzia", 40)));
	}
}

import java.util.ArrayList;
import java.util.List;


public class LiteraTools {
	
	public static Litera createLitera(char nazwa, double szerokosc, double dlugosc){
		Litera litera = new Litera(nazwa, szerokosc, dlugosc);
		return litera;
	}
	
	public static List<Litera> stworzListeLiter(Litera...literas){
		List<Litera> literki = new ArrayList<>();
		for(int i = 0; i<literas.length; i++){
			literki.add(literas[i]);
		}
		return literki;
	}
	
	public static double srednia(List<Litera> lista){
		double suma = 0;
		double licznik = 0;
		
		for(Litera i : lista){
			licznik++;
		}
		
		for(Litera i : lista){
			suma = suma + i.getSzerokosc();
		}
		
		double srednia = suma/licznik;
		
		return srednia;
	}
	
	public static void wyswietlLiterkiKtorychSzerokoscJestWiekszaOdSredniaj(List<Litera> lista, double srednia){
		System.out.println("Literki ktore maja szerokosc wieksza od sredniej");
		for(Litera i : lista){
			if(i.getSzerokosc()>srednia){
				System.out.println(i.getNazwa());
			}
		}
	}
}

import java.util.ArrayList;
import java.util.List;


public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Litera> samogloski = new ArrayList<>();
		samogloski = LiteraTools.stworzListeLiter(new Litera[] {
			LiteraTools.createLitera('a', 2.21, 2.2),
			LiteraTools.createLitera('e', 2.19, 2.2),
			LiteraTools.createLitera('i', 1.21, 2.2)
		});
		
		List<Litera> spolgloski = new ArrayList<>();
		spolgloski = LiteraTools.stworzListeLiter(new Litera[] {
				LiteraTools.createLitera('b', 2.40, 3.3),
				LiteraTools.createLitera('c', 2.29, 2.4),
				LiteraTools.createLitera('d', 2.31, 3.3),
		});
		
		double srednia1 = LiteraTools.srednia(spolgloski);
		double srednia2 = LiteraTools.srednia(samogloski);
		
		LiteraTools.wyswietlLiterkiKtorychSzerokoscJestWiekszaOdSredniaj(spolgloski, srednia1);
		LiteraTools.wyswietlLiterkiKtorychSzerokoscJestWiekszaOdSredniaj(samogloski, srednia2);
	}

}

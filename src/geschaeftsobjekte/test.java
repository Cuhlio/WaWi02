package geschaeftsobjekte;

import java.lang.reflect.Array;
import java.util.Arrays;

public class test {
	
	public static void main (String[] args){
	
		Dienstleistung d1 = new Dienstleistung(1, null, 1., "qm");
		Dienstleistung d2 = new Dienstleistung(2, null, 2., "am");
		Dienstleistung d3 = new Dienstleistung(3, "DienstA", 2., "qm");
		Dienstleistung d4 = new Dienstleistung(4, "DienstB", 2., "qm");
		Dienstleistung d5 = new Dienstleistung(5, "DienstB", 3., "qm");
		Artikel a1 = new Artikel(6, "ArtikelA", 2.);
		Artikel a2 = new Artikel(7, "ArtikelB", 2.);
		Artikel a3 = new Artikel(8, "ArtikelB", 3.);
		Artikel a4 = new Artikel(9, "ArtikelC", 4.);
		
		Produkt[] unsortiert = { a4, a3, a2, a1, d5, d4, d3, d2, d1 };
		Produkt[] sortiert   = { d1, d2, d3, d4, d5, a1, a2, a3, a4 };
		
		for(Produkt e:unsortiert){
			System.out.println(e);
			
			
		}
		
		Arrays.sort(unsortiert);
		for(Produkt e:unsortiert){
			System.out.println(e);
		}
	}
	
	
}

package geschaeftsobjekte;



public class test {
	
	public static void main (String[] args){
		
		Artikel a = new Artikel(526, "Laminatbodenpack Buche Klick-Fix SuperEasy", 13.99);
		
		Dienstleistung d1 = new Dienstleistung(123, "Parkettmontage", 75.00, "h");
	
	System.out.println(new Rechnungsposition(4, a));
	System.out.println(new Rechnungsposition(20, d1));
	}
	
	
}

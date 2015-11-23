package geschaeftsobjekte;
 public class Artikel extends Produkt {
 
    private String kurzbezeichnung;
    private int lagerbestand;
 
    //Konstruktor.
 
    public Artikel(int id, String bezeichnung, double preis){
    	super(id, bezeichnung, preis);//Wird von Produkt vererbt
    }
 
    //Getter
 
    public int getNummer(){
    	return super.getNr();
    }
    
    public int getLagerbestand(){
        return lagerbestand;
    }
 
    public String getKurzbezeichnung(){
        return kurzbezeichnung;
    }
    
    
 
    //Lagermethoden! (Instanzmethode)
    public int einlagern(int lagerZugang){
        lagerbestand = lagerbestand + lagerZugang;
        return lagerbestand;
 
    }
 
    public int auslagern(int lagerAbgang){
        if (lagerbestand > lagerAbgang) {
        lagerbestand = lagerbestand - lagerAbgang;
        }
        return lagerbestand;
    }
 
 
 
    public static String erzeugeKurzbezeichnung(int nummer, String bezeichnung){
    	bezeichnung = bezeichnung.replaceAll("ß","s");
        //Formatierung der Artikelbezeichnung
    	bezeichnung = bezeichnung.replaceAll("[^\\d^\\w]", "");
    	bezeichnung	= bezeichnung.replaceAll("[aeiouAEIUO]", "");
    
    	bezeichnung = bezeichnung.toUpperCase();
        if(bezeichnung.length() > 8){
        	bezeichnung = bezeichnung.substring(0, 8);
        } 
        
 
 
        //Artikel Nummer Formatierung. Fals die artikelNummer länger als 4 Stellen ist, sollen nur die letzten 4 Stellen benutzt werden. Falls diese kürzer als 4 Stellen ist soll diese mit vorangestellten Nullen auf 4 Stellen gefüllt werden.
        String formatierteNummer = String.format("%04d", nummer);
        formatierteNummer = formatierteNummer.substring(formatierteNummer.length()-4);
 
        //Kurzbezeichnung = Artikel Bezeichnung + Artikelnummer (beide formatiert wie in der Aufgabenstellung erwünscht.)
        String foo ="";
        foo = bezeichnung + formatierteNummer;
        
 
 
 
        //Prüfziffer ermitteln.
        
        int i;
        int summe = 0;
        int rest = 0;
 
        for (i = 0 ; i < foo.length() ; i++ ){
 
            if(Character.isDigit(foo.charAt(i))){
                summe = summe + foo.charAt(i);
            }
 
            if (Character.isLetter(foo.charAt(i)) && Character.isUpperCase(foo.charAt(i))){
                summe = summe + (int)foo.charAt(i) - 64;
            }
            if(Character.isLetter(foo.charAt(i)) && Character.isLowerCase(foo.charAt(i))){
                summe = summe + (int)foo.charAt(i) - 96;
            }
        }
 
        rest = summe % 16;
    if (rest >= 10){
 
        switch(rest){
        case 10: foo = foo + 'A'; break;
        case 11: foo = foo + 'B'; break;
        case 12: foo = foo + 'C'; break;
        case 13: foo = foo + 'D'; break;
        case 14: foo = foo + 'E'; break;
        case 15: foo = foo + 'F'; break;
        }
    }
        else{
        	foo = foo + rest;
        }

        return foo;
        
    }
 
 
 
    public String toString(){
        return id+ ", " +bezeichnung + ", " +lagerbestand + " auf Lager";
    }
 
 
 
    public static void main (String[] args){
 
        //Ezeugen und ausgeben der Objekte
    	Artikel a = new Artikel(134, "Schraube", 3.99);
    	a.einlagern(10);
    	System.out.println(a);
    	
    		
        Artikel c = new Artikel(123, "Schraube", 3.99);
        System.out.println(c);
        
        Artikel b = new Artikel(8, "Spax 8x55", 4.00);
        b.einlagern(17);
        System.out.println(b);
       
        System.out.println(erzeugeKurzbezeichnung(62873408, "Schloßschraube"));
 
        }

	@Override
	public int compareTo(Produkt other) {
		// TODO Auto-generated method stub
		
		if(this.getClass() != other.getClass())
		
			return 1;
		
		if(this.getClass() == other.getClass()){
			
			if(this.getBezeichnung() == other.getBezeichnung()){
				Double a = new Double (this.getPreis());
			Double b = new Double (other.getPreis());
			return a.compareTo(b);
			}
			
			if(this.getBezeichnung() == null && other.getBezeichnung() == null){
				Double a = new Double (this.getPreis());
				Double b = new Double (other.getPreis());
				return a.compareTo(b);
			}
			else
				try{
		return this.getBezeichnung().compareTo(other.getBezeichnung());
	}
			catch(NullPointerException e){
				
				if(this.getBezeichnung() == null){
					return -1;
					
				}
				
				if(other.getBezeichnung() == null){
					return 1;
				}
				
				
			}
		}
		return 0;
    }
 }
	
		
	
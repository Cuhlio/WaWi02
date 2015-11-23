package geschaeftsobjekte;

public abstract class Produkt extends Geschaeftsobjekt implements Comparable<Produkt>{
	
	
	public String bezeichnung;
	public double preis;

	public Produkt(int id, String bezeichnung, double preis){
		super(id); //super, da von Superklasse übernommen wird
		this.bezeichnung = bezeichnung;
		this.preis = preis;
	}
	
	public int getNr(){
		return super.getNummer();
	}
	//Getter
	public String getBezeichnung(){
		
		return bezeichnung;
	}
	
	public double getPreis(){
		return preis;
	}

	// Setter
	public void setPreis(double preis){
		this.preis = preis;
	}
	
	public void setBezeichnung(String bezeichnung){
		this.bezeichnung = bezeichnung;
	}
	

	public boolean equals (Object obj){
	
		
	if(obj.getClass() == this.getClass()){
		Produkt test = (Produkt)obj;
		if(this.getNummer() == test.getNummer()){
			return true;
		}
	}
	return false;
	}
	
	
	}





package geschaeftsobjekte;

public class Dienstleistung extends Produkt{
	
	private String einheit;
	
	public Dienstleistung(int id, String bezeichnung, double preis, String einheit){
		super(id, bezeichnung, preis); //Wird von Produkt vererbt
		this.setEinheit(einheit);
	}
	
	public String getEinheit(){
		return einheit;
		
	}
	
	public void setEinheit(String einheit){
		
		this.einheit = einheit;
	}

	@Override
	public int compareTo(Produkt other) {
		// TODO Auto-generated method stub
		
		if(this.getClass() != other.getClass()){
		
		return -1;
		}
			
		
		
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
					try {
					return	this.getBezeichnung().compareTo(other.getBezeichnung());
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


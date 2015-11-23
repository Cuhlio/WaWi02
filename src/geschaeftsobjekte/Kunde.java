package geschaeftsobjekte;

public class Kunde extends Geschaeftsobjekt {
	
	private String name;
	private String stra�e;
	private String ort;
	
	public Kunde(int id, String name, String stra�e, String ort){
		super(id);
		this.name = name;
		this.stra�e = stra�e;
		this.ort = ort;
	}
	
	public String getName(){
		return name;
	}
	
	public String getStrasse(){
		return stra�e;
	}
	
	public String getOrt(){
		return ort;
	}
	
	public int getNr(){
		return super.getNummer();
	}
	
	public void setName(String name){
		
		this.name = name;
	}
	
	public void setStrasse(String stra�e){
		
		this.stra�e = stra�e;
	}
	
	public void setOrt(String ort){
		
		this.ort = ort;
	}
	
}


package geschaeftsobjekte;

public class Kunde extends Geschaeftsobjekt {
	
	private String name;
	private String straﬂe;
	private String ort;
	
	public Kunde(int id, String name, String straﬂe, String ort){
		super(id);
		this.name = name;
		this.straﬂe = straﬂe;
		this.ort = ort;
	}
	
	public String getName(){
		return name;
	}
	
	public String getStrasse(){
		return straﬂe;
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
	
	public void setStrasse(String straﬂe){
		
		this.straﬂe = straﬂe;
	}
	
	public void setOrt(String ort){
		
		this.ort = ort;
	}
	
}


package geschaeftsobjekte;

public abstract class Geschaeftsobjekt {
	
	protected int id;
	
	public Geschaeftsobjekt(final int id){
		this.id = id;
	}
	
	public int getNummer(){
		return id;
	}

}



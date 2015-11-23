package geschaeftsobjekte;

import java.util.List;





public class Rechnung extends Geschaeftsobjekt {
	
	
	private static int rechnungsNr;
	private Rechnungsstatus rechnungsStatus;
	private Kunde kunde;
	private Rechnungsposition rechnungspositionen;
	private List<Rechnungsposition> rechnungsposition;

	
	public Rechnung(){
		super(rechnungsNr);
		rechnungsStatus = Rechnungsstatus.IN_ERSTELLUNG;
		rechnungsNr += 1;
	}
	
	
	public Rechnung(Kunde costumer){
		super(rechnungsNr);
		rechnungsStatus = Rechnungsstatus.IN_ERSTELLUNG;
		this.kunde = costumer;
		
	}
	
	
	public Rechnungsposition getRechnungsposition(Produkt p){
		for(Rechnungsposition entry : rechnungsposition){
			if(entry.getProdukt().equals(p))
				return entry;
		}
		return null;
	}
	
	
	public Rechnungsposition addRechnungsposition(int anzahl, Produkt p){
		Rechnungsposition test = getRechnungsposition(p);
		int num = rechnungsposition.indexOf(test);
		if(test != null && ((Artikel) p).getLagerbestand() >= test.getAnzahl() + anzahl && this.rechnungsStatus == Rechnungsstatus.IN_ERSTELLUNG) {
			test.setAnzahl(test.getAnzahl() + anzahl);
			rechnungsposition.set(num, test);
			return getRechnungsposition(p);
		}
			
		Rechnungsposition rp = new Rechnungsposition(anzahl, p);
		rechnungsposition.add(rp);
		return rp;
		
}
	

public List<Rechnungsposition> getRechnungspositionen(){
	return rechnungsposition;
}


public void buchen(){
	Artikel artikel;
	if(rechnungsStatus == Rechnungsstatus.IN_ERSTELLUNG){
		
	for(Rechnungsposition entry : rechnungsposition){
		artikel = (Artikel) entry.produkt;
		
		if(artikel instanceof Artikel){
		artikel.auslagern(entry.getAnzahl());
		}
		this.setRechnungsstatus();
	}
}
}

public void setRechnungsstatus(){
	this.rechnungsStatus = Rechnungsstatus.GEBUCHT;
}


public int getAnzahlRechnungspositionen(){

	return rechnungsposition.size();
	}
	
	public double getGesamtpreis(){
		double gesamtPreis = 0;
		for(Rechnungsposition entry : rechnungsposition){
			gesamtPreis = gesamtPreis + entry.getPreis();
		
		}
		return gesamtPreis;
	}
	
	
	public Kunde getKunde(){
		return kunde;
	}
	
	public Rechnungsstatus getRechnungsstatus(){
		return this.rechnungsStatus;
	}
	
	
	
	

	public int berechneRechnungsNR(){
		rechnungsNr = rechnungsNr++;
		return rechnungsNr;
		
	}
	
	
	

	
}

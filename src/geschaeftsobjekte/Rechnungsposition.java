package geschaeftsobjekte;

public class Rechnungsposition {
	
	int anzahl;
	Produkt produkt;
	

public Rechnungsposition(int anzahl, Produkt produkt){
	this.anzahl = anzahl;
	this.produkt = produkt;
}

public void setAnzahl(int anzahl){
	this.anzahl = anzahl;
}

public String getEinheit(){
	return this.produkt.getEinheit();

}

public double getPreis(){
	return this.produkt.getPreis()*getAnzahl();
}

public Produkt getProdukt(){
	return this.produkt;
}

public int getAnzahl(){
	return this.anzahl;
	
}


public String testeProdBez(){
	if(produkt.bezeichnung.length() <= 34){
		return produkt.bezeichnung;
	}
	else
	return produkt.bezeichnung.substring(0, 34);
}


public String testeEinheit(){
	if(produkt.getEinheit() != null){
		return produkt.getEinheit();
		}
	else
		return "";
}

@Override
public String toString() {
	
		return String.format("%.34s\n% 4d %-3.3s x %8.2f = %12.2f %4s", 
				produkt.getBezeichnung(), anzahl, testeEinheit(), produkt.getPreis(), getPreis(), "EURO");

		
	
	
 
}

}

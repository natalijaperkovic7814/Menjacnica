package menjacnica.interfejs;

import menjacnica.valuta.Valuta;

public interface SpecifikacijaInterfejsa {
	

	public void dodavanjeKursa(Valuta v);
	
	public void brisanjeKursa(Valuta v);
	
	public double nalazenjeKursa(Valuta v);
	
	
}

package menjacnica.interfejs;

import java.util.LinkedList;

import menjacnica.valuta.Valuta;

public class ImplementacijaInterfejsa implements SpecifikacijaInterfejsa {

	LinkedList<Valuta> kursevi=new LinkedList<Valuta>();
	public void dodavanjeKursa(Valuta v) {

		if(v==null){
			throw new RuntimeException("Greska");
		}
			
			Valuta v1=new Valuta();
			v1.setNaziv(v.getNaziv());
			v1.setSkraceno(v.getSkraceno());
			v1.setDatum(v.getDatum());
			v1.setKupovni(v.getKupovni());
			v1.setProdajni(v.getProdajni());
			v1.setSrednji(v.getSrednji());
			boolean unet=true;
			for(int i=0;i<kursevi.size();i++){
				if(kursevi.get(i).equals(v1)){
					unet=false;
				}
			}
			if(unet){
				kursevi.add(v1);
		}
	}

	
	public void brisanjeKursa(Valuta v) {


	}

	public double nalazenjeKursa(Valuta v) {
		
		return 0;
	}

}

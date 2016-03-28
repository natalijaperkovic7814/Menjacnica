package menjacnica.interfejs;

import java.util.LinkedList;

import menjacnica.valuta.Valuta;

public class ImplementacijaInterfejsa implements SpecifikacijaInterfejsa {


	private LinkedList<Valuta> valute = new LinkedList<Valuta>();

	

	public void dodavanjeKursa(Valuta v) {
		if(v!=null){
			
			Valuta v1=new Valuta();
			v1.setNaziv(v.getNaziv());
			v1.setSkraceno(v.getSkraceno());
			v1.setDatum(v.getDatum());
			v1.setKupovni(v.getKupovni());
			v1.setProdajni(v.getProdajni());
			v1.setSrednji(v.getSrednji());
			
			boolean unet = false;
			for(int i=0;i<valute.size();i++){
				if(valute.get(i).equals(v1)){
					unet = true;
				}
			}
				if(!unet){
					valute.add(v1);
				}
		}else 
			throw new RuntimeException("Objekat lose unet");
}

	
	public void brisanjeKursa(Valuta v) {
		
		if( v==null || valute.isEmpty()){
			throw new RuntimeException("Greska");
		}
		
		
		for(int i=0;i<valute.size();i++){
			if(valute.get(i).equals(v)){
				valute.remove(v);
				break;
			}
				
		}


	}

	public Object nalazenjeKursa(Valuta v) {
		
		if(v==null || valute.isEmpty()){
			throw new RuntimeException("Greska");
		}
		
		
		for(int i=0;i<valute.size();i++)
			if(valute.get(i).equals(v))
				return v;
			
		
		
		return null;
	}

}

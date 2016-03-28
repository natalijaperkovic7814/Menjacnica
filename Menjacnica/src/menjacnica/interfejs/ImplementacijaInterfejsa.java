package menjacnica.interfejs;

import java.util.LinkedList;

import menjacnica.valuta.Valuta;

public class ImplementacijaInterfejsa implements SpecifikacijaInterfejsa {

	LinkedList<Valuta> valute=new LinkedList<Valuta>();
	
	public void dodavanjeKursa (Valuta v) {

		if( v!=null){
			if(!(valute.contains(v))){
				valute.add(v);
			}
	}else
		throw new RuntimeException("Greska");
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

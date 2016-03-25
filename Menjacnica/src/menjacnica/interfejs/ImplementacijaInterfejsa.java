package menjacnica.interfejs;

import java.util.LinkedList;

import menjacnica.valuta.Valuta;

public class ImplementacijaInterfejsa implements SpecifikacijaInterfejsa {

	LinkedList<Valuta> valute=new LinkedList<Valuta>();
	
	public void dodavanjeKursa (Valuta v) {

		if(valute==null || v==null){
			valute.add(v);
		}
		for(int i=0;i<valute.size();i++){
			if(!(v.equals(valute.get(i)))){
				valute.add(v);
			}
		}
	}

	
	public void brisanjeKursa(Valuta v) {
		
		if(valute==null || v==null){
			throw new RuntimeException("Lista je prazna");
		}
		
		for(int i=0;i<valute.size();i++){
			if(valute.get(i).equals(v)){
				valute.remove(v);
				break;
			}
				
		}


	}

	public Object nalazenjeKursa(Valuta v) {
		
		if(v==null || valute==null){
			throw new RuntimeException("Greska");
		}
		
		Valuta va=new Valuta();
		for(int i=0;i<valute.size();i++)
			if(valute.get(i).equals(v))
				va=v;
			
		
		
		return va;
	}

}

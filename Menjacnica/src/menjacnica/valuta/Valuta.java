package menjacnica.valuta;

import java.util.GregorianCalendar;

public class Valuta {

	private String naziv;
	private String skraceno;
	private GregorianCalendar datum;
	private double prodajni;
	private double kupovni;
	private double srednji;
	
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getSkraceno() {
		return skraceno;
	}
	public void setSkraceno(String skraceno) {
		this.skraceno = skraceno;
	}
	public GregorianCalendar getDatum() {
		return datum;
	}
	public void setDatum(GregorianCalendar datum) {
		this.datum = datum;
	}
	public double getProdajni() {
		return prodajni;
	}
	public void setProdajni(double prodajni) {
		this.prodajni = prodajni;
	}
	public double getKupovni() {
		return kupovni;
	}
	public void setKupovni(double kupovni) {
		this.kupovni = kupovni;
	}
	public double getSrednji() {
		return srednji;
	}
	public void setSrednji(double srednji) {
		this.srednji = srednji;
	}
	
	
}

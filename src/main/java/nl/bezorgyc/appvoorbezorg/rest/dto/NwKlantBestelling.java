package nl.bezorgyc.appvoorbezorg.rest.dto;

public class NwKlantBestelling {
	String voornaam;
	int prijs;
	
	public String getVoornaam() {
		return voornaam;
	}
	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}
	public int getPrijs() {
		return prijs;
	}
	public void setPrijs(int prijs) {
		this.prijs = prijs;
	}

}

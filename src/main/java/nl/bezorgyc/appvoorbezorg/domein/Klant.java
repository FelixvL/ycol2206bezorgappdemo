package nl.bezorgyc.appvoorbezorg.domein;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Klant {  // encapsulation
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private long id;
	
	private String adres;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

}

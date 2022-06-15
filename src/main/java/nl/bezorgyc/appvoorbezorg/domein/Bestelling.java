package nl.bezorgyc.appvoorbezorg.domein;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Bestelling {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private long id;
	

	private int totalprice;
	private boolean bezorgd;
	
	@OneToMany
	List<Maaltijd> maaltijden;
	
	@ManyToOne
	Klant klant;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	public int getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(int totalprice) {
		this.totalprice = totalprice;
	}

	public boolean isBezorgd() {
		return bezorgd;
	}

	public void setBezorgd(boolean bezorgd) {
		this.bezorgd = bezorgd;
	}

	public List<Maaltijd> getMaaltijden() {
		return maaltijden;
	}

	public void setMaaltijden(List<Maaltijd> maaltijden) {
		this.maaltijden = maaltijden;
	}

	public Klant getKlant() {
		return klant;
	}

	public void setKlant(Klant klant) {
		this.klant = klant;
	}
	
	
}

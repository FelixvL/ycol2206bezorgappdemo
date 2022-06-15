package nl.bezorgyc.appvoorbezorg.persistence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.bezorgyc.appvoorbezorg.domein.Bestelling;
import nl.bezorgyc.appvoorbezorg.domein.Klant;

@Service
public class BestellingService {
	@Autowired
	BestellingRepository br;

	@Autowired
	KlantRepository kr;
	
	public void maakBestellingAan() {
		System.out.println("bestelling aanmaken in BService");
		br.save(new Bestelling());
	}

	public Iterable<Bestelling> vindAlleBestellingen() {
		return br.findAll();
		
	}

	public Iterable<Bestelling> nieuweBestellingAanmaken(Bestelling bestelling) {
		br.save(bestelling);
		return br.findDistinctBestellingsByTotalprice(55);
	}

	public Bestelling vindBestellingById(long bestellingid) {
		// TODO Auto-generated method stub
		Bestelling nogffgebruiken = br.findById(bestellingid).get();
		Klant k = new Klant();
		k.setAdres("Vlakbij 13");
		Klant temp = kr.save(k);
		nogffgebruiken.setKlant(temp);
		nogffgebruiken = br.save(nogffgebruiken);
		return nogffgebruiken;
		
		
	}


}

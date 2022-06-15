package nl.bezorgyc.appvoorbezorg.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import nl.bezorgyc.appvoorbezorg.domein.Bestelling;
import nl.bezorgyc.appvoorbezorg.domein.Maaltijd;
import nl.bezorgyc.appvoorbezorg.persistence.BestellingService;

@RestController
public class BestellingEndpoint {
	@Autowired
	BestellingService bs;

	@GetMapping("ffproberen")
	public String ffproberen() {
		System.out.println("ff proberen");
		return "ontvangen!!";
	}
	@GetMapping("eenbestelling")
	public Bestelling eenbestelling() {
		System.out.println("een bestelling");
		return new Bestelling();
	}
	@GetMapping("voorbeeld/{mijncijfer}")
	public int voorbeeld(@PathVariable("mijncijfer") int mijncijfer) {
		System.out.println("een voorbeeld"+mijncijfer);
		return 6 + mijncijfer;
	}
	@GetMapping("voorbeeld2")
	public int voorbeeld2(@RequestParam("mijncijfer") int mijncijfer) {
		System.out.println("een voorbeeld"+mijncijfer);
		bs.maakBestellingAan();
		return 6;
	}
	@PostMapping("voorbeeld3")
	public void posten(@RequestBody Maaltijd m) {
		System.out.println(m.getNaam());
	}
	
	
	

	
	
	
	@GetMapping("allebestellingen")
	public Iterable<Bestelling> allebestellingen() {
		return bs.vindAlleBestellingen();
	}
	
	
	@PostMapping("nieuwebestelling")
	public Iterable<Bestelling> nieuwebestelling(@RequestBody Bestelling bestelling) {
		System.out.println("hij doet het");
		return bs.nieuweBestellingAanmaken(bestelling);
	}
	
	@GetMapping("vindbestelling/{bestelid}")
	public Bestelling vindBestelling(@PathVariable("bestelid") int bestellingid) {
		
		return bs.vindBestellingById(bestellingid);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

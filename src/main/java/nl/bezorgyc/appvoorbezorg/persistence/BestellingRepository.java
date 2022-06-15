package nl.bezorgyc.appvoorbezorg.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import nl.bezorgyc.appvoorbezorg.domein.Bestelling;

@Component
public interface BestellingRepository extends CrudRepository<Bestelling,Long> {

	 Iterable<Bestelling> findDistinctBestellingsByTotalprice(int totalprice);
}

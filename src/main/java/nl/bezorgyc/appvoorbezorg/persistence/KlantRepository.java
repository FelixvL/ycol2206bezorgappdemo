package nl.bezorgyc.appvoorbezorg.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import nl.bezorgyc.appvoorbezorg.domein.Klant;

@Component
public interface KlantRepository extends CrudRepository<Klant,Long>{

}

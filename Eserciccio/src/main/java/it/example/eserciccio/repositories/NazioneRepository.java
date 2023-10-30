package it.example.eserciccio.repositories;

import it.example.eserciccio.domain.Nazione;
import org.springframework.data.repository.CrudRepository;

public interface NazioneRepository  extends CrudRepository<Nazione, Long> {
}

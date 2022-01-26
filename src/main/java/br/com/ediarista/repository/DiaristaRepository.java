package br.com.ediarista.repository;

import br.com.ediarista.model.Diarista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiaristaRepository extends JpaRepository<Diarista, Long > {
}

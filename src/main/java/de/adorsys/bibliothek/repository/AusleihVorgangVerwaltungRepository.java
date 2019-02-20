package de.adorsys.bibliothek.repository;

import de.adorsys.bibliothek.domain.AusleihVorgangsVerwaltung;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface AusleihVorgangVerwaltungRepository extends JpaRepository<AusleihVorgangsVerwaltung,Long> {
}

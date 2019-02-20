package de.adorsys.bibliothek.repository;

import de.adorsys.bibliothek.domain.BibMitarbeiter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface BibMitarbeiterRepository extends JpaRepository<BibMitarbeiter,Long> {
}

package de.adorsys.bibliothek.repository;

import de.adorsys.bibliothek.domain.BibMitglied;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface BibMitgliederVerwaltungRepository extends JpaRepository<BibMitglied,Long> {
}

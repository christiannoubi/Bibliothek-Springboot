package de.adorsys.bibliothek.repository;

import de.adorsys.bibliothek.domain.MedienVerwaltung;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface MedienVerwaltungRepository extends JpaRepository<MedienVerwaltung,Long> {
}

package de.adorsys.bibliothek.repository;

import de.adorsys.bibliothek.domain.Datum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DatumRepository extends JpaRepository<Datum,Long> {
}

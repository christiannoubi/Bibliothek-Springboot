package de.adorsys.bibliothek.repository;

import de.adorsys.bibliothek.domain.Medium;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface MediumRepository extends JpaRepository<Medium,Long> {
}

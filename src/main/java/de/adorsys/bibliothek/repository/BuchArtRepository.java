package de.adorsys.bibliothek.repository;

import de.adorsys.bibliothek.domain.BuchArt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface BuchArtRepository extends JpaRepository<BuchArt,Long> {
}

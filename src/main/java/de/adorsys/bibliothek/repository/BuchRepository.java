package de.adorsys.bibliothek.repository;

import de.adorsys.bibliothek.domain.Buch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface BuchRepository extends JpaRepository<Buch,Long> {

}

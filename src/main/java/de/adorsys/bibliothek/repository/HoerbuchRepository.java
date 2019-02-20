package de.adorsys.bibliothek.repository;

import de.adorsys.bibliothek.domain.Hoerbuch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface HoerbuchRepository extends JpaRepository<Hoerbuch,Long> {
}

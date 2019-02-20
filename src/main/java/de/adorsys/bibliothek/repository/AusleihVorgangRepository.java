package de.adorsys.bibliothek.repository;

import de.adorsys.bibliothek.domain.AusleihVorgang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource

public interface AusleihVorgangRepository extends JpaRepository <AusleihVorgang,Long> {
}

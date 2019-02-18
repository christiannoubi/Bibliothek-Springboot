package de.adorsys.bibliothek.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
interface AusleihVorgangVerwaltungRepository extends JpaRepository {
}

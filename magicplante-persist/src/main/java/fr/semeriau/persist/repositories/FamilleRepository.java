package fr.semeriau.persist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.semeriau.persist.entities.FamilleEntity;

public interface FamilleRepository extends JpaRepository<FamilleEntity, String> {
	

	
}

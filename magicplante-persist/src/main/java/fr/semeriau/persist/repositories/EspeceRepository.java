package fr.semeriau.persist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.semeriau.persist.entities.EspeceEntity;

public interface EspeceRepository extends JpaRepository<EspeceEntity, String> {
	

	
}

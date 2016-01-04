package fr.semeriau.persist.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import fr.semeriau.persist.config.PersistenceContext;
import fr.semeriau.persist.entities.FamilleEntity;
import fr.semeriau.persist.repositories.FamilleRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=PersistenceContext.class, loader=AnnotationConfigContextLoader.class)
public class FamilleTest {
	@Autowired
	private FamilleRepository familleRepo;
	
	@Test
	public void testFindAll(){
		List<FamilleEntity> familles = familleRepo.findAll();
		assertTrue(familles.size() > 0);
	}
}

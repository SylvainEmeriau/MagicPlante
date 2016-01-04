package fr.semeriau.persist.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "espece")
public class EspeceEntity {
	@Id
	private String id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "famille_id")
	private FamilleEntity famille;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public FamilleEntity getFamille() {
		return famille;
	}

	public void setFamille(FamilleEntity famille) {
		this.famille = famille;
	}
	
	
}

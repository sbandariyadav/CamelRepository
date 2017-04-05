package camelRest;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class SampleDAO  {

	@PersistenceContext(unitName="primary")
	private EntityManager entityManager;
	
	public Sample getSample(long id) {
	return entityManager.find(Sample.class, id);
	}

	public Sample saveSample(Sample sample) {
		entityManager.persist(sample);
		return sample;
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
}

package camelRest;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public abstract class SamplePersistenceManager {
	
	private static EntityManager manager;

	public synchronized EntityManager getManager() {
		if(manager==null){
		 manager = Persistence.createEntityManagerFactory("primary").createEntityManager();
		}
		 return manager;
	}

	public void setManager(EntityManager theManager) {
		manager = theManager;
	}

}

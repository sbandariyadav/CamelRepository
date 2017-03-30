package camelRest;

import javax.ejb.Stateless;

@Stateless
public class SampleDAO extends SamplePersistenceManager {

	public Sample getSample(long id) {
	return getManager().find(Sample.class, id);
	}

	public Sample saveSample(Sample sample) {
		getManager().persist(sample);
		return sample;
	}
}

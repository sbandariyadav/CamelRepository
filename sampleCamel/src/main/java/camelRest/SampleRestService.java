package camelRest;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class SampleRestService {
	
	@Inject
	private SampleDAO sampleDAO;
	
	public void printLogger(){
		System.out.println("I am in print logger service method");
	}

	public Sample getSampleData(long id) {
		return sampleDAO.getSample(id);
	}

	public SampleDAO getSampleDAO() {
		return sampleDAO;
	}

	public void setSampleDAO(SampleDAO sampleDAO) {
		this.sampleDAO = sampleDAO;
	}

	public Sample saveSample(Sample sample) {
		return sampleDAO.saveSample(sample);
	}

}

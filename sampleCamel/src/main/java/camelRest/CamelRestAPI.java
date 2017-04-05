package camelRest;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Providers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ApplicationScoped
@Named("Camel_Rest_API")
public class CamelRestAPI {
private static final Logger logger = LoggerFactory.getLogger(CamelRestAPI.class);
	
	@Inject
	private SampleRestService sampleRestService;
	@Context Providers providers;
	
	@GET
	@Path(value = "/sample/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getSampleData(@PathParam("id") long id) {
		System.out.println("**********"+id);
		Sample sample = null;
		try{
		sample = sampleRestService.getSampleData(id);
		System.out.println("(((((   "+Response.ok().entity(sample).build());
		logger.info("after service call");
		}catch(Exception e){
			e.printStackTrace();
		}
		return Response.ok().entity(sample).build();
	}
	
	@POST
	@Path(value = "/sample")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response saveSampleData() {
		Sample sample = new Sample();
		sample.setId(1);
		sample.setName("name1");
		/*Gson gson = new GsonBuilder().create();
    	AuthenticationParametersData authenticationParamsData = gson.fromJson(authenticationParametersData, AuthenticationParametersData.class);
    	*/
		sample =  sampleRestService.saveSample(sample);
		logger.info("after service call");
		return Response.ok().build();
	}

	public SampleRestService getSampleRestService() {
		return sampleRestService;
	}

	public void setSampleRestService(SampleRestService sampleRestService) {
		this.sampleRestService = sampleRestService;
	}
}

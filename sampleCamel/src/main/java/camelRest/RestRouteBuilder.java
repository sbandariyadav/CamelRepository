package camelRest;

import javax.enterprise.context.ApplicationScoped;

import org.apache.camel.builder.RouteBuilder;
@ApplicationScoped
public class RestRouteBuilder extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		System.out.println("in rest route builder    *************************************");
		from("servlet:///sample?servletName=CamelServlet&matchOnUriPrefix=true").to("cxfbean:Camel_Rest_API?providers=#JsonProvider");
	}

}

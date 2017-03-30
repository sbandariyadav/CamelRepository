package camelRest;

import javax.annotation.sql.DataSourceDefinition;
import javax.ejb.Singleton;
import javax.ejb.Startup;
@DataSourceDefinition(
        className = "org.postgresql.Driver",
        name = "java:app/auaDatabase",
        url = "jdbc:postgresql://localhost:5432/aadhaarTestDB",
        user = "postgres",
        password = "postgres"
        
)
@Singleton
@Startup
public class DatabaseConfiguration {
	
}

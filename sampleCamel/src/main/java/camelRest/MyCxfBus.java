package camelRest;

import javax.enterprise.context.Dependent;
import javax.inject.Named;

import org.apache.cxf.bus.extension.ExtensionManagerBus;

@Dependent 
@Named("auaBus") 
public class MyCxfBus extends ExtensionManagerBus {
	
} 

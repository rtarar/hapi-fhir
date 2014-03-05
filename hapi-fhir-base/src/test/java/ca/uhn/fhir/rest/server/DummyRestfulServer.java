package ca.uhn.fhir.rest.server;

import java.util.Arrays;
import java.util.Collection;

import ca.uhn.fhir.rest.server.IResourceProvider;
import ca.uhn.fhir.rest.server.RestfulServer;

public class DummyRestfulServer extends RestfulServer {

	private static final long serialVersionUID = 1L;
	
	private Collection<IResourceProvider> myResourceProviders;

	public DummyRestfulServer(IResourceProvider... theResourceProviders) {
		myResourceProviders = Arrays.asList(theResourceProviders);
	}

	@Override
	public Collection<IResourceProvider> getResourceProviders() {
		return myResourceProviders;
	}

}

package io.github.pgerhard.endpoint;

import javax.annotation.security.PermitAll;

import com.vaadin.flow.server.connect.Endpoint;

/**
 * Endpoint returning a Java class, which uses a {@link com.vaadin.flow.server.StreamResource} as an attribute.
 */
@Endpoint
public class StreamResourceEndpoint {

    /**
     * Get a resource from the endpoint.
     *
     * @return a container object containing the resource
     */
    @PermitAll
    public ResourceContainer getResource () {
        return new ResourceContainer ();
    }
}

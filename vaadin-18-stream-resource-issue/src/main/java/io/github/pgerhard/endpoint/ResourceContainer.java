package io.github.pgerhard.endpoint;

import com.vaadin.flow.server.StreamResource;

public class ResourceContainer {

    private String name;

    private StreamResource resource;

    public String getName () {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public StreamResource getResource () {
        return resource;
    }

    public void setResource ( StreamResource resource ) {
        this.resource = resource;
    }
}

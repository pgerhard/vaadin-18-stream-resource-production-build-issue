# vaadin-18-stream-resource-production-build-issue
Project for replicating build failures when using a StreamResource is used in a Vaadin Endpoint


## Issue description

The class ```io.github.pgerhard.endpoint.StreamResourceEndpoint``` uses ```io.github.pgerhard.endpoint.ResourceContainer``` which a 
```com.vaadin.flow.server.StreamResource```.  
During development this works as expected and generates a ```StreamResourceEndpoint.ts``` file. It also generates a representation of the StreamResource.  
However during production builds this fails with the following error

```shell
[ERROR] Failed to execute goal com.vaadin:vaadin-maven-plugin:18.0.5:build-frontend (default) on project vaadin-18-stream-resource-issue: Execution default of goal com.vaadin:vaadin-maven-plugin:18.0.5:build-frontend failed: Type javax.servlet.ServletContext not present -> [Help 1]
```

### How to reproduce

1. Run ```mvn clean install``` inside ```vaadin-18-stream-resource-issue``` and after the successful build, start the application. Leads to expected result, a running application
2. Run ```mvn clean package -Pproduction``` inside ```vaadin-18-stream-resource-issue```, this will result in the above build error

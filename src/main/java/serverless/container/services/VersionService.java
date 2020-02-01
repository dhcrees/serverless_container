package serverless.container.services;

import serverless.container.model.response.VersionResponse;
import serverless.container.rest.resources.VersionResource;

import java.io.IOException;
import java.net.URL;
import java.util.Properties;

public class VersionService {

    public VersionResponse getVersion() throws IOException {

        Properties properties = new Properties();
        VersionResponse response = new VersionResponse();

        URL url = VersionResource.class.getResource("/maven.properties");
        String version = null;
        String buildDateTime = null;

        if (url != null) {
            properties.load(url.openStream());
            version = properties.getProperty("version");
            buildDateTime = properties.getProperty("buildDateTime");
        }

        response.setName("Serverless Container API");
        response.setVersion(version);
        response.setBuildDateTime(buildDateTime);

        return response;
    }
}

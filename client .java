import java.net.URI;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.ClientConfig;

public class client {

        public static void main(String[] args) {
                ClientConfig config = new ClientConfig();

                Client client = ClientBuilder.newClient(config);

                WebTarget target = client.target(getBaseURI());

              


                String plainAnswer =
                               target.path("test").path("hello").request().accept(MediaType.TEXT_PLAIN).get(String.class);
                String xmlAnswer =
                               target.path("test").path("hello").request().accept(MediaType.TEXT_XML).get(String.class);
                String htmlAnswer=
                               target.path("test").path("hello").request().accept(MediaType.TEXT_HTML).get(String.class);

              
                System.out.println(plainAnswer);
                System.out.println(xmlAnswer);
                System.out.println(htmlAnswer);
        }

        private static URI getBaseURI() {
                return UriBuilder.fromUri("http://192.168.0.2:8090/rest").build();
        }
}
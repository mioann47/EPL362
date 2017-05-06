package mysql.pckg;

import java.net.URI;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.ClientConfig;

public class DeletesClient {

	private static URI getBaseURI() {
		return UriBuilder.fromUri("http://localhost:8080/EPL362REST/rest").build();
	}

	public static void deleteallergy(int id) {
		ClientConfig config = new ClientConfig();

		Client client = ClientBuilder.newClient(config);

		WebTarget target;
		target = client.target(getBaseURI());

		String response = target.path("deletes").path("deleteallergy").queryParam("id", id).request()
				.accept(MediaType.TEXT_PLAIN).get(Response.class).toString();
		System.out.println(response);

	}

	public static void deleteappointment(int id) {
		ClientConfig config = new ClientConfig();

		Client client = ClientBuilder.newClient(config);

		WebTarget target;
		target = client.target(getBaseURI());

		String response = target.path("deletes").path("deleteappointment").queryParam("id", id).request()
				.accept(MediaType.TEXT_PLAIN).get(Response.class).toString();
		System.out.println(response);

	}

	public static void deleteclinic(int id) {
		ClientConfig config = new ClientConfig();

		Client client = ClientBuilder.newClient(config);

		WebTarget target;
		target = client.target(getBaseURI());

		String response = target.path("deletes").path("deleteclinic").queryParam("id", id).request()
				.accept(MediaType.TEXT_PLAIN).get(Response.class).toString();
		System.out.println(response);

	}

	public static void deletedrug(int id) {
		ClientConfig config = new ClientConfig();

		Client client = ClientBuilder.newClient(config);

		WebTarget target;
		target = client.target(getBaseURI());

		String response = target.path("deletes").path("deletedrug").queryParam("id", id).request()
				.accept(MediaType.TEXT_PLAIN).get(Response.class).toString();
		System.out.println(response);

	}

	public static void deleteincidents(int id) {
		ClientConfig config = new ClientConfig();

		Client client = ClientBuilder.newClient(config);

		WebTarget target;
		target = client.target(getBaseURI());

		String response = target.path("deletes").path("deleteincidents").queryParam("id", id).request()
				.accept(MediaType.TEXT_PLAIN).get(Response.class).toString();
		System.out.println(response);

	}

	public static void deleteoverruled(int id) {
		ClientConfig config = new ClientConfig();

		Client client = ClientBuilder.newClient(config);

		WebTarget target;
		target = client.target(getBaseURI());

		String response = target.path("deletes").path("deleteoverruled").queryParam("id", id).request()
				.accept(MediaType.TEXT_PLAIN).get(Response.class).toString();
		System.out.println(response);

	}

	public static void deletepatient(int id) {
		ClientConfig config = new ClientConfig();

		Client client = ClientBuilder.newClient(config);

		WebTarget target;
		target = client.target(getBaseURI());

		String response = target.path("deletes").path("deletepatient").queryParam("id", id).request()
				.accept(MediaType.TEXT_PLAIN).get(Response.class).toString();
		System.out.println(response);

	}

	public static void deletepatientallergy(int id) {
		ClientConfig config = new ClientConfig();

		Client client = ClientBuilder.newClient(config);

		WebTarget target;
		target = client.target(getBaseURI());

		String response = target.path("deletes").path("deletepatientallergy").queryParam("id", id).request()
				.accept(MediaType.TEXT_PLAIN).get(Response.class).toString();
		System.out.println(response);

	}

	public static void deleterequest(int id) {
		ClientConfig config = new ClientConfig();

		Client client = ClientBuilder.newClient(config);

		WebTarget target;
		target = client.target(getBaseURI());

		String response = target.path("deletes").path("deleterequest").queryParam("id", id).request()
				.accept(MediaType.TEXT_PLAIN).get(Response.class).toString();
		System.out.println(response);

	}

	public static void deletetreatment(int id) {
		ClientConfig config = new ClientConfig();

		Client client = ClientBuilder.newClient(config);

		WebTarget target;
		target = client.target(getBaseURI());

		String response = target.path("deletes").path("deletetreatment").queryParam("id", id).request()
				.accept(MediaType.TEXT_PLAIN).get(Response.class).toString();
		System.out.println(response);

	}

	public static void deleteuser(int id) {
		ClientConfig config = new ClientConfig();

		Client client = ClientBuilder.newClient(config);

		WebTarget target;
		target = client.target(getBaseURI());

		String response = target.path("deletes").path("deleteuser").queryParam("id", id).request()
				.accept(MediaType.TEXT_PLAIN).get(Response.class).toString();
		System.out.println(response);

	}

	public static void main(String[] args) {

		//deleteallergy(3);
		deleteuser(1);
		/*deletetreatment(1);
		deleterequest(1);
		deletepatientallergy(1);
		deletepatient(1);
		deleteoverruled(1);
		deleteincidents(1);
		deletedrug(1);
		deleteclinic(1);
		deleteappointment(2);*/
	}

}

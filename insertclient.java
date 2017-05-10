

import org.glassfish.jersey.client.ClientConfig;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import java.net.URI;

public class insertclient {

	public static URI getBaseURI() {
		return UriBuilder.fromUri("http://192.168.0.11:8080/EPL362REST/rest").build();
	}

	public static void signup(String username, String password, String name, String role) {
		ClientConfig config = new ClientConfig();

		Client client = ClientBuilder.newClient(config);

		WebTarget target;
		target = client.target(getBaseURI());

		String response = target.path("insert").path("signup").queryParam("username", username)
				.queryParam("password", password).queryParam("name", name).queryParam("role", role).request()
				.accept(MediaType.TEXT_PLAIN).get(Response.class).toString();

	}

	public static void insertpatientupdatelater(int id,String name, String address, String selfharm, String problem) {

		ClientConfig config = new ClientConfig();
		Client client = ClientBuilder.newClient(config);

		WebTarget target;
		target = client.target(getBaseURI());

		String response = target.path("insert").path("insertpatient").queryParam("id", id).queryParam("name", name)
				.queryParam("address", address).queryParam("selfharm", selfharm).queryParam("problem", problem)
				.request().accept(MediaType.TEXT_PLAIN).get(Response.class).toString();

	}
	
	
	
	public static void insertpatient(String name, String address, String selfharm, String problem) {

		ClientConfig config = new ClientConfig();
		Client client = ClientBuilder.newClient(config);

		WebTarget target;
		target = client.target(getBaseURI());

		String response = target.path("insert").path("insertpatient").queryParam("name", name)
				.queryParam("address", address).queryParam("selfharm", selfharm).queryParam("problem", problem)
				.request().accept(MediaType.TEXT_PLAIN).get(Response.class).toString();

	}

	public static void insertclinic(String name, String address, String sdi, String spa) {

		ClientConfig config = new ClientConfig();
		Client client = ClientBuilder.newClient(config);

		WebTarget target;
		target = client.target(getBaseURI());

		String response = target.path("insert").path("insertclinic").queryParam("name", name)
				.queryParam("address", address).queryParam("sdi", sdi).queryParam("spa", spa).request()
				.accept(MediaType.TEXT_PLAIN).get(Response.class).toString();

	}

	public static void insertincident(int id, String details, String date) {

		ClientConfig config = new ClientConfig();
		Client client = ClientBuilder.newClient(config);

		WebTarget target;
		target = client.target(getBaseURI());

		String response = target.path("insert").path("insertincident").queryParam("id", id)
				.queryParam("details", details).queryParam("date", date).request().accept(MediaType.TEXT_PLAIN)
				.get(Response.class).toString();

	}

	public static void inserttreatment(int id, String details, String date) {

		ClientConfig config = new ClientConfig();
		Client client = ClientBuilder.newClient(config);

		WebTarget target;
		target = client.target(getBaseURI());

		String response = target.path("insert").path("inserttreatment").queryParam("id", id)
				.queryParam("details", details).queryParam("date", date).request().accept(MediaType.TEXT_PLAIN)
				.get(Response.class).toString();

	}

	public static void insertallergy(String name) {

		ClientConfig config = new ClientConfig();
		Client client = ClientBuilder.newClient(config);

		WebTarget target;
		target = client.target(getBaseURI());

		String response = target.path("insert").path("insertallergy").queryParam("name", name).request()
				.accept(MediaType.TEXT_PLAIN).get(Response.class).toString();

	}

	public static void insertpatientallergy(int id2, int id3) {

		ClientConfig config = new ClientConfig();
		Client client = ClientBuilder.newClient(config);

		WebTarget target;
		target = client.target(getBaseURI());

		String response = target.path("insert").path("insertpatientallergy").queryParam("pid", id2)
				.queryParam("aid", id3).request().accept(MediaType.TEXT_PLAIN).get(Response.class).toString();

	}

	public static void insertoverruledwarning(int id, int userid) {

		ClientConfig config = new ClientConfig();
		Client client = ClientBuilder.newClient(config);

		WebTarget target;
		target = client.target(getBaseURI());

		String response = target.path("insert").path("insertoverruledwarning").queryParam("paid", id)
				.queryParam("userid", userid).request().accept(MediaType.TEXT_PLAIN).get(Response.class).toString();

	}

	public static void insertappointment(int id, int clinic_id, String date, String doctor) {

		ClientConfig config = new ClientConfig();
		Client client = ClientBuilder.newClient(config);

		WebTarget target;
		target = client.target(getBaseURI());

		String response = target.path("insert").path("insertappointment").queryParam("id", id)
				.queryParam("clinic_id", clinic_id).queryParam("date", date).queryParam("doctor", doctor).request()
				.accept(MediaType.TEXT_PLAIN).get(Response.class).toString();

	}

	public static void insertdrug(String name, String effects) {

		ClientConfig config = new ClientConfig();
		Client client = ClientBuilder.newClient(config);

		WebTarget target;
		target = client.target(getBaseURI());

		String response = target.path("insert").path("insertdrug").queryParam("name", name)
				.queryParam("effects", effects).request().accept(MediaType.TEXT_PLAIN).get(Response.class).toString();

	}

	public static void insertrequest(int id, String name, String address) {

		ClientConfig config = new ClientConfig();
		Client client = ClientBuilder.newClient(config);

		WebTarget target;
		target = client.target(getBaseURI());

		String response = target.path("insert").path("insertrequest").queryParam("id", id).queryParam("name", name)
				.queryParam("address", address).request().accept(MediaType.TEXT_PLAIN).get(Response.class).toString();

	}

	public static void main(String[] args) {

		/*signup("SOUVLEAS2", "PASS", "SOLEAS GIORKOS", "ROLE");
		insertpatient("SOUVLEAS2", "SOUVLEAS", "1", "SOUVLEAS");
		insertclinic("SOUVLEAS2", "SOUVLEAS", "1", "1");
		
		inserttreatment(2, "SOUVLEAS2", "1999-1-1");
		insertallergy("SOUVLEAS2");
		insertpatientallergy(1, 232);
		
		
		
		insertrequest(1, "SOUVLEAS2", "SOUVLEAS");*/
		
		//insertappointment(1, 1, "1999-1-1", "SOUVLEAS");
		//System.out.println("http://localhost:8080/EPL362REST/rest");
		//insertdrug("SOUVLEAS2", "SOUVLEAS");
		//insertincident(1, "SOUVLEAS2", "1999-1-1");
		insertoverruledwarning(4, 4);
	}

}
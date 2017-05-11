import java.io.StringReader;
import java.net.URI;
import java.util.ArrayList;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.glassfish.jersey.client.ClientConfig;



public class ClientObject {
	private static URI getBaseURI() {
        return UriBuilder.fromUri("http://localhost:8080/EPL362REST").build();
}
	
	
	public static ArrayList<Patient> getPatientsList(){
		
		   ClientConfig config = new ClientConfig();

           Client client = ClientBuilder.newClient(config);

           WebTarget target = client.target(getBaseURI());

           PatientListWrapper p = null;



           String plainAnswer =
                          target.path("rest").path("get/patients").request().accept(MediaType.APPLICATION_XML).get(String.class);


         //  System.out.println(plainAnswer);


           
           
           JAXBContext jaxbContext;
		try {
			jaxbContext = JAXBContext.newInstance(PatientListWrapper.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

	           StringReader reader = new StringReader(plainAnswer);
	           p = (PatientListWrapper) unmarshaller.unmarshal(reader);
	           
	         
	           
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
           
		return p.getpList(); 
		
	}
	
	
	
	public static void main(String[] args) {

		
		ArrayList<Patient> list=getPatientsList();
		System.out.println(list.toString());
	}

}

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

public class GetArrayLists {
	private static URI getBaseURI() {
		return UriBuilder.fromUri("http://localhost:8080/EPL362REST").build();
	}

	public static ArrayList<Alergy> getAlergysList() {

		ClientConfig config = new ClientConfig();

		Client client = ClientBuilder.newClient(config);

		WebTarget target = client.target(getBaseURI());

		AlergyWrapper p = null;

		String plainAnswer = target.path("rest").path("get").path("alergys").request().accept(MediaType.APPLICATION_XML)
				.get(String.class);

		JAXBContext jaxbContext;
		try {
			jaxbContext = JAXBContext.newInstance(AlergyWrapper.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

			StringReader reader = new StringReader(plainAnswer);
			p = (AlergyWrapper) unmarshaller.unmarshal(reader);

		} catch (JAXBException e) {

			e.printStackTrace();
		}

		return p.getaList();

	}

	public static ArrayList<Patient> getPatientsList() {

		ClientConfig config = new ClientConfig();

		Client client = ClientBuilder.newClient(config);

		WebTarget target = client.target(getBaseURI());

		PatientListWrapper p = null;

		String plainAnswer = target.path("rest").path("get").path("patients").request()
				.accept(MediaType.APPLICATION_XML).get(String.class);

		JAXBContext jaxbContext;
		try {
			jaxbContext = JAXBContext.newInstance(PatientListWrapper.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

			StringReader reader = new StringReader(plainAnswer);
			p = (PatientListWrapper) unmarshaller.unmarshal(reader);

		} catch (JAXBException e) {

			e.printStackTrace();
		}

		return p.getpList();

	}

	
	
	public static ArrayList<Patient> getPatientsUpdateList() {

		ClientConfig config = new ClientConfig();

		Client client = ClientBuilder.newClient(config);

		WebTarget target = client.target(getBaseURI());

		PatientListWrapper p = null;

		String plainAnswer = target.path("rest").path("get").path("updatelaterpatients").request()
				.accept(MediaType.APPLICATION_XML).get(String.class);

		JAXBContext jaxbContext;
		try {
			jaxbContext = JAXBContext.newInstance(PatientListWrapper.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

			StringReader reader = new StringReader(plainAnswer);
			p = (PatientListWrapper) unmarshaller.unmarshal(reader);

		} catch (JAXBException e) {

			e.printStackTrace();
		}
		
		return p.getpList();

	}
	
	
	public static ArrayList<Patient> getPatientsListself() {

		ClientConfig config = new ClientConfig();

		Client client = ClientBuilder.newClient(config);

		WebTarget target = client.target(getBaseURI());

		PatientListWrapper p = null;

		String plainAnswer = target.path("rest").path("get").path("selfharmpatients").request()
				.accept(MediaType.APPLICATION_XML).get(String.class);

		JAXBContext jaxbContext;
		try {
			jaxbContext = JAXBContext.newInstance(PatientListWrapper.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

			StringReader reader = new StringReader(plainAnswer);
			p = (PatientListWrapper) unmarshaller.unmarshal(reader);

		} catch (JAXBException e) {

			e.printStackTrace();
		}

		return p.getpList();

	}
	
	public static ArrayList<Appointment> getAppointmentsList() {

		ClientConfig config = new ClientConfig();

		Client client = ClientBuilder.newClient(config);

		WebTarget target = client.target(getBaseURI());

		AppointmentWrapper p = null;

		String plainAnswer = target.path("rest").path("get").path("appointments").request()
				.accept(MediaType.APPLICATION_XML).get(String.class);

		JAXBContext jaxbContext;
		try {
			jaxbContext = JAXBContext.newInstance(AppointmentWrapper.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

			StringReader reader = new StringReader(plainAnswer);
			p = (AppointmentWrapper) unmarshaller.unmarshal(reader);

		} catch (JAXBException e) {

			e.printStackTrace();
		}

		return p.getaList();

	}

	
	public static ArrayList<Clinic> getClinicsList() {

		ClientConfig config = new ClientConfig();

		Client client = ClientBuilder.newClient(config);

		WebTarget target = client.target(getBaseURI());

		ClinicWrapper p = null;

		String plainAnswer = target.path("rest").path("get").path("clinics").request()
				.accept(MediaType.APPLICATION_XML).get(String.class);

		JAXBContext jaxbContext;
		try {
			jaxbContext = JAXBContext.newInstance(ClinicWrapper.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

			StringReader reader = new StringReader(plainAnswer);
			p = (ClinicWrapper) unmarshaller.unmarshal(reader);

		} catch (JAXBException e) {

			e.printStackTrace();
		}

		return p.getcList();

	}
	
	
	
	public static ArrayList<Drug> getDrugsList() {

		ClientConfig config = new ClientConfig();

		Client client = ClientBuilder.newClient(config);

		WebTarget target = client.target(getBaseURI());

		DrugWrapper p = null;

		String plainAnswer = target.path("rest").path("get").path("drugs").request()
				.accept(MediaType.APPLICATION_XML).get(String.class);

		JAXBContext jaxbContext;
		try {
			jaxbContext = JAXBContext.newInstance(DrugWrapper.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

			StringReader reader = new StringReader(plainAnswer);
			p = (DrugWrapper) unmarshaller.unmarshal(reader);

		} catch (JAXBException e) {

			e.printStackTrace();
		}

		return p.getdList();

	}
	
	
	public static ArrayList<Incident> getIncidentsList() {

		ClientConfig config = new ClientConfig();

		Client client = ClientBuilder.newClient(config);

		WebTarget target = client.target(getBaseURI());

		IncidentWrapper p = null;

		String plainAnswer = target.path("rest").path("get").path("incidents").request()
				.accept(MediaType.APPLICATION_XML).get(String.class);

		JAXBContext jaxbContext;
		try {
			jaxbContext = JAXBContext.newInstance(IncidentWrapper.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

			StringReader reader = new StringReader(plainAnswer);
			p = (IncidentWrapper) unmarshaller.unmarshal(reader);

		} catch (JAXBException e) {

			e.printStackTrace();
		}

		return p.getiList();

	}
	
	
	public static ArrayList<OverruledWarning> getOverruledWarningList() {

		ClientConfig config = new ClientConfig();

		Client client = ClientBuilder.newClient(config);

		WebTarget target = client.target(getBaseURI());

		OverruledWarningWrapper p = null;

		String plainAnswer = target.path("rest").path("get").path("overruledwarnings").request()
				.accept(MediaType.APPLICATION_XML).get(String.class);

		JAXBContext jaxbContext;
		try {
			jaxbContext = JAXBContext.newInstance(OverruledWarningWrapper.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

			StringReader reader = new StringReader(plainAnswer);
			p = (OverruledWarningWrapper) unmarshaller.unmarshal(reader);

		} catch (JAXBException e) {

			e.printStackTrace();
		}

		return p.getoList();

	}
	
	
	public static ArrayList<PatientAllergy> getPatientAllergyList() {

		ClientConfig config = new ClientConfig();

		Client client = ClientBuilder.newClient(config);

		WebTarget target = client.target(getBaseURI());

		PatientAlergyWrapper p = null;

		String plainAnswer = target.path("rest").path("get").path("patientallergys").request()
				.accept(MediaType.APPLICATION_XML).get(String.class);

		JAXBContext jaxbContext;
		try {
			jaxbContext = JAXBContext.newInstance(PatientAlergyWrapper.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

			StringReader reader = new StringReader(plainAnswer);
			p = (PatientAlergyWrapper) unmarshaller.unmarshal(reader);

		} catch (JAXBException e) {

			e.printStackTrace();
		}

		return p.getpList();

	}
	
	
	
	
	public static ArrayList<request> getrequestList() {

		ClientConfig config = new ClientConfig();

		Client client = ClientBuilder.newClient(config);

		WebTarget target = client.target(getBaseURI());

		requestlistwrapper p = null;

		String plainAnswer = target.path("rest").path("get").path("requests").request()
				.accept(MediaType.APPLICATION_XML).get(String.class);

		JAXBContext jaxbContext;
		try {
			jaxbContext = JAXBContext.newInstance(requestlistwrapper.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

			StringReader reader = new StringReader(plainAnswer);
			p = (requestlistwrapper) unmarshaller.unmarshal(reader);

		} catch (JAXBException e) {

			e.printStackTrace();
		}

	
		return p.getpList();

	}
	
	
	
	public static ArrayList<users> getUsersList() {

		ClientConfig config = new ClientConfig();

		Client client = ClientBuilder.newClient(config);

		WebTarget target = client.target(getBaseURI());

		userslistwrapper p = null;

		String plainAnswer = target.path("rest").path("get").path("users").request()
				.accept(MediaType.APPLICATION_XML).get(String.class);

		JAXBContext jaxbContext;
		try {
			jaxbContext = JAXBContext.newInstance(userslistwrapper.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

			StringReader reader = new StringReader(plainAnswer);
			p = (userslistwrapper) unmarshaller.unmarshal(reader);

		} catch (JAXBException e) {

			e.printStackTrace();
		}

		return p.getpList();

	}


	public static ArrayList<treatment> getTreatmentList() {

		ClientConfig config = new ClientConfig();

		Client client = ClientBuilder.newClient(config);

		WebTarget target = client.target(getBaseURI());

		treatmentlistwrapper p = null;

		String plainAnswer = target.path("rest").path("get").path("treatments").request()
				.accept(MediaType.APPLICATION_XML).get(String.class);

		JAXBContext jaxbContext;
		try {
			jaxbContext = JAXBContext.newInstance(treatmentlistwrapper.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

			StringReader reader = new StringReader(plainAnswer);
			p = (treatmentlistwrapper) unmarshaller.unmarshal(reader);

		} catch (JAXBException e) {

			e.printStackTrace();
		}

		return p.getpList();

	}
	
	
	public static void main(String[] args) {

		ArrayList<Patient> plist = getPatientsList();
		System.out.println(plist.toString());

		ArrayList<Alergy> alist = getAlergysList();
		System.out.println(alist.toString());
		
		ArrayList<Appointment> applist = getAppointmentsList();
		System.out.println(applist.toString());
		
		ArrayList<Clinic> cList = getClinicsList();
		System.out.println(cList.toString());
		
		ArrayList<Drug> dList=getDrugsList();
		System.out.println(dList.toString());
		
		ArrayList<Incident> iList = getIncidentsList();
		System.out.println(iList.toString());
		
		ArrayList<OverruledWarning> owList =getOverruledWarningList() ;
		System.out.println(owList.toString());
		
		ArrayList<PatientAllergy> apList = getPatientAllergyList();
		System.out.println(apList.toString());

		ArrayList<request> rList= getrequestList();
		System.out.println(rList.toString());
		
		ArrayList<users> uList= getUsersList();
		System.out.println(uList.toString());
		
		ArrayList<treatment> tList= getTreatmentList() ;
		System.out.println(tList.toString());
		
		
	}

}

package epl362rest;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/get")
public class GetAll {

	SQLConnection sqlc = new SQLConnection();
	Connection conn = sqlc.getDBConnection();


	
	@GET
	@Path("/patients")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON, MediaType.TEXT_XML  })
		public PatientListWrapper getPatients(){
		if (conn == null) {
			return null;
		}
		ArrayList<Patient> ap = new ArrayList<Patient>();
		ResultSet rs = null;
		String query = "SELECT * FROM PATIENTS";
		try {
			
			Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY,
					ResultSet.CLOSE_CURSORS_AT_COMMIT);		
		
			rs = stmt.executeQuery(query);
			
			
			
			while (rs.next()) {
				
				int col1 = rs.getInt("ID");
				String col2 = rs.getString("NAME");
				String col3 = rs.getString("ADDRESS");
				
				String col4 = rs.getString("SELFHARM");
				
				String col5 = rs.getString("PROBLEM");
				String col6 = rs.getString("PREVIOUS_CONSULTATION");
				
				String col7 = rs.getString("ISALIVE");
				
				
				String col8 = rs.getString("COMMENTS");
				
				
				String col9 = rs.getString("DANGEROUS");
				
				Patient p=new Patient();
				p.setId(col1);
				p.setName(col2);
				p.setAddress(col3);
				p.setSelfharm(col4.charAt(0));
				p.setProblem(col5);
				p.setPrev_cons(col6);
				p.setIsalive(col7.charAt(0));
				p.setComments(col8);
				p.setDangerous(col9.charAt(0));
				
				
				ap.add(p);
				


				
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
		
	
	try {
			if (!conn.isClosed()) {
				conn.close();
			}
		} catch (Exception e) {
			// Ignore the error and continues
		}

	
	

	PatientListWrapper plw= new PatientListWrapper();
	
	plw.setpList(ap);
	
	return plw;
	}

	@GET
	@Path("/alergys")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON, MediaType.TEXT_XML  })
		public AlergyWrapper getAlergys(){
			
		if (conn == null) {
			return null;
		}
		ArrayList<Alergy> ap = new ArrayList<Alergy>();
		ResultSet rs = null;
		String query = "SELECT * FROM ALLERGYS";
		try {
			
			Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY,
					ResultSet.CLOSE_CURSORS_AT_COMMIT);		
		
			rs = stmt.executeQuery(query);
			
			
			
			while (rs.next()) {
				
				int col1 = rs.getInt("ID");
				String col2 = rs.getString("NAME");

				
				Alergy p = new Alergy();
				p.setId(col1);
				p.setName(col2);
	
				
				
				ap.add(p);
				


				
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
		
	
	try {
			if (!conn.isClosed()) {
				conn.close();
			}
		} catch (Exception e) {
			// Ignore the error and continues
		}

	
	

	AlergyWrapper plw= new AlergyWrapper();
	
	plw.setaList(ap);
	
	return plw;
			
		}
	
	
	@GET
	@Path("/appointments")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON, MediaType.TEXT_XML  })
		public AppointmentWrapper getappointments(){
			
		if (conn == null) {
			return null;
		}
		ArrayList<Appointment> ap = new ArrayList<Appointment>();
		ResultSet rs = null;
		String query = "SELECT * FROM APPOINTMENTS";
		try {
			
			Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY,
					ResultSet.CLOSE_CURSORS_AT_COMMIT);		
		
			rs = stmt.executeQuery(query);
			
			
			
			while (rs.next()) {
				
				int col1 = rs.getInt("ID");
				int col2 = rs.getInt("PATIENT_ID");
				int col3 = rs.getInt("CLINIC_ID");
				String col4 = rs.getString("APP_DATE");
				String col5 = rs.getString("DOCTOR");
				
				Appointment p = new Appointment();
				p.setId(col1);
				p.setPatient_id(col2);
				p.setClinic_id(col3);
				p.setDate(col4);
				p.setDoctor(col5);
	
				
				
				ap.add(p);
				


				
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
		
	
	try {
			if (!conn.isClosed()) {
				conn.close();
			}
		} catch (Exception e) {
			// Ignore the error and continues
		}

	
	

	AppointmentWrapper plw= new AppointmentWrapper();
	
	plw.setaList(ap);
	
	
	return plw;
			
		}
	
	
	@GET
	@Path("/clinics")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON, MediaType.TEXT_XML  })
		public ClinicWrapper getclinics(){
			
		if (conn == null) {
			return null;
		}
		ArrayList<Clinic> ap = new ArrayList<Clinic>();
		ResultSet rs = null;
		String query = "SELECT * FROM CLINICS";
		try {
			
			Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY,
					ResultSet.CLOSE_CURSORS_AT_COMMIT);		
		
			rs = stmt.executeQuery(query);
			
			
			
			while (rs.next()) {
				
				int col1 = rs.getInt("ID");
				String col2 = rs.getString("NAME");
				String col3 = rs.getString("ADDRESS");
				String col4 = rs.getString("SUPPORTS_DROP_IN");
				String col5 = rs.getString("SUPPORTS_PRE_ARRANGED");
				
				
				Clinic p = new Clinic();
				p.setId(col1);
				p.setName(col2);
				p.setAddress(col3);
				p.setSupports_drop_in(col4.charAt(0));
				p.setSupports_pre_arranged(col5.charAt(0));
				
	
				
				
				ap.add(p);
				


				
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
		
	
	try {
			if (!conn.isClosed()) {
				conn.close();
			}
		} catch (Exception e) {
			// Ignore the error and continues
		}

	
	

	ClinicWrapper plw= new ClinicWrapper();
	
	plw.setcList(ap);

	
	
	return plw;
			
		}
	
	

	@GET
	@Path("/drugs")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON, MediaType.TEXT_XML  })
		public DrugWrapper getdrugs(){
			
		if (conn == null) {
			return null;
		}
		ArrayList<Drug> ap = new ArrayList<Drug>();
		ResultSet rs = null;
		String query = "SELECT * FROM DRUGS";
		try {
			
			Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY,
					ResultSet.CLOSE_CURSORS_AT_COMMIT);		
		
			rs = stmt.executeQuery(query);
			
			
			
			while (rs.next()) {
				
				int col1 = rs.getInt("ID");
				String col2 = rs.getString("NAME");
				String col3 = rs.getString("SIDE_EFFECTS");	
				
				
				Drug p = new Drug();
				p.setId(col1);
				p.setName(col2);
				p.setSide_effects(col3);
				
	
				
				
				ap.add(p);
				


				
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
		
	
	try {
			if (!conn.isClosed()) {
				conn.close();
			}
		} catch (Exception e) {
			// Ignore the error and continues
		}

	
	

	DrugWrapper plw= new DrugWrapper();
	
	plw.setdList(ap);

	
	
	return plw;
			
		}
	
	@GET
	@Path("/incidents")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON, MediaType.TEXT_XML  })
		public IncidentWrapper getincidents(){
			
		if (conn == null) {
			return null;
		}
		ArrayList<Incident> ap = new ArrayList<Incident>();
		ResultSet rs = null;
		String query = "SELECT * FROM INCIDENTS";
		try {
			
			Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY,
					ResultSet.CLOSE_CURSORS_AT_COMMIT);		
		
			rs = stmt.executeQuery(query);
			
			
			
			while (rs.next()) {
				
				int col1 = rs.getInt("ID");
				int col2 = rs.getInt("PATIENT_ID");
				String col3 = rs.getString("DETAILS");
				String col4 = rs.getString("INCIDENT_DATE");	
				
				
				Incident p = new Incident();
				p.setId(col1);
				p.setPatient_id(col2);
				p.setDetails(col3);
				p.setIncident_date(col4);
				
	
				
	
				
				
				ap.add(p);
				


				
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
		
	
	try {
			if (!conn.isClosed()) {
				conn.close();
			}
		} catch (Exception e) {
			// Ignore the error and continues
		}

	
	

	IncidentWrapper plw= new IncidentWrapper();
	
	plw.setiList(ap);
	

	
	
	return plw;
			
		}
	
	
	@GET
	@Path("/overruledwarnings")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON, MediaType.TEXT_XML  })
		public OverruledWarningWrapper getoverruledwarnings(){
			
		if (conn == null) {
			return null;
		}
		ArrayList<OverruledWarning> ap = new ArrayList<OverruledWarning>();
		ResultSet rs = null;
		String query = "SELECT * FROM OVERRULED_WARNING";
		try {
			
			Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY,
					ResultSet.CLOSE_CURSORS_AT_COMMIT);		
		
			rs = stmt.executeQuery(query);
			
			
			
			while (rs.next()) {
				
				int col1 = rs.getInt("ID");
				int col2 = rs.getInt("ID_PATIENTS_ALLERGYS");	
				int col3 = rs.getInt("USERID");
				
				
				OverruledWarning p = new OverruledWarning();
				p.setId(col1);
				p.setId_patients_allergys(col2);
				p.setUserid(col3);
				
				
	
				ap.add(p);
				


				
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
		
	
	try {
			if (!conn.isClosed()) {
				conn.close();
			}
		} catch (Exception e) {
			// Ignore the error and continues
		}

	
	

	OverruledWarningWrapper plw= new OverruledWarningWrapper();
	
	plw.setoList(ap);
	

	
	
	return plw;
			
		}
	
	@GET
	@Path("/patientallergys")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON, MediaType.TEXT_XML  })
		public PatientAlergyWrapper patientallergys(){
			
		if (conn == null) {
			return null;
		}
		ArrayList<PatientAllergy> ap = new ArrayList<PatientAllergy>();
		ResultSet rs = null;
		String query = "SELECT * FROM PATIENTS_ALLERGYS";
		try {
			
			Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY,
					ResultSet.CLOSE_CURSORS_AT_COMMIT);		
		
			rs = stmt.executeQuery(query);
			
			
			
			while (rs.next()) {
				
				int col1 = rs.getInt("ID");
				int col2 = rs.getInt("PATIENT_ID");	
				int col3 = rs.getInt("ALLERGY_ID");
				
				
				PatientAllergy p = new PatientAllergy();
				p.setId(col1);
				p.setPatient_id(col2);
				p.setAllergy_id(col3);
				
				
				
	
				ap.add(p);
				


				
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
		
	
	try {
			if (!conn.isClosed()) {
				conn.close();
			}
		} catch (Exception e) {
			// Ignore the error and continues
		}

	
	

	PatientAlergyWrapper plw= new PatientAlergyWrapper();
	
	plw.setpList(ap);
	
	

	
	
	return plw;
			
		}

	@GET
	@Path("/treatments")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON, MediaType.TEXT_XML  })

	public treatmentlistwrapper getTreatment(){
		if (conn == null) {
			return null;
		}

		ArrayList<treatment> ap = new ArrayList<treatment>();
		ResultSet rs = null;
		String query = "SELECT * FROM TREATMENT";
		try {

			Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY,
					ResultSet.CLOSE_CURSORS_AT_COMMIT);

			rs = stmt.executeQuery(query);


			while (rs.next()) {

				int col1 = rs.getInt("ID");
				int col2 = rs.getInt("PATIENT_ID");
				String col3 = rs.getString("DETAILS");
				String col4= rs.getString("TREATMENT_DATE");

				treatment p=new treatment();
				p.setId(col1);
				p.setPatientID(col2);
				p.setDetails(col3);
				p.setDate(col4);
				ap.add(p);




			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}




		try {
			if (!conn.isClosed()) {
				conn.close();
			}
		} catch (Exception e) {
			// Ignore the error and continues
		}


		treatmentlistwrapper plw= new treatmentlistwrapper();

		plw.setpList(ap);

		return plw;
	}
	
	@GET
	@Path("/requests")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON, MediaType.TEXT_XML  })

	public requestlistwrapper getRequests(){
		if (conn == null) {
			return null;
		}

		ArrayList<request> ap = new ArrayList<request>();
		ResultSet rs = null;
		String query = "SELECT * FROM REQUESTS";
		try {

			Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY,
					ResultSet.CLOSE_CURSORS_AT_COMMIT);

			rs = stmt.executeQuery(query);


			while (rs.next()) {

				int col1 = rs.getInt("ID");
				int col2 = rs.getInt("PATIENT_ID");
				String col3 = rs.getString("PATIENT_NEW_NAME");
				String col4= rs.getString("NEW_ADDRESS");

				request p=new request();
				p.setId(col1);
				p.setPatientID(col2);
				p.setNewName(col3);
				p.setNewAddress(col4);
				ap.add(p);




			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}




		try {
			if (!conn.isClosed()) {
				conn.close();
			}
		} catch (Exception e) {
			// Ignore the error and continues
		}


		requestlistwrapper plw= new requestlistwrapper();

		plw.setpList(ap);

		return plw;
	}
	
	
	@GET
	@Path("/users")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON, MediaType.TEXT_XML  })

	public userslistwrapper getUser(){
		if (conn == null) {
			return null;
		}

		ArrayList<users> ap = new ArrayList<users>();
		ResultSet rs = null;
		String query = "SELECT * FROM USERS";
		try {

			Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY,
					ResultSet.CLOSE_CURSORS_AT_COMMIT);

			rs = stmt.executeQuery(query);


			while (rs.next()) {

				int col1 = rs.getInt("ID");
				String col2 = rs.getString("USERNAME");
				String col3= rs.getString("PASSWORD");
				String col4= rs.getString("ROLE");
				String col5= rs.getString("NAME");

				users p=new users();
				p.setId(col1);
				p.setUsername(col2);
				p.setPassword(col3);
				p.setRole(col4);
				p.setName(col5);
				ap.add(p);




			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}




		try {
			if (!conn.isClosed()) {
				conn.close();
			}
		} catch (Exception e) {
			// Ignore the error and continues
		}


		userslistwrapper plw= new userslistwrapper();

		plw.setpList(ap);

		return plw;
	}
	
}

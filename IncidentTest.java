package epl362restTests;

import static org.junit.Assert.*;

import org.junit.Test;

import epl362rest.Incident;

public class IncidentTest {

	
	Incident i=new Incident();
	
	
	@Test
	public void testSetGetId() {
		int number=5;
		i.setId(number);
		assertEquals("must be the same ",number,i.getId());
	}




	@Test
	public void testSetGetPatient_id() {
		int number=5;
		i.setPatient_id(number);
		assertEquals("must be the same ",number,i.getPatient_id());
	}

	
	@Test
	public void testSetGetDetails() {
		String details="Something";
		i.setDetails(details);
		assertEquals("must be the same",details,i.getDetails());
		
	}




	@Test
	public void testSetGetIncident_date() {
		String date="21-12-1982";
		i.setIncident_date(date);
		assertEquals("must be the same",date,i.getIncident_date());
	}



}

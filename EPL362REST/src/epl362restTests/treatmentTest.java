package epl362restTests;

import static org.junit.Assert.*;

import org.junit.Test;

import epl362rest.treatment;

public class treatmentTest {

	
	treatment t = new treatment();
	
	@Test
	public void testSetGetId() {
		int number=5;
		t.setId(number);
		assertEquals("must be the same ",number,t.getId());
	}




	@Test
	public void testSetGetPatientID() {
		int number=5;
		t.setPatientID(number);
		assertEquals("must be the same ",number,t.getPatientID());
	}




	@Test
	public void testSetGetDetails() {
		String details="Something";
		t.setDetails(details);
		assertEquals("must be the same",details,t.getDetails());
	}




	@Test
	public void testSetGetDate() {
		String date="21-12-1982";
		t.setDate(date);
		assertEquals("must be the same",date,t.getDate());
	}




}

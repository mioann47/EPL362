package epl362restTests;

import static org.junit.Assert.*;

import org.junit.Test;

import epl362rest.Appointment;

public class AppointmentTest {

	Appointment ap=new Appointment();
	
	@Test
	public void testSetGetId() {
		int number=5;
		ap.setId(number);
		assertEquals("must be the same ",number,ap.getId());
	}

	

	@Test
	public void testSetGetPatient_id() {
		int number=5;
		ap.setPatient_id(number);
		assertEquals("must be the same ",number,ap.getPatient_id());
	}



	@Test
	public void testSetGetClinic_id() {
		int number=5;
		ap.setClinic_id(number);
		assertEquals("must be the same ",number,ap.getClinic_id());
		
	}

	

	@Test
	public void testSetGetDate() {
		String date="21-12-1982";
		ap.setDate(date);
		assertEquals("must be the same",date,ap.getDate());
	}



	@Test
	public void testSetGetDoctor() {

		String doctor="doctor";
		ap.setDoctor(doctor);
		assertEquals("must be the same",doctor,ap.getDoctor());
	}




}

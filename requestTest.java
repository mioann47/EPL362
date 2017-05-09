package epl362restTests;

import static org.junit.Assert.*;

import org.junit.Test;

import epl362rest.request;

public class requestTest {

	request r = new request();
	
	@Test
	public void testSetGetId() {
		int number=5;
		r.setId(number);
		assertEquals("must be the same ",number,r.getId());
	}




	@Test
	public void testSetGetPatientID() {
		int number=5;
		r.setPatientID(number);
		assertEquals("must be the same ",number,r.getPatientID());
	}



	@Test
	public void testSetGetNewName() {
		String name="my name";
		r.setNewName(name);
		assertEquals("must be the same",name,r.getNewName());
	}




	@Test
	public void testSetGetNewAddress() {
		String address="my address";
		r.setNewAddress(address);
		assertEquals("must be the same",address,r.getNewAddress());
	}




}

package epl362restTests;

import static org.junit.Assert.*;

import org.junit.Test;

import epl362rest.Patient;

public class PatientTest {

	
	Patient p= new Patient();
	
	
	@Test
	public void testSetGetId() {
		int number=5;
		p.setId(number);
		assertEquals("must be the same ",number,p.getId());
	}




	@Test
	public void testSetGetName() {
		String name="my name";
		p.setName(name);
		assertEquals("must be the same",name,p.getName());
	}



	@Test
	public void testSetGetAddress() {
		String address="my address";
		p.setAddress(address);
		assertEquals("must be the same",address,p.getAddress());
	}



	@Test
	public void testSetGetSelfharm() {
		char ch='1';
		p.setSelfharm(ch);
		assertEquals("must be the same",ch,p.getSelfharm());
	}




	@Test
	public void testSetGetProblem() {
		String problem="Something";
		p.setProblem(problem);
		assertEquals("must be the same",problem,p.getProblem());
	}




	@Test
	public void testSetGetPrev_cons() {
		String date="21-12-1982";
		p.setPrev_cons(date);
		assertEquals("must be the same",date,p.getPrev_cons());
	}




	@Test
	public void testSetGetIsalive() {
		char ch='1';
		p.setIsalive(ch);
		assertEquals("must be the same",ch,p.getIsalive());
	}




	@Test
	public void testSetGetComments() {
		String comment="Something";
		p.setComments(comment);
		assertEquals("must be the same",comment,p.getComments());
	}



	@Test
	public void testSetGetDangerous() {
		char ch='1';
		p.setDangerous(ch);
		assertEquals("must be the same",ch,p.getDangerous());
	}



}

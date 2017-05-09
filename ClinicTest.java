package epl362restTests;

import static org.junit.Assert.*;

import org.junit.Test;

import epl362rest.Clinic;

public class ClinicTest {

	
	
	Clinic c=new Clinic();
	
	@Test
	public void testSetGetId() {

		int number=5;
		c.setId(number);
		assertEquals("must be the same ",number,c.getId());
	}


	@Test
	public void testSetGetName() {
		String name="my name";
		c.setName(name);
		assertEquals("must be the same",name,c.getName());

	}




	@Test
	public void testSetGetAddress() {
		String address="my address";
		c.setAddress(address);
		assertEquals("must be the same",address,c.getAddress());
	}




	@Test
	public void testSetGetSupports_drop_in() {

		char ch='1';
		c.setSupports_drop_in(ch);
		assertEquals("must be the same",ch,c.getSupports_drop_in());

	}




	@Test
	public void testSetGetSupports_pre_arranged() {

		char ch='1';
		c.setSupports_pre_arranged(ch);
		assertEquals("must be the same",ch,c.getSupports_pre_arranged());


	}



}

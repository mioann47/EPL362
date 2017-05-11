package epl362restTests;

import static org.junit.Assert.*;

import org.junit.Test;

import epl362rest.Alergy;

public class AlergyTest {

	Alergy al=new Alergy();
		
	@Test
	public void testSetGetId() {
		int number=5;
		al.setId(number);
		assertEquals("must be the same ",number,al.getId());
	}

	

	@Test
	public void testSetGetName() {
		String name="my name";
		al.setName(name);
		assertEquals("must be the same",name,al.getName());
	}

	

}

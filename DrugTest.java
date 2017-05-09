package epl362restTests;

import static org.junit.Assert.*;

import org.junit.Test;

import epl362rest.Drug;

public class DrugTest {

	
	Drug d=new Drug();	
	
	@Test
	public void testSetGetId() {
		int number=5;
		d.setId(number);
		assertEquals("must be the same ",number,d.getId());
	}




	@Test
	public void testSetGetName() {
		String name="my name";
		d.setName(name);
		assertEquals("must be the same",name,d.getName());

	}




	@Test
	public void testSetGetSide_effects() {

		String side_effect="my name";
		d.setSide_effects(side_effect);
		assertEquals("must be the same",side_effect,d.getSide_effects());

	}




}

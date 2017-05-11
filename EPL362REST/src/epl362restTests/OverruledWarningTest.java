package epl362restTests;

import static org.junit.Assert.*;

import org.junit.Test;

import epl362rest.OverruledWarning;

public class OverruledWarningTest {

	
	OverruledWarning ow=new OverruledWarning();
	
	@Test
	public void testSetGetId() {
		int number=5;
		ow.setId(number);
		assertEquals("must be the same ",number,ow.getId());
	}




	@Test
	public void testSetGetId_patients_allergys() {
		int number=5;
		ow.setId_patients_allergys(number);
		assertEquals("must be the same ",number,ow.getId_patients_allergys());
	}




	@Test
	public void testSetGetUserid() {
		int number=5;
		ow.setUserid(number);
		assertEquals("must be the same ",number,ow.getUserid());
	}

	

}

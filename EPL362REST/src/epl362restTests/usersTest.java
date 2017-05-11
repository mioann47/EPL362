package epl362restTests;

import static org.junit.Assert.*;

import org.junit.Test;

import epl362rest.users;

public class usersTest {

	users u = new users();
	
	
	@Test
	public void testSetGetId() {
		int number=5;
		u.setId(number);
		assertEquals("must be the same ",number,u.getId());
	}

	

	@Test
	public void testSetGetUsername() {
		String name="myusername";
		u.setUsername(name);
		assertEquals("must be the same",name,u.getUsername());
	}



	@Test
	public void testSetGetPassword() {
		String name="mypassword";
		u.setUsername(name);
		assertEquals("must be the same",name,u.getUsername());
	}




	@Test
	public void testSetGetRole() {
		String role="myrole";
		u.setRole(role);
		assertEquals("must be the same",role,u.getRole());
	}



	

	@Test
	public void testSetGetName() {
		String name="my name";
		u.setName(name);
		assertEquals("must be the same",name,u.getName());
	}




}

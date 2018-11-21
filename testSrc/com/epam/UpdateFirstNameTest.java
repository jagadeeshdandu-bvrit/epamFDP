/**
 * 
 */
package com.epam;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Jagadeesh_D
 *
 */
// TODO to check for whether the object of class exist or not.
// TODO to check for whether the first name is empty or not.
// TODO to check for whether the first name is valid or not.
// TODO to check for max length of first name.
// TODO to check for whether the first name is updated or not.
class UpdateFirstNameTest {

	UpdateFirstName obj;
	String fname;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		obj = new UpdateFirstName();
		assertNotNull(obj);
		obj.setFirstName("Surya");
	}

	/**
	 * Test method for {@link com.epam.UpdateFirstName#updateInfo()}.
	 */
	@Test
	void testFirstNameIsEmpty()	{	
		assertNotNull(obj.getFirstName(), "First Name field is empty");
	}
	
	@Test
	void testFirstNameIsValid() {		
		fname = obj.getFirstName();
		String expression = "^[a-zA-Z\\s]+";
		assertTrue(fname.matches(expression), "First Name should contain only alphabets");		
	}
	
	@Test
	void testFirstNameMaxLength() {
		assertTrue(!(obj.getFirstName().length() > UpdateFirstName.MAXLENGTH), "First Name Max length exceeded");
	}
	
	@Test
	void testFirstNameUpdateInfo() {		
		UpdateFirstNameDAO objDAO = new UpdateFirstNameDAO();
		assertTrue(objDAO.updateStatus(), "First Name not Updated");
	}

}

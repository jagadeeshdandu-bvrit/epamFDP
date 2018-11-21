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
//TODO to check for whether the object of class exist or not.
//TODO to check for whether the parent contact is empty or not.
//TODO to check for whether the parent contact is valid or not.
//TODO to check for max length of parent contact.
//TODO to check for whether the parent contact is updated or not.
class UpdateParentContactTest {

	/**
	 * @throws java.lang.Exception
	 */
	UpdateParentContact obj;
	String contact;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		obj = new UpdateParentContact();
		assertNotNull(obj);
		obj.setParentContact("9999999999");
	}

	/**
	 * Test method for {@link com.epam.UpdateContact#updateInfo()}.
	 */
	@Test
	void testParentContactIsEmpty()	{	
		assertNotNull(obj.getParentContact(), "Contact field is empty");
	}
	
	@Test
	void testParentContactIsValid() {		
		contact = obj.getParentContact();
		String expression = "^[0-9]+";
		assertTrue(contact.matches(expression), "Contact should contain only numbers");		
	}
	
	@Test
	void testParentContactMaxLength() {
		assertTrue(obj.getParentContact().length() == UpdateParentContact.LENGTH, "Contact should have exactly 10 digits");
	}
	
	@Test
	void testParentContactUpdateInfo() {		
		UpdateParentContactDAO objDAO = new UpdateParentContactDAO();
		assertTrue(objDAO.updateStatus(), "Contact not Updated");
	}

}

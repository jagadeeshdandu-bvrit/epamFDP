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
//TODO to check for whether the contact is empty or not.
//TODO to check for whether the contact is valid or not.
//TODO to check for max length of contact.
//TODO to check for whether the contact is updated or not.
class UpdateContactTest {
	UpdateContact obj;
	String contact;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		obj = new UpdateContact();
		assertNotNull(obj);
		obj.setContact("9999999999");
	}

	/**
	 * Test method for {@link com.epam.UpdateContact#updateInfo()}.
	 */
	@Test
	void testContactIsEmpty()	{	
		assertNotNull(obj.getContact(), "Contact field is empty");
	}
	
	@Test
	void testContactIsValid() {		
		contact = obj.getContact();
		String expression = "^[0-9]+";
		assertTrue(contact.matches(expression), "Contact should contain only numbers");		
	}
	
	@Test
	void testContactMaxLength() {
		assertTrue(obj.getContact().length() == UpdateContact.LENGTH, "Contact should have exactly 10 digits");
	}
	
	@Test
	void testContactUpdateInfo() {		
		UpdateContactDAO objDAO = new UpdateContactDAO();
		assertTrue(objDAO.updateStatus(), "Contact not Updated");
	}

}

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
class UpdateLastNameTest {

	/**
	 * @throws java.lang.Exception
	 */
	// TODO to check for whether the object of class exist or not.
	// TODO to check for whether the Last name is empty or not.
	// TODO to check for whether the first name is valid or not.
	// TODO to check for max length of Last name.
	// TODO to check for whether the Last name is updated or not.
		UpdateLastName obj;
		String fname;
		/**
		 * @throws java.lang.Exception
		 */
		@BeforeEach
		void setUp() throws Exception {
			obj = new UpdateLastName();
			assertNotNull(obj);
		}

		/**
		 * Test method for {@link com.epam.UpdateLastName#updateInfo()}.
		 */
		@Test
		void testLastNameIsEmpty()	{
			assertNotNull(obj.getLastName(), "Field is empty");
		}
		
		@Test
		void testFirstNameIsValid() {
			obj.setLastName("Surya");
			fname = obj.getLastName();
			String expression = "^[a-zA-Z\\s]+";
			assertTrue(fname.matches(expression), "First Name should contain only alphabets");		
		}
		
		@Test
		void testLastNameMaxLength() {
			obj.setLastName("Surya");
			assertTrue(!(obj.getLastName().length() > UpdateLastName.MAXLENGTH), "Last Name Max length exceeded");
		}
		
		@Test
		void testLastNameUpdateInfo() {		
			UpdateLastNameDAO objDAO = new UpdateLastNameDAO();
			assertTrue(objDAO.updateStatus(), "Last Name not Updated");
		}
}

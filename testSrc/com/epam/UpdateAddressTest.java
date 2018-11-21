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
//TODO to check for whether the address is empty or not.
//TODO to check for max length of address.
//TODO to check for whether the address is updated or not.
class UpdateAddressTest {
	UpdateAddress obj;
	String address;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		obj = new UpdateAddress();
		assertNotNull(obj);
		obj.setAddress("af af sadf sadf saf");
	}

	/**
	 * Test method for {@link com.epam.UpdateAddress#updateInfo()}.
	 */
	@Test
	void testAddressIsEmpty()	{	
		assertNotNull(obj.getAddress(), "Contact field is empty");
	}
	
	@Test
	void testAddressMaxLength() {
		assertTrue(obj.getAddress().length() <= UpdateAddress.ADDRESSMAXLENGTH, "Address should have exactly 10 digits");
	}
	
	@Test
	void testAddressUpdateInfo() {		
		UpdateAddressDAO objDAO = new UpdateAddressDAO();
		assertTrue(objDAO.updateStatus(), "Address not Updated");
	}
}

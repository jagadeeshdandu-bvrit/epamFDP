/**
 * 
 */
package com.epam;

/**
 * @author Jagadeesh_D
 *
 */
public class UpdateContact implements UpdatePersonelInfo {
	private String contact;
	final static int LENGTH = 10;

	/* (non-Javadoc)
	 * @see com.epam.UpdatePersonelInfo#updateInfo()
	 */
	@Override
	public void updateInfo() {
		// TODO Auto-generated method stub

	}

	/**
	 * @return the contact
	 */
	public String getContact() {
		return contact;
	}

	/**
	 * @param contact the contact to set
	 */
	public void setContact(String contact) {
		this.contact = contact;
	}

}

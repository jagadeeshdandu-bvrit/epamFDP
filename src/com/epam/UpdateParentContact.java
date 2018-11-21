/**
 * 
 */
package com.epam;

/**
 * @author Jagadeesh_D
 *
 */
public class UpdateParentContact implements UpdatePersonelInfo {
	private String parentContact;
	final static int LENGTH = 10;

	/* (non-Javadoc)
	 * @see com.epam.UpdatePersonelInfo#updateInfo()
	 */
	@Override
	public void updateInfo() {
		// TODO Auto-generated method stub

	}

	/**
	 * @return the parentContact
	 */
	public String getParentContact() {
		return parentContact;
	}

	/**
	 * @param parentContact the parentContact to set
	 */
	public void setParentContact(String parentContact) {
		this.parentContact = parentContact;
	}

}

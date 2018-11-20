/**
 * 
 */
package com.epam;

/**
 * @author Jagadeesh_D
 *
 */
public class UpdateLastName implements UpdatePersonelInfo {
	private String lastName;
	final static int MAXLENGTH = 30;
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/* (non-Javadoc)
	 * @see com.epam.UpdatePersonelInfo#updateInfo()
	 */
	@Override
	public void updateInfo() {
		// TODO Auto-generated method stub

	}

}

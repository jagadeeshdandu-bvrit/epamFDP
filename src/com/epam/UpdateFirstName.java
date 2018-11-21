/**
 * 
 */
package com.epam;

/**
 * @author Jagadeesh_D
 *
 */
public class UpdateFirstName implements UpdatePersonelInfo {
	private String firstName;
	final static int MAXLENGTH = 30;

	/* (non-Javadoc)
	 * @see com.epam.UpdatePersonelInfo#updateInfo()
	 */
	@Override
	public void updateInfo() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

}

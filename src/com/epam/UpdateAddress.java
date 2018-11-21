/**
 * 
 */
package com.epam;

/**
 * @author Jagadeesh_D
 *
 */
public class UpdateAddress implements UpdatePersonelInfo { 
	private String address;
	final static int ADDRESSMAXLENGTH = 150;
	

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}


	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}


	/* (non-Javadoc)
	 * @see com.epam.UpdatePersonelInfo#updateInfo()
	 */
	@Override
	public void updateInfo() {
		// TODO Auto-generated method stub

	}

}

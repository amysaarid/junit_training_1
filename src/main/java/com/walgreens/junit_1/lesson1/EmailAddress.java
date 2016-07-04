
package com.walgreens.junit_1.lesson1;

public class EmailAddress {
	
	private String emailAddress;
	
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public void setEmailAddress(String emailAddress) throws IllegalArgumentException {
		
		if( emailAddress.contains("@")) {
			this.emailAddress = emailAddress;
		} else {
			throw new IllegalArgumentException("EmailAddress.setEmailAddress(): invalid input: " + emailAddress);
		}
	}
}



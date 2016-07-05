
package com.walgreens.junit_1.lesson1;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.Test;

public class EmailAddressTest {
	
	@Test
	public void setEmailAddress_success() {
		// set up
		EmailAddress emailAddress = new EmailAddress();
		
		// run test
		emailAddress.setEmailAddress("jasonbrandford@company.com");
		
		// verify results
		String value = emailAddress.getEmailAddress();
		assertNotNull("ERROR: email address is null", value);
	}
	
	@Test
	public void setEmailAddress_failure() {
		// set up
		EmailAddress emailAddress = new EmailAddress();
		
		// run test
		try {
			emailAddress.setEmailAddress(null);
			fail("NullPointedException was expected.");
		} catch ( NullPointerException e) {
			
		}
		
		try {
			emailAddress.setEmailAddress("asdf");
			fail("IllegalArgumentException was expected.");
		} catch ( IllegalArgumentException e ) {
			
		}
		
		// verify results
	}
}




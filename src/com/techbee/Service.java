package com.techbee;


public class Service {
	
	
	
	

	public Registration save(Registration registration) throws Exception {
		
		String firstName = registration.getFirstName();
		String lastName = registration.getLastName();
		int phoneNumber = registration.getPhoneNumber();
		String email = registration.getEmail();
		String state = registration.getState();
		
		
		//create a Registration object 
		Registration verified = new Registration();
		
		// validate the input
		
		if(firstName != null && !"".equals(firstName) && firstName.length() <= 30 && firstName.matches("^[a-zA-Z]*$")) {
			verified.setFirstName(firstName); 
		} else 
			throw new Exception("First name can not be empty, more than 30 characters, cannot have numbers");
		
		if(lastName != null && !"".equals(lastName) && lastName.length() <= 30 && lastName.matches("^[a-zA-Z]*$")) {
			verified.setLastName(lastName); 
		} else 
			throw new Exception("Last name can not be empty, more than 30 characters, can not have numbers");
		
		verified.setPhoneNumber(phoneNumber);
		
		if(email != null && !"".equals(email) && email.matches("^(.+)@(.+)$")) {
			verified.setEmail(email); 
		} else 
			throw new Exception("Enter a valid email address. e.g johndoe@example.com");
		
		if(state != null && !"".equals(state) && state.length() <= 40 && state.matches("^[a-zA-Z]*$")) {
			verified.setState(state); 
		} else 
			throw new Exception("State can not be empty, more than 40 characters, cannot have numbers");
		
		
		return verified;
	}
	

}

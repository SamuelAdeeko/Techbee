package com.techbee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {

	public static void main(String[] args) throws Exception {
		
		Registration customers = null;
		List<Registration> vCustomer = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < 2; i++) {
			
	
		
		System.out.println("Enter your first name.");
		String firstName = scanner.nextLine();
		System.out.println("Hello " + firstName);
		System.out.println();
		System.out.println("Enter last name");
		String lastName = scanner.nextLine();
		System.out.println(lastName);
		System.out.println();
		
		System.out.println("Enter phone number");
		int phoneNumber = Integer.parseInt(scanner.nextLine());
		System.out.println(phoneNumber);
		System.out.println();
		
		System.out.println("Enter email address");
		String email = scanner.nextLine();
		System.out.println(email);
		System.out.println();
		
		System.out.println("Enter state");
		String state = scanner.nextLine();
		System.out.println(state);
		
		Registration registration = new Registration(firstName, lastName, phoneNumber
				, email, state);
		
		Service service = new Service();
		customers = service.save(registration);
		
		vCustomer.add(customers);
		}
		
		for(Registration r: vCustomer) {
			System.out.println(r);
		}
		
		if(vCustomer.size() >= 1) {
			
			System.out.println("Will you like to register a new customer? Type Yes or No");
			String response = scanner.nextLine();
			String lowerRes = response.toLowerCase();
			if(lowerRes.equals("yes")) {
				
				System.out.println("Enter your first name.");
				String firstName = scanner.nextLine();
				System.out.println("Hello " + firstName);
				System.out.println();
				System.out.println("Enter last name");
				String lastName = scanner.nextLine();
				System.out.println(lastName);
				System.out.println();
				
				System.out.println("Enter phone number");
				int phoneNumber = Integer.parseInt(scanner.nextLine());
				System.out.println(phoneNumber);
				System.out.println();
				
				System.out.println("Enter email address");
				String email = scanner.nextLine();
				System.out.println(email);
				System.out.println();
				
				System.out.println("Enter state");
				String state = scanner.nextLine();
				System.out.println(state);
				
				Registration registration = new Registration(firstName, lastName, phoneNumber
						, email, state);
				
				Service service = new Service();
				customers = service.save(registration);
				
				vCustomer.add(customers);
			}
			
			for(Registration r: vCustomer) {
				System.out.println(r);
			}
			
		}
		
		if(vCustomer.size() >= 1) {
			System.out.println("Will you like to update a record? Type Yes or No");
			String response = scanner.nextLine();
			String lowRes = response.toLowerCase();
			if(lowRes.equals("yes")) {
				System.out.println("Update phone number");
				System.out.println("Enter old number");
				int oldPhoneNumber =Integer.parseInt(scanner.nextLine());
				System.out.println("Enter new number");
				int updateNumber = Integer.parseInt(scanner.nextLine());
				
				// for-each loop to get old number and update with new number
				
				for(Registration r: vCustomer) {
					int tempNumber = r.getPhoneNumber();
					if(tempNumber == oldPhoneNumber) {
						r.setPhoneNumber(updateNumber);
					}
				}
				
				for(Registration r: vCustomer) {
					System.out.println(r);
				}
			}
		}
		
		if(vCustomer.size() >= 1) {
			System.out.println("Will you like to delete a record? Type Yes or No");
			String response = scanner.nextLine();
			String lowRes = response.toLowerCase();
			if(lowRes.equals("yes")) {
				System.out.println("Enter your phone number");
				int phoneNumber =Integer.parseInt(scanner.nextLine());
				
				// for-each loop to get old number and update with new number
				
				for(Registration r: vCustomer) {
					int deleteNumber = r.getPhoneNumber();
					if(deleteNumber == phoneNumber) {
						r.setFirstName("");
						r.setLastName("");
						r.setEmail("");
						r.setPhoneNumber(0);
						r.setState("");
					}
				}
				
				}

			for(Registration r: vCustomer) {
				System.out.println(r);
			}
			
		}
		scanner.close();
	}

}

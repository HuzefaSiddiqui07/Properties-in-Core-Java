package com.properties;

import java.io.FileInputStream;
import java.util.Properties;

public class Test {

	public static void main(String[] args) {
		
		// Create Try & Catch block
		
		try {
			// Create an Object to Locate the Properties File
	FileInputStream fis = new FileInputStream ("C:\\Users\\Stars\\Desktop\\JavaWorkSpace\\Test.properties");
			
			// Load Properties file by using load() of properties class
			Properties p = new Properties ();
			p.load(fis);
			
			// Get the data by using getProperty()
			
			String username = p.getProperty("username");
			String password = p.getProperty("password");
			
			System.out.println("Username is >>>" + username);
			System.out.println("Password is >>>" + password);
		
			
		}
		catch (Exception e) {
			
			System.out.println(e);
			
		}

	}

}

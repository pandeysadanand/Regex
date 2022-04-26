package com.bl.regexuser;

import java.util.Scanner;
import java.util.*;

/**
 * @author sadanand Pandey code for first name validation
 *
 */
public class UserRegistration {

	public static void main(String[] args) {
		boolean result = firstName("Sadanand");

		if (result) {
			System.out.println("User registration is valid");
		} else {
			System.out.println("Please enter correct name.");
		}
	}

	/*
	 * validating first name and name length must be 3
	 */
	public static boolean firstName(String firstName) {
		return firstName.matches("^[A-Z]{1}[a-z]{2,}");
	}
}

package com.bl.regexuser;

import java.util.Scanner;
import java.util.*;

/**
 * @author sadanand Pandey
 *
 */
public class UserRegistration {
	public static void main(String[] args) {

		boolean result1 = lastName("Pndey");
		boolean result2 = email("abc.xyz@bl.co.in");
		boolean result3 = phoneNumber("91 1265487983");
		boolean result4 = passwordRule1("Password");
		
		if (result1) {
			System.out.print("last name is valid \n");
		} else {
			System.out.print("last name is not invalid \n");
		}

		if (result2) {
			System.out.print("email is valid");
		} else {
			System.out.print("email is not invalid");
		}

		if (result3) {
			System.out.print("phone number is valid \n");
		} else {
			System.out.print("Phone number is not invalid \n");
		}
		
		if (result4) {
			System.out.print("password is valid \n");
		} else {
			System.out.print("Password is not invalid \n");
		}

	}

	/*
	 * last name validating
	 */
	public static boolean lastName(String lastName) {
		return lastName.matches("^[A-Z]{1}[a-z]{2,}$");
	}

	/*
	 * email validating
	 */
	public static boolean email(String email) {
		return email.matches("^[A-Z]{3}[a-zA-z0-9+_.$-]*@[a-z]{2}.[a-z]{2}*[a-z]{2}$");
	}

	/*
	 * phone number validating
	 */
	public static boolean phoneNumber(String phoneNumber) {
		return phoneNumber.matches("^[A-Z]{1}[a-z]{2,}$");
	}
	

	/*
	 * password validating rule 1
	 */
	public static boolean passwordRule1(String password) {
		return password.matches("^[A-Z]{1}[a-z]{2,}$");
	}
}

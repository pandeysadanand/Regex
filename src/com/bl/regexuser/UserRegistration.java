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

		if (result1) {
			System.out.print("last name is valid \n");
		} else {
			System.out.print("last name is not invalid \n");
		}

		if (result2) {
			System.out.print("last name is valid");
		} else {
			System.out.print("last name is not invalid");
		}

		if (result3) {
			System.out.print("last name is valid \n");
		} else {
			System.out.print("last name is not invalid \n");
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
}

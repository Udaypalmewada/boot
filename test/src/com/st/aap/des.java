package com.st.aap;

import java.util.Scanner;

public class des {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the value");
		double ch = sc.nextDouble();
		double newValue = Math.floor(ch);
		System.err.println(newValue);
	}

}

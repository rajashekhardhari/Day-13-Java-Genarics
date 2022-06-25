package com.bridgelabz.javagenarics;

public class FindTheMaxFloat {

	public static float compareTo(float num1, float num2, float num3) {

		if (num1 > num2 && num1 > num3) {
			return num1;
		} else if (num2 > num3) {
			return num2;
		} else {
			return num3;
		}
	}

	public static void main(String[] args) {

		FindTheMaxFloat number = new FindTheMaxFloat();
		System.out.println("max Number for 1st test case=" + number.compareTo(4.1f, 2.6f, 1.7f));// Test case 1 :given

		// max
		// number for 1st position.
		System.out.println("max Number for 2nd test case=" + number.compareTo(2.7f, 6.0f, 3.70f));// Test case 2:given
																									// max
																									// number for 2nd
																									// position.
		System.out.println("max Number for 3rd test case=" + number.compareTo(1.1f, 2.1f, 2.2f));// Test case 3:given
																									// max
		// number for the 3rd
		// position.
	}
}

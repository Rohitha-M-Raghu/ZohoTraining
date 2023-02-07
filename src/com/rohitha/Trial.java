package com.rohitha;

import java.util.*;

public class Trial {

		public static void main(String[] args) {
			//Mortgage Calculator
			final byte MONTHS_IN_YEAR = 12;
			final byte PERCENTAGE = 100;
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Principal = ");
			int principle = scanner.nextInt();
			
			System.out.print("\nAnnual Interest Rate = ");
			float annualRate = scanner.nextFloat();
			float monthlyRate = annualRate / PERCENTAGE / MONTHS_IN_YEAR;
			
			System.out.print("\nPeriod(Years) = ");
			byte years = scanner.nextByte();
			int numberofPayments = years * MONTHS_IN_YEAR;
			
			double morgage = principle * (monthlyRate*Math.pow(1 + monthlyRate, numberofPayments)) /(Math.pow(1 + monthlyRate, numberofPayments) - 1);
			System.out.print("\nMorgage = " + morgage);
			
	}
}




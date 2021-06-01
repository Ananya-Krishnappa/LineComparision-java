package com.bridgelabz;

public class ToCompare {
	public static void main(String args[]) {
		int x1, y1, x2, y2, a1, a2, b1, b2;
		Double length, length1;
		x1 = 1;
		y1 = 2;
		x2 = 4;
		y2 = 4;
		a1 = 2;
		b1 = 2;
		a2 = 4;
		b2 = 4;
		length = Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
		length1 = Math.sqrt((a2 - a1) ^ 2 + (b2 - b1) ^ 2);
		int compareResult = length.compareTo(length1);
		String compareMessage;
		if (compareResult == 0) {
			compareMessage = "Length of line1 and line2 is equal";
		} else if (compareResult < 0) {
			compareMessage = "Length of line1 is less than line2";
		} else {
			compareMessage = "Length of line1 is greater than line2";
		}
		System.out.println(compareMessage);
	}
}

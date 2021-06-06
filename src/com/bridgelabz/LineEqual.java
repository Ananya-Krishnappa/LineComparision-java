package com.bridgelabz;

public class LineEqual {
	public static void main(String args[]) {
		int x1, y1, x2, y2, a1, a2, b1, b2;
		Double length, length1;
		x1 = 1;
		y1 = 2;
		x2 = 4;
		y2 = 4;
		a1 = 1;
		b1 = 2;
		a2 = 4;
		b2 = 4;
		length = Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
		length1 = Math.sqrt((a2 - a1) ^ 2 + (b2 - b1) ^ 2);
		String equalMessage = (length.equals(length1) == true) ? "equal" : "not equal";
		System.out.println("Length of two lines is  " + equalMessage);
	}
}

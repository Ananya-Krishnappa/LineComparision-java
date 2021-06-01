package com.bridgelabz;

public class LineLength {
	public static void main(String args[]) {
		int x1, y1, x2, y2;
		double length;
		x1 = 1;
		y1 = 2;
		x2 = 4;
		y2 = 4;
		length = Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
		System.out.println("length is " + length);
	}
}

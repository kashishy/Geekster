package com.java.core;

import java.util.Scanner;

public class MaximumOfThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		System.out.println(Math.max(x, Math.max(y, z)));
		sc.close();
	}
}

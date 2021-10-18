package com.revature.coddingsession;

import java.util.Scanner;

public class StringSplit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a string :");
		
		String s =scanner.nextLine();
		
		String [] arr =s.split(" ");
		for(String a : arr)
			System.out.println(a);
		

	}

}

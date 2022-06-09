package algorithm;

import java.util.Scanner;

public class StringConnect {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int inputNum = sc.nextInt();
		sc.nextLine();
		
		String[] inputStr = new String[inputNum];
		
		for (int i=0; i<inputNum; i++) {
			inputStr[i] = sc.nextLine();
		}
		
		System.out.printf("Hello ");
		for (int i=0; i<inputNum; i++) {
			System.out.printf("%s", inputStr[i]);
		
			if (i == (inputNum-1)) {
				System.out.printf(".");
			} else {
				System.out.printf(", ");
			}
		}
	}
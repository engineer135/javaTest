package test;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���ڿ� �Է�>>");
		String inputString = scanner.nextLine();
		System.out.println(inputString);
		System.out.println();
		
		System.out.println("���� �Է�>>");
		int inputInt = scanner.nextInt();
		System.out.println(inputInt);
		
	}
}
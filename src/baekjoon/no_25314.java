package baekjoon;

import java.util.Scanner;

public class no_25314 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		int len = n/4;
		
		for (int i = 1; i <= len;  i++) {
			System.out.println("long");
		}
		System.out.println("int");
	}

}

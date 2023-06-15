package Doit;

import java.util.Scanner;

public class 연습1_14 {
	
	static void triangleLB(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.println("*");
			}
			System.out.println();
		}
	}
	
	static void triangleLU(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n + 1 - i; j++) {
				System.out.println("*");
			}
			System.out.println();
		}
	}
	
	static void triangleRU(int n) {
		for(int i = 1; i <= n; i++) {
			for (int j = 1; j <= i - 1; j++) {
				System.out.println(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.println("*");
			}
			System.out.println();
		}
	}
	
	static void triangleRB(int n) {
		for(int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.println(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.println("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		triangleLB(n);
		triangleLU(n);
		triangleRU(n);
		triangleRB(n);
		
	}

}

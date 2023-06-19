package Doit;

import java.util.Scanner;

public class 연습1_07 {
		
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			
			int sum = 0;
			
			for (int i = 1; i < n; i++) {
				sum = (1 + n) * (n / 2) + (n  % 2 == 1 ? (n + 1) / 2 : 0);
			}
			System.out.println(sum);
	}

}

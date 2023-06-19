package Doit;

import java.util.Scanner;

public class 연습1_06 {
		
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			
			int sum = 0;
			int i = 1;
			
			while (i <= n) {
				sum += i;
				i++;
			}
			System.out.println("sum의 값 : " + sum);
			System.out.println("i의 값 :  " + i);
	}

}

package baekjoon;

import java.util.Scanner;

public class no_25304 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(); //영수증 총 금액
		int n = sc.nextInt(); //물건의 종류의 수
		int sum = 0;
		
		for (int i = 1; i <= n;  i++) {
			int a = sc.nextInt(); //각 물건의 가격
			int b = sc.nextInt(); //개수
			sum += a * b;
		}
		if (x == sum) {
			System.out.println("Yes");	
		} else {
			System.out.println("No");
		}
	}

}

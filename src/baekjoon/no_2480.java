package baekjoon;

import java.util.Scanner;

public class no_2480 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a == b && b == c) {
			System.out.println(10000 + a * 1000);
		} else if (a == b && b != c) {
			System.out.println(1000 + a * 100);
		} else if (a != b && b != c) {
			if (a > b && b > c) {
				System.out.println(a * 100);
			} else if (b > c && c > a) {
				System.out.println(b * 100);
			} else if (c > a && a > c) {
				System.out.println(c * 100);
			}
		}
	}

}

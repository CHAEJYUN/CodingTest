package baekjoon;

import java.util.Scanner;

public class no_2525 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int cook = sc.nextInt();
		
		int min = h * 60 + m;
		min += cook;
		
		int hour = (min / 60) % 24;
		int minute = min % 60;
		System.out.println(hour + " " + minute);
	}

}

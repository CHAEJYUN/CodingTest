package baekjoon;

import java.util.Scanner;

public class no_10813 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		int m = sc.nextInt();
		
		for (int r =1; r <= n; r++) {
			arr[r] = r;
		}
		
		for (int l = 0; l < m; l++) {
			int i =sc.nextInt();
			int j =sc.nextInt();
			
			int tmp = arr[l];
			arr[i] = arr[j];
			arr[j] = tmp;
		}
		
		for (int k = 0; k < arr.length; k++) {
			System.out.println(arr[k] + " ");
		}
	}

}

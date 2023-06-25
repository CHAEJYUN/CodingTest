package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class no_27866 {

	public static void main(String[] args) throws IOException {
		
//		Scanner sc = new Scanner(System.in);
//		String s = sc.nextLine();
//		int i = sc.nextInt();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int i = Integer.parseInt(br.readLine());
		
		System.out.println(s.charAt(i-1));
	}

}

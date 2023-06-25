package Doit_3검색알고리즘;

import java.util.Scanner;

public class 실습3_1선형검색 {
	// 요솟수가 n인 배열 a에서 key와 값이 같은 요소를 선형 검색
	static int seqSerch(int[] a, int n, int key) {

		int i = 0;

		while (true) {
			if (i == n)
				return -1; // 검색 실패
			if (a[i] == key)
				return i; //성공해서 인덱스를 반환
			i++;
		}
//		for (int i = 0; i < n; i++) {
//			if (a[i] == key) return i;
//			else return -1;
//		}
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("요솟수 : ");
		int num = sc.nextInt(); // 요솟수
		int[] x = new int[num]; // 요솟수가 num인 배열

		for (int i = 0; i < num; i++) {
			System.out.println("x[" + i + "] : ");
			x[i] = sc.nextInt(); //배열 만드는 중
		}
		System.out.println("검색할 값 : ");
		int ky = sc.nextInt(); //찾는 값
		int idx = seqSerch(x, num, ky);
		
		if (idx == -1) System.out.println("검색 실패");
		else System.out.println("x[" + idx + "]에 있음ㅇㅇㅇ");
	}
	
}

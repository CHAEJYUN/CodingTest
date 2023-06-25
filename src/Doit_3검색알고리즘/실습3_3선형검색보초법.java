package Doit_3검색알고리즘;

import java.util.Scanner;

public class 실습3_3선형검색보초법 {
	// 요솟수가 n인 배열 a에서 key와 값이 같은 요소를 선형 검색
	static int seqSerchSen(int[] a, int n, int key) {

		int i = 0;
		a[n] = key; //보초를 추가

		while (true) {
			if (a[i] == key) //성공
				break;
			i++;
		}
		return i == n ? -1 : i; // i가 n이면 찾은 값이 보초이므로 검색 실패가 됨
//		for (int i = 0; i < n; i++) {
//			if (a[i] == key) return i;
//			else return -1;
//		}
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("요솟수 : ");
		int num = sc.nextInt(); // 요솟수
		int[] x = new int[num + 1]; // 요솟수가 num인 배열

		for (int i = 0; i < num; i++) {
			System.out.println("x[" + i + "] : ");
			x[i] = sc.nextInt(); //배열 만드는 중
		}
		System.out.println("검색할 값 : ");
		int ky = sc.nextInt(); //찾는 값
		int idx = seqSerchSen(x, num, ky);
		
		if (idx == -1) System.out.println("검색 실패");
		else System.out.println("x[" + idx + "]에 있음ㅇㅇㅇ");
	}
	
}

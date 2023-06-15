package Doit;

public class 연습1_04 {
	
	static int med3(int a, int b, int c) {
		if (a >= b) {
			if (b >= c) return b;
			else if (a <= c) return a;
			else return c;
		}else if (a > c) return a; //a >= b가 거짓이라면
		else if (b > c)
			return c;
		else
			return b;
	}
		
		public static void main(String[] args) {
			System.out.println("med3(3,2,1) = " + med3(3,2,1));
	}

}

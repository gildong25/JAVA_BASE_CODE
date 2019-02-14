package day04;

public class Calc {
	public static void main(String[] args) {
		// 사용법
		System.out.println(plus(1, 2));
	//  System.out.println(plus(1)); // 형이 맞지 안흐면 오류가난다 - 오버로딩 필요
	}

	public static int plus(int a, int b) {
		return a + b;
	}

	public static int minus(int a, int b) {
		return a - b;
	}

	public static int multiply(int a, int b) {
		return a * b;
	}

	public static int divide(int a, int b) {
		return a / b;
	}

}

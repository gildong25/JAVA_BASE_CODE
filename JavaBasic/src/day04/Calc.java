package day04;

public class Calc {
	public static void main(String[] args) {
		// ����
		System.out.println(plus(1, 2));
	//  System.out.println(plus(1)); // ���� ���� ����� ���������� - �����ε� �ʿ�
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

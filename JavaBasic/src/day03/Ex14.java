package day03;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = 0;
		int result = 0;

		// 1~5������ ���� ���ϼ���
		for (int i = 0; i < 6; i++) {
			result += i;
		}
		System.out.println(result);

		// ����ڿ��� ���ڸ� �Է¹޾� N!�� ���ϼ���
		System.out.print("���ڸ� �Է����ּ���: ");
		N = sc.nextInt();
		result = 1;

		for (int i = N; i > 0; i--) {
			result *= i;
		}
		System.out.println(result);

		// 1~20 ������ ¦���� ���� ���ϼ���.
		result = 0;
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				result += i;
			}
		}
		System.out.println(result);
		sc.close();
	}
}

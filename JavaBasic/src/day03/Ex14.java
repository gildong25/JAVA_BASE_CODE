package day03;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = 0;
		int result = 0;

		// 1~5까지의 합을 구하세요
		for (int i = 0; i < 6; i++) {
			result += i;
		}
		System.out.println(result);

		// 사용자에게 숫자를 입력받아 N!를 구하세요
		System.out.print("숫자를 입력해주세요: ");
		N = sc.nextInt();
		result = 1;

		for (int i = N; i > 0; i--) {
			result *= i;
		}
		System.out.println(result);

		// 1~20 까지의 짝수의 합을 구하세요.
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

package day04;

import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {
		// 1. 5명의 학생의 점수를 받아 총점과 평균을 계산하여 출력하는 프로그램을 만드세요.
		Scanner sc = new Scanner(System.in);
		int n = 5;
		int[] scores = new int[n];
		int sum = 0;
		float average = 0f;

		for (int i = 0; i < scores.length; i++) {
			System.out.print((i + 1) + "번째 학생의 점수를 입력하세요: ");
			scores[i] = sc.nextInt();
		}

		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}

		average = sum / 5.0f; // 암묵적 형변환
//		float num2 = (float)sum; // 명시적 형변환

		System.out.printf("%d명의 학생의 총점은 %d점이고 평균은 %.2f점 입니다.\n", n, sum, average);

		// 2. n명의 점수를 받아 총점과 평균을 계산하는 프로그램을 만드세요
		System.out.print("학생 수를 입력하세요: ");
		n = sc.nextInt();
		scores = new int[n];
		sum = 0;
		average = 0;
		for (int i = 0; i < scores.length; i++) {
			System.out.print(i + 1 + "번째 학생의 점수를 입력하세요: ");
			scores[i] = sc.nextInt();
		}

		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}

		average = sum / (float) n; // average = sum / (n*1.0f);

		System.out.printf("%d명의 학생의 총점은 %d점이고 평균은 %.2f점 입니다.", n, sum, average);
		sc.close();

	}
}

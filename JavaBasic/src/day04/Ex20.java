package day04;

import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {
		// 1. 5���� �л��� ������ �޾� ������ ����� ����Ͽ� ����ϴ� ���α׷��� ���弼��.
		Scanner sc = new Scanner(System.in);
		int n = 5;
		int[] scores = new int[n];
		int sum = 0;
		float average = 0f;

		for (int i = 0; i < scores.length; i++) {
			System.out.print((i + 1) + "��° �л��� ������ �Է��ϼ���: ");
			scores[i] = sc.nextInt();
		}

		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}

		average = sum / 5.0f; // �Ϲ��� ����ȯ
//		float num2 = (float)sum; // ����� ����ȯ

		System.out.printf("%d���� �л��� ������ %d���̰� ����� %.2f�� �Դϴ�.\n", n, sum, average);

		// 2. n���� ������ �޾� ������ ����� ����ϴ� ���α׷��� ���弼��
		System.out.print("�л� ���� �Է��ϼ���: ");
		n = sc.nextInt();
		scores = new int[n];
		sum = 0;
		average = 0;
		for (int i = 0; i < scores.length; i++) {
			System.out.print(i + 1 + "��° �л��� ������ �Է��ϼ���: ");
			scores[i] = sc.nextInt();
		}

		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}

		average = sum / (float) n; // average = sum / (n*1.0f);

		System.out.printf("%d���� �л��� ������ %d���̰� ����� %.2f�� �Դϴ�.", n, sum, average);
		sc.close();

	}
}

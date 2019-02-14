package day03;

import java.util.Scanner;

public class Ex19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = 0;

		System.out.print("숫자를 입력하세요: ");
		N = sc.nextInt();
		System.out.println("------------1-------------");

		// 1
		for (int i = 0; i < N; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("------------2-------------");

		// 2
		for (int i = 0; i < N; i++) {
			for (int j = N; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("------------3-------------");

		// 3
		for (int i = 0; i < N; i++) {
			// 공백의 갯수 4->3->2->1->0
			for (int j = N - 1; j > i; j--) {
				System.out.print(" ");
			}
			// 별의 갯수 1->2->3->4->5
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------4-------------");

		// 4
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = N; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("------------5-------------");

		// 5
		for (int i = 0; i < N; i++) {
			for (int j = N - 1; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			for (int j = 0; j <= i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("------------6-------------");

		// 6
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = N; j > i; j--) {
				System.out.print("*");
			}
			for (int j = N - 1; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------7-------------");

		// 7
		for (int k = 0; k < N * 2; k++) {
			if (k < N) {

				for (int j = N - 1; j > k; j--) {
					System.out.print(" ");
				}
				for (int j = 0; j <= k; j++) {
					System.out.print("*");
				}
				for (int j = 0; j <= k - 1; j++) {
					System.out.print("*");
				}
				for (int j = N; j > k; j--) {
					System.out.print(" ");
				}
				System.out.println();

			} else if (k > 5) {
				for (int j = N; j < k; j++) {
					System.out.print(" ");
				}
				for (int j = N * 2; j > k; j--) {
					System.out.print("*");
				}
				for (int j = N * 2 - 1; j > k; j--) {
					System.out.print("*");
				}
				for (int j = N; j > k; j--) {
					System.out.print(" ");
				}
				System.out.println();

			}
		}

		System.out.println("------------8-------------");

		// 8
		for (int k = 0; k < 2 * N + 1; k++) {
			if (k < N + 1) {
				for (int j = N; j >= k; j--) {
					System.out.print("*");
				}
				for (int j = 0; j < k; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j <= k - 1; j++) {
					System.out.print(" ");
				}
				for (int j = N; j >= k; j--) {
					System.out.print("*");
				}
				System.out.println();

			} else if (k > 5) {
				for (int j = N; j < k + 1; j++) {
					System.out.print("*");
				}
				for (int j = N * 2; j > k; j--) {
					System.out.print(" ");
				}
				for (int j = N * 2; j > k; j--) {
					System.out.print(" ");
				}
				for (int j = N; j < k + 1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
		
		
		
	}
}
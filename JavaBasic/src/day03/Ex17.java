/*** 
 * 무한루프 예제
 * 학생의 점수를 받아 수우미양가를 보여주는 프로그램을 만드세요.
 * 	  조건1. 점수가 -1이면 프로그램을 종료합니다.
 */

package day03;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = 0;

		while (true) {
			System.out.print("점수를 입력하세요: ");
			N = sc.nextInt();
			switch (N / 10) {
			case 10:
			case 9:
				System.out.println("수");
				break;
			case 8:

				System.out.println("우");
				break;
			case 7:
				System.out.println("미");
				break;
			case 6:
				System.out.println("양");
				break;
			case 5:
			case 4:
			case 3:
			case 2:
			case 1:
				System.out.println("가");
				break;
			}
			if (N == -1) {
				break;
			}
		}
		sc.close();
	}

}

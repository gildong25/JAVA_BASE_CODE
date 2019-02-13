/** 조건문 if-else 문 예제 2
 * 학생의 국영수 점수를 받아 통과 여부를 표시하세요
 * - 만약 국영수 총합이 210 미만일시 : 탈락
 * - 만약 점수 하나가 60 미만일 시 : 탈락
 */

package day02;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		int kor = 0;
		int eng = 0;
		int math = 0;
		int sum = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("국어 점수를 입력하세요: ");
		kor = sc.nextInt();
		System.out.print("영어 점수를 입력하세요: ");
		eng = sc.nextInt();
		System.out.print("수학 점수를 입력하세요: ");
		math = sc.nextInt();

		sum = kor + eng + math;

		if (sum < 210 || (kor < 60 || math < 60 || eng < 60)) {
			System.out.println("탈락입니다.");
		} else {
			System.out.println("통과입니다.");
		}

		sc.close();
	}

}

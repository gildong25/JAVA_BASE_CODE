package day02;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		int score = 0;
		String result = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		score = sc.nextInt();

		// switch 문에 변수 조건 설정 가능
		if (score <= 100 && score >= 0) {
			switch (score / 10) {
			case 10:
			case 9:
				result = "A";
				break;
			case 8:
				result = "B";
				break;
			case 7:
				result = "C";
				break;
			case 6:
				result = "D";
				break;
			default:
				result = "F";
				break;
			}
			
			System.out.printf("당신의 학점은 %s 입니다.", result);
		} else {
			System.out.println("점수오류");
		}
		
		
		sc.close();
	}

}

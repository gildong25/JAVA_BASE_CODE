package day03;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int month = 0;
		int day = 0;
		String result = "";
		while (true) {
			// 생월 예외처리
			while (true) {
				System.out.print("월을 입력해주세요(0은 종료): ");
				month = scan.nextInt();

				if (month >= 0 && month <= 12) {
					break;
				} else {
					System.out.println("잘못입력하셨습니다. 다시입력 ");
				}
			}
			if (month == 0) {
				break;
			}

			// 생일 예외처리
			while (true) {
				System.out.print("생일을 입력하세요(0은 종료): ");
				day = scan.nextInt();

				if (day >= 0 && day <= 31) {

					switch (month) {
					case 1:
						if (day >= 20) {
							result = "물병 ";
						} else {
							result = "염소 ";
						}
						break;
					case 2:
						if (day >= 19) {
							result = "물고기 ";
						} else {
							result = "물병 ";
						}
						break;
					case 3:
						if (day >= 21) {
							result = "양 ";
						} else {
							result = "물고기 ";
						}
						break;
					case 4:
						if (day >= 20) {
							result = "황소 ";
						} else {
							result = "양 ";
						}
						break;
					case 5:
						if (day >= 21) {
							result = "쌍둥이 ";
						} else {
							result = "황소 ";
						}
						break;
					case 6:
						if (day >= 22) {
							result = "게 ";
						} else {
							result = "쌍둥이 ";
						}
						break;
					case 7:
						if (day >= 23) {
							result = "사자 ";
						} else {
							result = "게 ";
						}
						break;
					case 8:
						if (day >= 23) {
							result = "처녀 ";
						} else {
							result = "사자 ";
						}
						break;
					case 9:
						if (day >= 24) {
							result = "천칭 ";
						} else {
							result = "처녀 ";
						}
						break;
					case 10:
						if (day >= 23) {
							result = "전갈 ";
						} else {
							result = "천칭 ";
						}
						break;
					case 11:
						if (day >= 23) {
							result = "사수 ";
						} else {
							result = "전갈 ";
						}
						break;
					case 12:
						if (day >= 25) {
							result = "염소 ";
						} else {
							result = "사수 ";
						}
						break;
					}
					System.out.printf("%d월 %d일은 %s자리 입니다.\n", month, day, result);
					break;
				} else {
					System.out.println("잘못입력하셨습니다. 다시입력 ");
				}
			}
			if (day == 0) {
				break;
			}
		}
		scan.close();
	}
}

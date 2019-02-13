package day02;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		int date = 0;
		int month = 0;
		int day = 0;
		String result = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("생일을 네자리로 입력해주세요(ex>1231): ");
		date = sc.nextInt();
		
		month = date / 100;
		day = date % 100;
		
		switch(month) {
		case 1:
			if (day >=20) {
				result ="물병 ";
			} else {
				result ="염소 ";
			}
			break;
		case 2:
			if (day >=19) {
				result ="물고기 ";
			} else {
				result ="물병 ";
			}
			break;
		case 3:
			if (day >=21) {
				result ="양 ";
			} else {
				result ="물고기 ";
			}
			break;
		case 4:
			if (day >=20) {
				result ="황소 ";
			} else {
				result ="양 ";
			}
			break;
		case 5:
			if (day >=21) {
				result ="쌍둥이 ";
			} else {
				result ="황소 ";
			}
			break;
		case 6:
			if (day >=22) {
				result ="게 ";
			} else {
				result ="쌍둥이 ";
			}
			break;
		case 7:
			if (day >=23) {
				result ="사자 ";
			} else {
				result ="게 ";
			}
			break;
		case 8:
			if (day >=23) {
				result ="처녀 ";
			} else {
				result ="사자 ";
			}
			break;
		case 9:
			if (day >=24) {
				result ="천칭 ";
			} else {
				result ="처녀 ";
			}
			break;
		case 10:
			if (day >=23) {
				result ="전갈 ";
			} else {
				result ="천칭 ";
			}
			break;
		case 11:
			if (day >=23) {
				result ="사수 ";
			} else {
				result ="전갈 ";
			}
			break;
		case 12:
			if (day >=25) {
				result ="염소 ";
			} else {
				result ="사수 ";
			}
			break;
		}
		System.out.printf("%d월 %d일은 %s자리 입니다.", month, day, result);
		sc.close();
		
	}

}

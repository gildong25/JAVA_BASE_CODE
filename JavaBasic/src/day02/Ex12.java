package day02;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		int date = 0;
		int month = 0;
		int day = 0;
		String result = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ ���ڸ��� �Է����ּ���(ex>1231): ");
		date = sc.nextInt();
		
		month = date / 100;
		day = date % 100;
		
		switch(month) {
		case 1:
			if (day >=20) {
				result ="���� ";
			} else {
				result ="���� ";
			}
			break;
		case 2:
			if (day >=19) {
				result ="����� ";
			} else {
				result ="���� ";
			}
			break;
		case 3:
			if (day >=21) {
				result ="�� ";
			} else {
				result ="����� ";
			}
			break;
		case 4:
			if (day >=20) {
				result ="Ȳ�� ";
			} else {
				result ="�� ";
			}
			break;
		case 5:
			if (day >=21) {
				result ="�ֵ��� ";
			} else {
				result ="Ȳ�� ";
			}
			break;
		case 6:
			if (day >=22) {
				result ="�� ";
			} else {
				result ="�ֵ��� ";
			}
			break;
		case 7:
			if (day >=23) {
				result ="���� ";
			} else {
				result ="�� ";
			}
			break;
		case 8:
			if (day >=23) {
				result ="ó�� ";
			} else {
				result ="���� ";
			}
			break;
		case 9:
			if (day >=24) {
				result ="õĪ ";
			} else {
				result ="ó�� ";
			}
			break;
		case 10:
			if (day >=23) {
				result ="���� ";
			} else {
				result ="õĪ ";
			}
			break;
		case 11:
			if (day >=23) {
				result ="��� ";
			} else {
				result ="���� ";
			}
			break;
		case 12:
			if (day >=25) {
				result ="���� ";
			} else {
				result ="��� ";
			}
			break;
		}
		System.out.printf("%d�� %d���� %s�ڸ� �Դϴ�.", month, day, result);
		sc.close();
		
	}

}

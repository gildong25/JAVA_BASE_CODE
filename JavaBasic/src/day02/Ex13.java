package day02;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		int score = 0;
		String result = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		score = sc.nextInt();

		// switch ���� ���� ���� ���� ����
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
			
			System.out.printf("����� ������ %s �Դϴ�.", result);
		} else {
			System.out.println("��������");
		}
		
		
		sc.close();
	}

}

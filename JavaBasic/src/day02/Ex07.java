package day02;

import java.util.Scanner;

public class Ex07 {

	public void main(String[] args) {
		float weight = 0;
		float height = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Ű�� �Է��� �ּ���: ");
		height = scan.nextFloat();
		System.out.print("�����Ը� �Է��� �ּ���: ");
		weight = scan.nextFloat();
		
		float bmi = weight / ( height * height);
		
		if(bmi <= 18.5) {
			System.out.println("��ü�� �Դϴ�.");
		} else if (bmi <= 25) {
			System.out.println("����ü�� �Դϴ�.");
		} else if (bmi <= 30) {
			System.out.println("��ü�� �Դϴ�.");
		} else if (bmi <= 40) {
			System.out.println("�� �Դϴ�.");
		} else {
			System.out.println("�� �� �Դϴ�.");	
		}
		
		scan.close();
	}
}

package day02;

import java.util.Scanner;

public class Ex07 {

	public void main(String[] args) {
		float weight = 0;
		float height = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("키를 입력해 주세요: ");
		height = scan.nextFloat();
		System.out.print("몸무게를 입력해 주세요: ");
		weight = scan.nextFloat();
		
		float bmi = weight / ( height * height);
		
		if(bmi <= 18.5) {
			System.out.println("저체중 입니다.");
		} else if (bmi <= 25) {
			System.out.println("정상체중 입니다.");
		} else if (bmi <= 30) {
			System.out.println("과체중 입니다.");
		} else if (bmi <= 40) {
			System.out.println("비만 입니다.");
		} else {
			System.out.println("고도 비만 입니다.");	
		}
		
		scan.close();
	}
}

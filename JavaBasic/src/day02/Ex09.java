package day02;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		int score = 0;
		int num1 = 0;
		int num2 = 0;
		String str1 = "";
		String str2 = "";
		Scanner sc = new Scanner(System.in);

		System.out.print("성적을 입력하세요: ");
		score = sc.nextInt();

		num1 = score / 10;
		num2 = score % 10;

		if (score == 100) {
			System.out.println("A+");
		} else if (score <= 59) {
			System.out.println("F");
		} else {
			if (num1 >= 9) {
				str1 = "A";
			} else if (num1 >= 8) {
				str1 = "B";
			} else if (num1 >= 7) {
				str1 = "C";
			} else if (num1 >= 6) {
				str1 = "D";
			}

			if (num2 >= 7) {
				str2 = "+";
			} else if (num2 >= 4) {
				str2 = "0";
			} else if (num2 >= 0) {
				str2 ="-";
			}
		}
		
		System.out.println(str1+str2);
		sc.close();
	}

}

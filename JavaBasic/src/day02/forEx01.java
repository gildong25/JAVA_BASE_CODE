package day02;

import java.util.Scanner;

public class forEx01 {

	public static void main(String[] args) {
		// 증가 반복
		for(int i = 0; i < 30; i++) {
			System.out.println(i);
		}
		// 감소 반복
		for(int i = 30; i > 0; i--) {
			System.out.println(i);
		}
		// 3씩 감소 반복
		for(int i = 30; i > 0; i-=3) {
			System.out.println(i);
		}
		
		Scanner sc = new Scanner(System.in);
		int result = 0;
		int N = 0;

		
		// 1~9까지의 합을 구하는 프로그램
		for(int i = 0; i < 10; ++i) {
			result += i;
		}
		System.out.println(result);
		
		// 사용자에게 N을 입력받아
		// N!(1~N까지의 곱)을 구하는 프로그램
		
		System.out.print("N을 입력하세요 : ");
		N = sc.nextInt();
		
		result = 1;
		for(int i = 1; i <= N; ++i) {
			result *= i;
		}
		System.out.println(result);
		sc.close();
		
	}
}

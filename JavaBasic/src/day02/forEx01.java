package day02;

import java.util.Scanner;

public class forEx01 {

	public static void main(String[] args) {
		// ���� �ݺ�
		for(int i = 0; i < 30; i++) {
			System.out.println(i);
		}
		// ���� �ݺ�
		for(int i = 30; i > 0; i--) {
			System.out.println(i);
		}
		// 3�� ���� �ݺ�
		for(int i = 30; i > 0; i-=3) {
			System.out.println(i);
		}
		
		Scanner sc = new Scanner(System.in);
		int result = 0;
		int N = 0;

		
		// 1~9������ ���� ���ϴ� ���α׷�
		for(int i = 0; i < 10; ++i) {
			result += i;
		}
		System.out.println(result);
		
		// ����ڿ��� N�� �Է¹޾�
		// N!(1~N������ ��)�� ���ϴ� ���α׷�
		
		System.out.print("N�� �Է��ϼ��� : ");
		N = sc.nextInt();
		
		result = 1;
		for(int i = 1; i <= N; ++i) {
			result *= i;
		}
		System.out.println(result);
		sc.close();
		
	}
}

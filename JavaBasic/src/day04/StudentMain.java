package day04;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {

		Student stu1 = new Student();
		stu1.setName("조재영");
		stu1.setKor(90);
		stu1.setEng(80);
		stu1.setMath(70);

		stu1.showNameScore();
		stu1.showSumAvg();
		
		// 배열 만들기
		int[] arr = new int[5];
		Student[] arr2 = new Student[5];
		
		// 배열 초기화
		arr2[0] = new Student();
		// 배열에 값넣기
		arr2[0].setName("김철수");
		arr2[0].setEng(100);
		arr2[0].setKor(60);
		arr2[0].setMath(45);
		
		
		arr2[0].showNameScore();
		arr2[0].showSumAvg();
		
		
		
		// 연습 코드
		Scanner sc = new Scanner(System.in);
		int[][] stuScore = new int[5][4];
		String[] score = new String[4];
		score[0] = "이름";
		score[1] = "국어점수";
		score[2] = "수학점수";
		score[3] = "영어점수";

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < score.length; j++) {
				System.out.print((i + 1) + "번째 학생의 " + score[j] + " 입력해주세요: ");
				stuScore[i][j] = sc.nextInt();
			}

		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < score.length; j++) {
				if(j>0)
				System.out.print((i + 1) + "번째 학생의 " + score[j]+"은" + stuScore[i][j]+"입니다");
				System.out.println();
			}
			System.out.println();
			System.out.println(i+"번째 학생의 총점은 "+"평균은 ");
		}

	}

}

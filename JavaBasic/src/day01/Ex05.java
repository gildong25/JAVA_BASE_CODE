package day01;
import java.util.*;
public class Ex05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요: ");
		String name = scan.nextLine();
		
		System.out.print("나이를 입력하세요: ");
		int age = scan.nextInt();
		
		System.out.print("키를 입력하세요: ");
		float height = scan.nextFloat();
		
		System.out.print("몸무게를 입력하세요: ");
		float weight = scan.nextFloat();
		
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("키: " + height);
		System.out.println("몸무게: " + weight);
	}
}

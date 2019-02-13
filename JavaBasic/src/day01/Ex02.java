package day01;

public class Ex02 {
	public static void main(String[] args) {
		int n1 =5;
		++n1;
		++n1;
		++n1;
		++n1;
		++n1;
		System.out.println(n1);
		--n1;
		--n1;
		--n1;
		System.out.println(n1);
		
		int a = 6;
		int b = 7;
		
		a = a - 4;
		a -= 4;
		System.out.println(a++ - --b);
		System.out.println(a);
		System.out.println(b);
		
		
	}
}

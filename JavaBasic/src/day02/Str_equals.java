package day02;

public class Str_equals {

	public static void main(String[] args) {
		String str = "abc";
		String str2 = "abc";
		
		System.out.println(str == str2);			// true
		System.out.println(str.equals("abc"));	 	// true
		System.out.println(str.equals(str2));		// true
		
		String str3 = "ABC";
		System.out.println(str3.toLowerCase()); 			//abc 소문자로 변환
		System.out.println(str.equals(str3)); 				//false
		System.out.println(str.equals(str3.toLowerCase())); // true

	}

}
				
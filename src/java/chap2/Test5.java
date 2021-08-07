package java.chap2;

public class Test5 {

	public static void main(String[] args) {
		//1
		System.out.println("=== Test5 Start ====");
		int num = 5;
		//int num = 3; 에러발생 : 변수중복선언
		num = 3; //에러 미발생
		
		char ch = 'a';
		
		
		//2
		int num1 = 3;
		long num2 = 9L;
		
		System.out.println(num1);
		
		num1 = (int)num2;  //강제형변환
		
		System.out.println(num1);
		
		num1 = 3;
		
		//num2 = (long)num1; //자동형변환 가능
		num2 = num1;
		
		System.out.println(num2);
		
		//3
		char ch2 = 'a';
		int num3 = ch2; // int>ch 자동형변환
		System.out.println("num3 : " + num3);
		
		ch = (char)(num3 + 1);
		System.out.println(ch);
		
		//4
		long num4 = 10L;
		float f1 = num4;
		System.out.println(f1);
		
	}

}

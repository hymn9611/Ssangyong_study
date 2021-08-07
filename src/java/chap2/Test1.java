package java.chap2;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.out.println("자바 월드!");
		
		//정수 형태 값을 대입
		//변수 선언 공식 : 데이터타입 변수명;
		
		int num; //초기화;
		num = 100;
		
		//변수 선언과 초기화
		long num2 = 100L;
		
		//1.123
		float num3;
		num3 = 1.123f;
		
		double num4 = 1.123;
		
		//char : 문자 한글자 가능
		char ch = 'a';
		char ch2 = '한';
		
		//논리형 : true, false
		boolean flag = true;
		boolean flag2 = false;
		flag = num > 200;
		
		System.out.println("num : " + num);
		System.out.println("num2 : " + num2);
		System.out.println("num3 : " + num3);
		System.out.println("num4 : " + num4);
		System.out.println("ch : " + ch);
		System.out.println("ch2 : " + ch2);
		System.out.println("flag : " + flag);
	}

}

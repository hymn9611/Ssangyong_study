package java.chap1;

public class Test1 {

	public static void main(String[] args) {
		// 한줄 주석, 설명문, 컴파일 하지 않음
		
		/*
		 여러줄 주석
		*/
		
		/**
		 여러줄 주석, 문서 생성시 주석
		*/
		System.out.println("최현민");
		System.out.println(26+10);
		System.out.println("포항");
		System.out.println(20 + 10);
		System.out.println("20" + 10); //문자열 + 숫자 => 문자열 + 문
		System.out.println("나이 : " + 20);
		
		int perHour; //데이터타입 변수명;, 쓰레기 값
		//System.out.println(perHour); 초기화 값이 없으면 에러 발생
		perHour = 2000; //우측의 값을 좌측에 대입하는 대입 연산
		System.out.println("시급 : " + perHour);
		
		int age = 0; //변수의 선언과 초기화를 동시 할 수 있다
		
		long myMoney = 2000000L;
	}

}

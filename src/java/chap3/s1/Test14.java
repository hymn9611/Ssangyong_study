package java.chap3.s1;

public class Test14 {

	public static void main(String[] args) {
		System.out.println("==== Test14 ====");
		
		/*
		 * switch문을 이용해서 학점 A, B, C, D, F를 구하시오
		 * A(90~100), B(80~90), C(70~80), D(60~70), F
		 * 핵심 : switch의 조건문에는 상수만 들어갈 수 있다.
		 * case를 100개나 생성하는 노가다를 할 필요가 없다.
		 */
		
		int avg = 89;
		
		switch(avg/10) {
		case 10: //case 10 때문에 학점 A 출력문을 두 번 작성하는건 좋지 않다. break문을 없애보자.
		case 9: // case10, 9 : 도 가능하다.
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default :
			System.out.println("F");
		}
		
		
		System.out.println("==== Test14 Finish ====");
	}

}

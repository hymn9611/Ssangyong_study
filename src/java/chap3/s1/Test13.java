package java.chap3.s1;

import java.util.Scanner;

public class Test13 {

	public static void main(String[] args) {
		System.out.println("==== Test13 Start ====");
		
		/*
		 * switch를 활용하여 통신사에 전화를 했을 때 나오는 안내를 흉내내보자
		 * 요금조회는 1번, 상품가입은 2번, 고장신고는 3번, 상담원 연결은 0번
		 * 잘못 눌렀을 경우에는 다시선택 문구를 출력할 것
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("고객님이 원하시는 상담 선택해주세요.");
		System.out.println("요금조회는 1번");
		System.out.println("상품가입은 2번");
		System.out.println("고장신고는 3번");
		System.out.println("상담원 연결은 0번");
		
		int dial = sc.nextInt();
		
		switch(dial) {
		case 1 :
			System.out.println("요금조회를 선택하셨습니다.");
			break;
		case 2 :
			System.out.println("상품가입을 선택하셨습니다.");
			break;
		case 3 :
			System.out.println("고장신고를 선택하셨습니다.");
			break;
		case 0 :
			System.out.println("상담원 연결을 선택하셨습니다.");
			break;
		default :
			int num = 10;
			System.out.println("잘못 입력하셨습니다. 다이얼을 다시 눌러주세요.");
		}

//		지역변수를 이해하기 위한 실험
//		if(dial>0) {
//			int num2 = 20;
//		}
//		System.out.println(num2);
//		System.out.println(dial);
////		System.out.println(num);
		
		System.out.println("==== Test13 Finish ====");
	}

}

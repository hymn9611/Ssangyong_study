package chap3.s1;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		System.out.println("==== Test3 Start ====");
		/* 쇼핑몰의 총 주문금액 입력
		 * 주문금액이 30,000원 이하면 배송비 3,000원이 추가되어 최종 주문금액 출력
		 * ex) 주문금액 : 25,000 -> 28,000출력(배송비 +3,000)
		 * ex2) 주문금액 : 35,000 -> 35,000출력(배송비 x)
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주문금액을 입력하세요.");
		
		
		//주문금액을 담을 변수
		int price = sc.nextInt();
		
		if(price <= 30000) {
			price = price + 3000;
		}
		System.out.println("총 금액 : " + price);
		
		//코드를 작성하기 전에 순서도를 먼저 작성해본다.

		System.out.println("==== Test3 Finish ====");
	}

}

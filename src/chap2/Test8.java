package chap2;

public class Test8 {

	public static void main(String[] args) {
		System.out.println("=== Test8 Start ===");
		
		//물건값의 합계 : 25,000원
		int price;
		//손님이 낸돈 : 30,000원
		int money;
		//거스름 : 5,000원
		int don;
		
		price = 37860;
		money = 100000;
		don = money - price;
		//물건값의 합계보다 손님이 지불한 돈이 많다는 가정
		//물건값의 합계, 손님이 낸돈, 거스름돈 출력
		System.out.println("물건값 합계 : " + price);
		System.out.println("손님이 지불한 돈 : " + money);
		System.out.println("거스름돈 : " + don);
		
		int man = don / 10000; //만짜리 갯수를 담을 변수
		System.out.println("만 원의 갯수 : " + man + "장");
		int cheon = don % 10000 / 1000; //천원짜리 갯수를 담을 변수
		System.out.println("천 원의 갯수 : " + cheon + "장");
		int back = don % 10000 % 1000 / 100; //백원짜리 갯수를 담을 변수
		System.out.println("백 원의 갯수 : " +back + "장");
		int sip = don % 10000 % 1000 % 100 / 10; //십원짜리 갯를 담을 변수
		System.out.println("십 원의 갯수 : " + sip + "장");
		
		
	}

}

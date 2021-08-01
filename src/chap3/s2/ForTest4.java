package chap3.s2;

public class ForTest4 {

	public static void main(String[] args) {
		System.out.println("==== ForTest4 Start ====");
		
		// 1 + 2 + 3 + ... + 1000000000
		// 1 + 2 + 3 + 4 + 5 = 15
		int hap = 0;
		hap = hap + 1; //1
		hap = hap + 2;  //3
		hap = hap + 3; //6
		hap = hap + 4; //10
		hap = hap + 5; //15
		System.out.println(hap);
		
		int hap2 = 0; //for문 안에서 초기화 하는 경우는 i++값만 찍히게 될 것이다.
		for(int i=0; i<6; i++) {
			hap2 = hap2 + i;
			System.out.println(hap2);
		}
		System.out.println("총 합 : " + hap2); //hap2를 for문 안에서 선언했다면 지역변수이기 때문에 이 문장을 출력하지 못했을 것이다.
		
		System.out.println("==== ForTest4 Finish ====");
	}

}

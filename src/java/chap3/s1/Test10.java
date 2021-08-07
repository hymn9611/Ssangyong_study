package java.chap3.s1;

public class Test10 {
	public static void main(String[] args) {
		System.out.println("==== Test10 Start ====");
		
		int select = 1;
		
		if(select == 1) {
			System.out.println("입금");
		} else if(select == 2) {
			System.out.println("출금");
		} else if(select == 3) {
			System.out.println("이체");
		} else {
			System.out.println("조회");
		}
		
		System.out.println("==== Test10 Finish ====");
	}
}

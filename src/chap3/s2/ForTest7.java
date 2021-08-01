package chap3.s2;

public class ForTest7 {
	public static void main(String[] args) {
		System.out.println("==== Test7 Start ====");
		
		//이중 for문 : for문 안에 for문 사용하기
		for(int dan=2; dan<10; dan++) {
			for(int num=1; num<10; num++) {
				System.out.println(dan + "*" + num + "=" + dan * num);
			}
			System.out.println("=======");
		}
		
		System.out.println("==== Test7 Finish ====");
	}

}

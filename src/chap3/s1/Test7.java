package chap3.s1;

public class Test7 {
	public static void main(String[] args) {
		System.out.println("==== Test7 Start ====");
		
		boolean check = true;
		
		if(check) {
			System.out.println("조건식이 true입니다.");
		}
		
		check = false;
		
		//위에서 check가 false가 되었기 때문에 밑의 문장은 출력되지 않는다.
		if(check) {
			System.out.println("조건식 22222가 true");
		}
		
		System.out.println("==== Test7 Finish ====");
	}

}

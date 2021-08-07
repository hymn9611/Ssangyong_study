package java.chap3.s1;

public class Test9 {
	public static void main(String[] args) {
		System.out.println("==== Test9 Start ====");
		
		boolean check = true;
		//not연산을 통해서 check의 true값이 false로 변경이 된다.
		check = !check;
		System.out.println(check);
		
		//not연산을 통해서 check의 값이 true가 됐기 때문에 if구문이 실행된다.
		if(!check) {
			System.out.println("TEST");
		}
		
		/*
		 * 삼항연산자
		 * ? : true일 때 실행
		 * : : false일 때 실
		 */
		int age = 30;
		String result = age > 19 ? "성년" : "미성년";
		System.out.println("result : " + result);
		System.out.println(1+'1'+"1");
		
		
		System.out.println("==== Test9 Finish ====");
	}
}

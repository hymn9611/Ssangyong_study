package java.chap3.s1;

public class Test12 {

	public static void main(String[] args) {
		System.out.println("==== Test12 Start ====");
		
		//Switch 제어문 사용해보기
		int num = 1;
		
		//num=1, 1에 해당하는 케이스를 찾아서 그 구문을 실행한다.
		//꼭 식, 변수를 기입하지 않아도 결과가 정수이면 된다.
		//해당되는 정수가 없다면 default구문이 실행된다.
		
		//case1의 break;문을 제거하면 어떻게 될까?
		//다음 break문을 만날때까지 아래방향으로 진행되어 case2까지 출력된다.
		
		//switch문이 종료되는 경우는 break;문을 만나거나 {} 중괄호의 끝 부분을 만났을때이다.
		//즉, 마지막 default문의 break;문은 굳이 작성하지 않아도 된다는 말이다.
		//++ 꼭 default문이 마지막에 있어야 하는 것이 아니다.
		
		switch(num) {
		case 1 :
			System.out.println("case1");
			break;
		case 2 :
			System.out.println("case2");
			break;
		case 3 :
			System.out.println("case3");
			break;
		case 4 :
			System.out.println("case4");
			break;
		default :
			System.out.println("그 외 나머지");
		}
		
		System.out.println("==== Test12 Finish ====");
	}

}

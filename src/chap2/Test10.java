package chap2;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		System.out.println("==== Test10 Start ====");
		
		/* 다음 규칙을 찾아내고 input을 넣었을 때 output이 나오도록 해보자
		 * 1 -> 1
		 * 2 -> 2
		 * 4 -> 10
		 * 7 -> 13
		 * 8 -> 20
		 */
		
		//변수 - 변하는 수
		//변수 선언 - 데이터타입 변수명
		//java는 필요할 때 변수 선언 가능
		
		//프로그램 실행 중에 데이터를 키보드로부터 입력받을 준비
		Scanner sc = new Scanner(System.in);
		
		int input = 5;
		int output = 0;
		
		System.out.println("숫자를 입력하세요");
		input = sc.nextInt();
		
		output = (input/4*10) + (input%4);
		System.out.println("Input : " + input);
		System.out.println("Output : " + output);
		
		//GitHub 사용하기
		//Code 추가
		//새로운 코드가 추가 되었음(GitHub 확인용)
		
	}

}

package java.chap3.s1;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		
		System.out.println("==== Test4 Start ====");
		
		/* [순서도를 작성해보고 코드 작성]
		 * 10대를 판별하려고 한다.
		 * 나이를 입력하도록 하고, 10이상, 20 미만이면 청소년 출력 후 종료.
		 * 10대가 아니라면 그냥 종료하도록 한다.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		
//		if(age<20) {
//			if(age>=10) {
//				System.out.println("청소년입니다.");
//			}
//		}
		
		// 논리연산자를 통해서 위의 if 코드를 간단히 하여라.
		if(age>=10 && age<20) {
			System.out.println("청소년입니다.");
		}
		
		System.out.println("==== Test4 Finish ====");
	}
}

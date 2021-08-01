package chap3.s2;

import java.util.Scanner;

public class ForTest1 {

	public static void main(String[] args) {
		System.out.println("==== ForTest1 Start ====");
		
		//Hello world를 5번 출력하고 싶다면? 출력문을 3회 입력해야 한다.
		System.out.println("Hello world");
		System.out.println("Hello world");
		System.out.println("Hello world");
		
		//똑같은 코드를 3번이나 입력했다.
		//5회까지는 괜찮지만 10만번을 입력해야 한다면?
		//반복문
		for(int i=0; i<3; i++) {
			System.out.println("Hello new world");
		}
		
		//반복할 횟수를 직접 입력하는 코드를 작성
		//횟수를 조절하려면 조건식을 수정할것
		Scanner sc = new Scanner(System.in);
		System.out.println("반복할 횟수를 입력하시오.");
		int count = sc.nextInt();
		int num = 1;
		
		for(int i=0; i<count; i++) {
			System.out.println("HELLO! -" + num +"회 반복");
			num = num + 1; //num++;
		}
		
//		num이라는 변수를 새로 선언하는 것보다 이미 선언된 i를 활용하는 것이 더 좋다
//		for(int i=0; i<count; i=i+1) {
//			System.out.println("HELLO! -" + (i+1) +"회 반복");
		
		//for문의 int i는 지역변수 이므로 밖에서 새로 선언해도 된다.
		int i=100;
		System.out.println(i);
		
		System.out.println("============================");
		//0-20 미만 사이에 짝수만 출력하시오.
		for(int j=0; j<20; j=j+1) {
			if(j%2 == 0) {
				System.out.println(j);
			}
		}
		System.out.println("============================");
		for(int j=0; j<20; j=j+2) {
			System.out.println(j);
		}
		
		System.out.println("==== ForTest1 Finish ====");
	}

}

package chap3.s2;

import java.util.Scanner;

public class ForTest8 {
	public static void main(String[] args) {
		System.out.println("==== ForTest8 Start ====");
		
		/*
		 * 시계
		 * 0분 0초 -> 0분 1초 -> ... -> 0분 59초 -> 1분 00초
		 * 1분 00초 -> ... -> 1분 59초 -> 2분 00초 -> ... -> 59분 59초까지 출력하라.
		 */
		
//		for(int i=0; i<60; i++) {
//			for(int j=0; j<60; j++) {
//				System.out.println("현재 시간은 " + i + "분 " + j + "초 입니다.");
//			}
//		}
		
		/*
		 * 위 과정에 사용자가 입력한 시간이 되면 자동 종료가 되는 프로그램을 만드시오.
		 * min<60, sec<60 조건을 건들지 말고 풀이하시오.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("분 입력");
		int m = sc.nextInt();//1
		System.out.println("초 입력");
		int s = sc.nextInt();//5
		boolean flag = false;
		for(int min=0;min<60;min++) {
			for(int sec=0;sec<60;sec++) {
				System.out.println(min+"분 : "+sec+"초");
				if(m==min && s==sec) {
					System.out.println("종료");
					flag=true;
					
					min=60;
					break;
				}
			}//안쪽 for
			
			if(flag) {
				break;
			}
		}
		
		
		System.out.println("==== ForTest8 Finish ====");
	}
}

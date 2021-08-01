package chap3.s2;

import java.util.Scanner;

public class ForTest3 {

	public static void main(String[] args) {
		System.out.println("==== Fortest3 Start ====");
		
		// 종료 시간을 입력받기 : 12
		// 35
		// 0초, 1초, ..., 12 끝
		// 단 60 상수는 변경 불가능
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("종료 시간 입력");
		int cho = sc.nextInt();
		
		for(int sec=0; sec<60; sec++) {
			System.out.println(sec + "초");
			if(sec == cho) {
				sec = 59; //break;도 사용 가능하다.
			}
		}
		
		System.out.println("==== Fortest3 Finish ====");
	}

}

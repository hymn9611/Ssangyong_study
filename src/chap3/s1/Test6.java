package chap3.s1;

import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		System.out.println("==== Test6 Start ====");
		
		/*
		 * 예제 : 정수 하나가 존재하는데 짝수인지, 홀수인지 판단하시오
		 */
		int num = 4;
		
		if(num%2 != 0) {
			System.out.println("num : " + num + ", 홀수");
		} else {
			System.out.println("num : " + num + ", 짝수");
		}
		
		/*
		 * 예제 : kor, eng, math 입력 후 총점, 평균 계산
		 * 평균이 60점 이상이면 합격, 아니면 불합격을 출력
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 점수를 입력하시오.");
		int kor = sc.nextInt();
		System.out.println("영어 점수를 입력하시오.");
		int eng = sc.nextInt();
		System.out.println("수학 점수를 입력하시오.");
		int math = sc.nextInt();
		
		int total = kor + eng + math;
		double avg = total/3.0;
		
//		if문과 else를 이용한 풀이
//		if(avg >= 60) {
//			System.out.println("점수 : " + avg + "점 - 합격입니다.");
//		} else {
//			System.out.println("점수 : " + avg + "점 - 불합격입니다.");
//		}
		
		//단일 if (상수가 아닌 변수를 이용할 것)
		String result = "불합격";
		if(avg >= 60) {
			result = "합격";
		}
		System.out.println(result);
		
//		틀린코드 : 상수를 이용하려다 보니 프린트문이 두 개가 나온다.
//		if(avg <= 60) {
//			System.out.println("불합격");
//		}
//		System.out.println("합격");
		
//		틀린코드2
//		if(avg <= 100) {
//			System.out.println("합격");
//			if(avg <= 60) {
//				System.out.println("불합격");
//			}
//		}
		
		System.out.println("==== Test6 Finish ====");
	}
}

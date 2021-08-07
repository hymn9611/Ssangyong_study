package java.chap3.s1;

import java.util.Scanner;

public class Test8 {
	public static void main(String[] args) {
		System.out.println("==== Test8 Start ====");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수를 입력하시오.");
		int kor = sc.nextInt();
		System.out.println("영어 점수를 입력하시오.");
		int eng = sc.nextInt();
		System.out.println("수학 점수를 입력하시오.");
		int math = sc.nextInt();
		
		int total = kor + eng + math;
		double avg = total/3.0;
		
		// 합격 기준 : 평균 60점 이상, 과 40점 이상
		String result = "불합격";
		if(avg >= 60) {
			if((kor >= 40) && (eng >= 40) && (math >= 40)) {
				result = "합격";
			}
		}
		System.out.println(result);
		
//		----------------------------
//		반복적인 같은 코드 -> 좋지 않은 코드
//		if(avg >= 60) {
//			if(kor > 40) {
//				if(eng > 40) {
//					if(math > 40) {
//						System.out.println("합격");
//					}else {
//						System.out.println("수학 과락 불합격");
//					}
//				} else {
//					System.out.println("영어 과락 불합격");
//				}
//			}else {
//				System.out.println("국어 과락 불합격");
//			}
//		}
//		else {
//			System.out.println("불합격");
//		}
//		----------------------------
		
//		----------------------------
//		if(avg >= 60) {
//			if(kor>40 && eng>40 && math>40) {
//				System.out.println("합격");
//			} else {
//				System.out.println("불합격");
//			}
//		}else {
//			System.out.println("불합격");
//		}
//		----------------------------
		
//		----------------------------
//		if(avg>=60 && kor>40 && eng>40&& math>40) {
//			System.out.println("합격");
//		}else {
//			System.out.println("불합격");
//		}
//
//		System.out.println("==== Test8 Finish ====");
//		----------------------------

	}
}

package java.chap3.s2;

import java.util.Scanner;

public class ForTest5 {

	public static void main(String[] args) {
		System.out.println("==== ForTest5 Start ====");
		Scanner sc = new Scanner(System.in);
		
		//과목수를 입력하도록 하고, 과목수 만큼 점수를 입력하도록 한다.
		//그 후, 총점과 평균을 자동으로 계산하는 코드를 작성한다.
		
		//과목수 입력
		System.out.println("과목 수를 입력해주세요");
		int count = sc.nextInt();
		System.out.println("과목 수는" + count + "개 입니다.");
		
		//과목수 만큼 점수 입력
		int score = 0;
		int total = 0;
		for(int i=0; i<count; i++) {
			System.out.println(i+1 + "번째 점수를 입력해주세요");
//			score = sc.nextInt() + score;
			score = sc.nextInt();
			total = total + score;
		}
		
//		System.out.println("총점은 " + score + "입니다.");
		System.out.println("총점은 " + total + "입니다.");
		
		//총점 평균 계산 후 출력
		int avg = score/count;
		System.out.println("평균은 " + avg + "입니다.");
		
		System.out.println("==== ForTest5 Finish ====");
	}

}

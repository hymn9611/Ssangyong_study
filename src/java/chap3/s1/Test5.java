package java.chap3.s1;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		System.out.println("==== Test5 Start ====");
		
		//로그인화면 흉내 내보기 (아직 숫자만 배웠기 때문에 숫자로만 진행)
		Scanner sc = new Scanner(System.in);
		
		//회원가입시 입력한 ID
		int id = 1234;
		
		//회원가입시 입력한 PW
		int pw = 5678;
		
		System.out.println("ID를 입력하세요.");
		//ID 입력 후 저장
		int id2 = sc.nextInt();
		
		System.out.println("PW를 입력하세요");
		//PW 입력 후 저장
		int pw2 = sc.nextInt();
		
		/*
		 * 로그인이 성공하면 '로그인 성공' 출력
		 * 로그인이 실패하면 그대로 종
		 */
		if((id==id2) && (pw==pw2)) {
			System.out.println("로그인 성공");
		}
		
		
		System.out.println("==== Test5 Finish ====");
	}
}

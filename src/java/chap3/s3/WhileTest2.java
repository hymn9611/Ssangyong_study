package java.chap3.s3;

import java.util.Scanner;

public class WhileTest2 {
	public static void main(String[] args) {
		System.out.println("==== WhileTest2 Start ====");
		
		/*
		 * 앞에서 했던 예제를 이용하여 while문을 사용하여 로그인이 성공될 때까지 반복한다.
		 * 1:로그인(ID/PW입력), 2:종료
		 */
		
		//회원가입한 아이디 및 비밀번호
		boolean flag = true;
		int id = 1234;
		int pw = 5678;
		
		while(flag) {
			Scanner sc = new Scanner(System.in);
			System.out.println("1 : 로그인");
			System.out.println("2 : 종료");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				System.out.println("아이디를 입력하세요.");
				int id2 = sc.nextInt();
				System.out.println("비밀번호를 입력하세요.");
				int pw2 = sc.nextInt();
				
				if(id==id2 && pw==pw2) {
					System.out.println("로그인에 성공했습니다.");
					flag = !flag; //break; 가능
				} else {
					System.out.println("로그인에 실패하여 메뉴로 돌아갑니다.");
				}
			} else {
				System.out.println("프로그램을 종료합니다.");
				flag = !flag; //break; 가능
			}
		}
		
		System.out.println("==== WhileTest2 Finish ====");
	}
}

package chap3.s3;

import java.util.Scanner;

public class WhileTest1 {

	public static void main(String[] args) {
		System.out.println("==== WhileTest Start ====");
		
		// 0~4 출력 : for문 예시
		for(int i=0; i<5; i++) {
			System.out.println(i);
		}
		
		System.out.println("----------------");
		// 0~4 출력 : while문 예시 - 언젠가는 false가 되도록 유도를 해야한다.
		int i = 0;
		while(i<5) {
			System.out.println(i);
			i++;
		}
		// for문에 비해서 상당히 난잡해 보인다. 따라서 횟수가 정해져 있다면 for문을 사용하는 것이 이상적이다.
		System.out.println("----------------");

		
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		while(check) {
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 종료");
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				System.out.println("회원가입 코드 진행");
				break;
			case 2:
				System.out.println("로그인 코드 진행");
				break;
			default : 
				check = !check;
			//swtich문을 사용하면 아래 if문의 break;처럼 while문을 종료시키지 못한다.
			//왜냐하면 switch구문을 빠져나가는 break; 이기 때문이다. 즉 check를 false로 만드는 방법밖에 안남는다.
			//break;문을 너무 맹신하면 안된다.
			}
				
//			if(select == 1) {
//				System.out.println("회원가입 코드 진행");
//			}else if(select == 2) {
//				System.out.println("로그인 코드 진행");
//			}else {
//				check = !check;
//				//break;
//			}
		}
		
		System.out.println("==== WhileTest Finish ====");
	}

}

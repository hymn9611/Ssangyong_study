package java.chap3.s2;

import java.util.Scanner;

public class ForTest6 {

	public static void main(String[] args) {
		System.out.println("==== ForTest6 Start ====");
		
		//회원가입시 입력한 ID
		int id = 1234;
		//회원가입시 입력한 PW
		int pw = 5678;
		
		//로그인을 해보면 ID와 PW가 일치할 때 까지 무한반복이다.
		//은행같은 경우는 최대 5번의 기회를 주고 틀리면 lock이 걸린다.
		
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		boolean flag = false; //꼭 boolean타입이 아니어도 된다.
		for(i=0; i<5; i++) {
			System.out.println("ID를 입력하세요.");
			int id2 = sc.nextInt();
			System.out.println("PW를 입력하세요.");
			int pw2 = sc.nextInt();
			
			if(id==id2 && pw==pw2) {
				flag = !flag;
//				System.out.println("로그인 되었습니다.");
				break;
			}else {
				System.out.println("아이디와 비밀번호가 일치하지 않습니다.");
				System.out.println("기회가 " + (4-i) + "회 남아있습니다.");
			}
//			
//			if(i==4) {
//				System.out.println("LOCKED!!!!!!");
//			}
		}
		
		//for문의 종료 조건은 로그인이 성공했을 때(break), 5회 실패시 이다.
		//for문 밖에서 이를 출력하도록 하자
		//2. for종료 조건 로그인성공과 5번 모두 실패
		//flag가 true이면 로그인성공, false이면 로그인 실패
		if(flag == true) {
			System.out.println("로그인에 성공하셨습니다.");
		}else {
			System.out.println("로그인에 실패하셨습니다. 지점에 방문 부탁드립니다.");
		}
		//무조건 for문의 int i를 가지고 다루어야 하는 것이 아니라 변수를 만들어서 다룰 수 있어야한다.
		//(int i<5), else로도 가능하지 않을까?
		
		System.out.println("==== Fortest6 Finish ====");			
	}
		
		
}

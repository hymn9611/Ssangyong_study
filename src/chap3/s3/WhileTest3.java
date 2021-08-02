package chap3.s3;

import java.util.Scanner;

public class WhileTest3 {

	public static void main(String[] args) {
		/*
		 *  문제
		 *  로그인성공, 로그인실패 중 하나를 나타내고 로그인을 성공했으면 RPG게임을 시작한다.
		 *  최초레벨은 1LV, 최초골드는 0GOLD이다.
		 *  LV5, LV10, LV15를 달성할 때마다 각각 1,000골드, 2,000골드, 3,000골드를 지급받는다.
		 *  만렙은 LV15이며, 만렙을 달성할 시 게임은 종료되도록 한다.
		 *  레벨업을 하려면 사냥을 해야하며 모든 몬스터의 경험치가 동일하다.
		 *  Lv1 -> Lv2 : 3마리
		 *  Lv2 -> Lv3 : 6마리
		 *  Lv3 -> Lv4 : 9마리
		 *  ...
		 *  Lv14 -> Lv15 : 12마리
		 *  몬스터를 잡을 때마다 몬스터 n마리 사냥을 출력하고 레벨업을 할 때마다 레벨업을 출력한다.
		 *  최종레벨 및 골드를 출력한다.
		 *  ##로그인 성공 문장에 게임을 진행하는 코드는 금지##
		 */
		
		
		//로그인화면
		boolean login = true;
		int id = 1234;
		int pw = 5678;
		
		while(login) {
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
					break; //while 반복문 탈출!
				} else {
					System.out.println("로그인에 실패하여 메뉴로 돌아갑니다.");
				}
			}else {
				System.out.println("프로그램을 종료합니다.");
				login = !login;
			}
		}//while
		
		
		//로그인 판단 및 게임화면
		if(login) { //if(id==id2 && pw==pw2) {} 추후에 페이지가 여러개로 나뉘면 오류발생 위험요소
			System.out.println("로그인에 성공하여 게임에 진입합니다.");
			
			int level = 1;
			int gold = 0;
			int monster = 1;
			
			System.out.println("시작 레벨은 " + level + "입니다.");
			System.out.println("시작 보유 골드량은 " + gold + "입니다.");
			
			//레벨15가 달성되면 끝나는 반복문이니 for을 사용하자
			for(level=1; level<15; level++) { //15만렙, 14레벨 때 사냥하고 레벨업 후 종료예정
				//골드지급
				if(level%5 == 0) {
					//level * 200; (15일 때 지급을 못하는 코드)
					gold = gold + level/5*1000;
					System.out.println(gold + level/5*1000 + "gold 지급");
				}
				System.out.println("현재레벨 : " + level);
				
				//사냥
				for(monster=1; monster<=level*3; monster++) {
					System.out.println(monster + "마리 사냥 성공");
				}
				System.out.println("==== 축 레벨업 ====");
			}
			System.out.println("최종 레벨 : " + level+ "달성");
			gold = gold + level/5*1000;
			System.out.println("최종 골드 : " + gold);
		}
	}
}
		
//		
//		boolean flag = true;
//		while(flag) {
//			for(int i=1; i<=14; i++) {
//				for(monster=1; monster<=i*3; monster++) {
//					System.out.println("몬스터 " + monster + "마리째 사냥하셨습니다.");
//				}
//				level = level+1;
//				System.out.println("레벨업! 현재 레벨은 " + level + "입니다.");
//				if(level==5 || level==10 || level==15) {
//					gold = gold + (level*200);
//					System.out.println("Lv" + level + "을 달성하여" + (level*200) + "골드를 획득하셨습니다.");
//				}
//				
//			}
//			System.out.println("최종 레벨은 " + level + ", 최종 골드는 " + gold + "입니다.");
//				flag = !flag;
//		}
//	}
//			
//}

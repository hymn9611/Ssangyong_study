package java.chap3.s4;

import java.util.Scanner;

public class Array_8 {

	public static void main(String[] args) {
		int[] ids = {1234, 4567, 4356, 1258};
		int[] pws = {6789, 5437, 1235, 9874};
		
		//1. 로그인
		//2. 회원가입
		//3. 종료
		
		boolean login = true;
		while(login) {
			Scanner sc = new Scanner(System.in);
			System.out.println("메뉴를 선택하세요.");
			System.out.println("1 : 로그인");
			System.out.println("2 : 회원가입");
			System.out.println("3 : 종료");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				System.out.println("로그인 화면으로 이동합니다.");
				System.out.println("ID를 입력하세요.");
				int id = sc.nextInt();
				System.out.println("PW를 입력하세요.");
				int pw = sc.nextInt();
				
				for(int i=0; i<ids.length; i++) {
					if(ids[i]==id && pws[i]==pw) {
						login = !login;
						break;
					}
				}
				if(login==false) {
					System.out.println("로그인에 성공하셨습니다.");
				}else {
					System.out.println("로그인에 실패하셨습니다.");
				}
				
			}else if(menu == 2) {
				System.out.println("회원가입 화면으로 이동합니다.");
				System.out.println("가입할 아이디를 입력해주세요");
				
				int insertId = sc.nextInt();
				int insertPw = 0;
				for(int i=0; i<ids.length; i++) {
					if(insertId == ids[i]) {
						System.out.println("이미 존재하는 아이디입니다.");
						break;
					}else {
						System.out.println("비밀번호를 입력하세요.");
						break;
					}
				}
				insertPw = sc.nextInt();
				
				//가입한 아이디 및 비밀번호 추가시키는 과정
				int[] ids2 = new int[ids.length+1];
				int[] pws2 = new int[pws.length+1];
				for(int j=0; j<ids.length; j++) {
					ids2[j] = ids[j];
					pws2[j] = pws[j];
				}
				ids2[ids2.length-1] = insertId;
				pws2[pws2.length-1] = insertPw;
				
				ids = ids2;
				pws = pws2;
				
			}else {
				System.out.println("종료합니다.");
				break;
			}
		}
	}
	//위 코드의 문제점 : 회원가입 내용이 데이터에 쌓이지 않고 초기화되고 있다.
	//그리고 49번째 줄 for문에 break;를 난사했는데 좋은 방법이 없을까?

}

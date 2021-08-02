package chap3.s4;

import java.util.Scanner;

public class Array_5 {

	public static void main(String[] args) {
		
		//메뉴화면 : 아래 1~4구문을 출력하고 Scanner으로 입력받기 (종료할 때까지 아래메뉴 무한반복)
		//1. 정보출력
		//2. 정보추가
		//3. 정보삭제
		//4. 종료
		
		boolean login = true;
		int[] ar = {45, 52, 76};
		while(login) {
			Scanner sc = new Scanner(System.in);
			System.out.println("메뉴번호를 입력해주세요.");
			System.out.println("1 : 정보출력"); //ar배열 정보출력
			System.out.println("2 : 정보추가"); //한 개의 정보추가
			System.out.println("3 : 정보삭제"); //맨 마지막칸 삭제, 지울 데이터 없을 시 안내출력
			System.out.println("4 : 검색삭제");
			System.out.println("4 : 종료");
			System.out.println("===========");
			
			int menu = sc.nextInt();
			
//			if(menu == 1) {
//				System.out.println("정보가 출력되었습니다.");
//			} else if(menu == 2) {
//				System.out.println("다음 정보가 추가되었습니다.");
//			} else if(menu == 3) {
//				System.out.println("다음 정보가 삭제되었습니다.");
//			} else {
//				System.out.println("종료합니다.");
//				break;
//			}
			
			switch(menu) {
			case 1:
				if(ar.length>0) {
					for(int i=0; i<ar.length; i++) {
						System.out.println(ar[i]);
					}
				} else {
					System.out.println("Data가 없습니다.");
				}
				break;
			case 2:
				System.out.println("추가할 숫자를 입력해주세요.");
				int data = sc.nextInt();
				
				int[] ar2 = new int[ar.length+1];
				for(int i=0; i<ar.length; i++) { //작은배열
					ar2[i] = ar[i];
				}
				ar2[ar.length]=data;
				System.out.println(data + " 정보가 추가되었습니다.");
				ar=ar2;
				break;
			case 3:
				System.out.println(ar[ar.length-1] + " 정보가 삭제되었습니다.");
				int[] ar3 = new int[ar.length-1];
				for(int i=0; i<ar3.length; i++) {
					ar3[i]=ar[i];
				}
				ar = ar3;
				if(ar.length == 0) {
					System.out.println("더 이상 삭제할 데이터가 없습니다.");
					continue;
				}
				System.out.println(ar.length);
				break;
			case 4:
				if(ar.length==0) {
					System.out.println("삭제할 data가 없습니다.");
					continue;
				}
				
				System.out.println("삭제할 인덱스를 선택하세요");
				int idx = sc.nextInt();
				
				if(idx >= ar.length || idx < 0) {
					System.out.println("범위를 벗어남");
					continue;
				}
				int[] ar4 = new int[ar.length-1];
				int index = 0;
				for(int i=0; i<ar4.length; i++) {
					if(idx==i) {
						continue;
					}
					ar4[index]=ar[i];
					index++;
				}
				ar = ar4;
				break;
			default :
				System.out.println("프로그램을 종료합니다.");
				login = !login;
			}
			
		}
		
	}
	
}

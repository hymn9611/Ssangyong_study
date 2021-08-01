package chap3.s2;

import java.util.Scanner;

public class ForTest9 {

	public static void main(String[] args) {
		System.out.println("==== ForTest9 Start ====");
		
		/*
		 * FPS게임을 하는데 탄창이 3개가 있다. 한 탄창에는 30개의 탄이 들어있다.
		 * 시작하자마자 탄을 다 쓰려고 한다.
		 * 1번은 단발, 2번은 점사이며 1번은 '탕'소리가 30회, 2번은 '타타탕'소리가 10회 나도록 한다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		for(int tan=0; tan<3; tan++) {
			System.out.println("1. 단발 2. 점사");
			int select = sc.nextInt();
			String sound = "탕";
//			int count = 30;
			
			int num = 1;
			if(select != 1) {
				sound = "타타탕";
//				count = 10;
				num = 3;
			}
			
			for(int i=0; i<30; i=i+num) {
				System.out.println(sound);
			}
		}
		System.out.println("==== ForTest9 Finish ====");
	}
		
}


//
//if(select == 1) {
//	for(int i=0; i<30; i++) {
//		System.out.println("탕");
//	}
//}else {
//	for(int i=0; i<10; i++) {
//		System.out.println("타타탕");
//	}

//for(int t=3;t>0;t--) {
//System.out.println("1.단발 2.점사");
//int shot = sc.nextInt();
//for(int b=30;b>0;b--) {
//	if(shot==1) {
//		System.out.println("탕");
//	}else if(shot != 1){
//		System.out.println("타타탕");
//		b=b-2;
//	}
//}
//}


//for(int tan=0;tan<3;tan++) {
//System.out.println("1. 단발 : 2. 점사");
//int select = sc.nextInt();
//
//for(int i=0;i<30;i++) {
//	if(select==1) {
//		System.out.println("탕!");
//	} else {
//		i=i+2;
//		System.out.println("타타탕!");
//	}
//}
//}
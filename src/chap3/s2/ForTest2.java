package chap3.s2;

public class ForTest2 {

	public static void main(String[] args) {
		System.out.println("==== ForTest2 Start ====");
		
		System.out.println("증감연산자");
		int num = 0;
		
		//무엇이 다를까? : 단독으로 증감 연산자를 사용할 때는 똑같다.
		++num;
		System.out.println(num); //1
		
		num++;
		System.out.println(num); //2
		
		//다른 것들과 같이 사용할 때는 달라지는 결과 - 대입
		int check1 = ++num;
		System.out.println("Num : " + num); //3
		System.out.println("check1 : " + check1); //3
		
		check1 = num++; //check1 = num; 수행후, ++연산 수행
		System.out.println("Num : " + num); //4
		System.out.println("check1 : " + check1); //3
		
		System.out.println(++num); //5
		System.out.println(num++); //print구문을 실행한 후에 num증가 //5
		System.out.println(num); //6
		System.out.println("==== ForTest2 Finish ====");
	}

}

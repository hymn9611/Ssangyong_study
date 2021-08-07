package java.chap3.s4;

import java.util.Scanner;

public class Array_1 {

	public static void main(String[] args) {
		/*
		 * int num1 = 11;
		 * int num2 = 20;
		 * num2 = 30; -> 기존 num2의 20값은 초기화된다.
		 * 배열을 이용하여 한 개의 변수에 여러 데이터를 담아보려고 한다.
		 */
		
		// 모으려고하는 데이터타입[] 변수명 = new 모으려고하는 데이터타입[갯수]
		int[] numbers = new int[3];
		// 이 때부터 힙(Heap)영역이 필요하다.
		// numbers의 데이터타입은 무엇인가? -> 변수명 앞을 보면 된다 -> int []
		// 데이터타입이 int가 아니기 때문에 numbers=30을 입력하면 에러가 발생한다.
		
		System.out.println(numbers); //I@58d25a40 : 16진수로 표현된 int 배열을 가리키는 주소가 저장되어 있다.
		
		//numbers변수에 한 개의 값이 아니라 여러 개의 값을 저장했다.
		numbers[0]=10;
		numbers[1]=20;
		numbers[2]=30;
		System.out.println(numbers[0]);
		System.out.println(numbers[2]);
		
		System.out.println("배열의 크기 : " + numbers.length);
		
		//3.12, 2.3, 4.123, 5.0 배열을 선언하고 데이터 대입
		//배열은 같은 데이터타입을 모을 수 있기 때문에 위의 숫자가 어떤 타입인지 먼저 생각해야 한다. : float / double
		double[] numbers2 = new double[4];
		numbers2[0]=3.12;
		numbers2[1]=2.3;
		numbers2[2]=4.123;
		numbers2[3]=5.0;
		System.out.println(numbers[0]);
		//System.out.println(numbers[4]); -> 에러발생 (없는 것을 가져오라고 명령했기 때문)
		
		//문자열을 담을 배열 3칸짜리를 생성하고, 내용을 담지 않고 모두 출력하시오.
		String[] str = new String[3];
		for(int i=0; i<=2; i++) {
			System.out.println(str[i]);
		}
		
		//Scanner를 담을 배열 2칸짜리를 생성하고, 내용을 담지 않고 모두 출력하시오.
		Scanner[] sc = new Scanner[2];
		System.out.println(sc[0]);
		System.out.println(sc[1]);
	}

}

package chap3.s4;

public class Array_4 {

	public static void main(String[] args) {
		int[] ar1 = new int[3];
		ar1[0] = 1;
		ar1[1] = 5;
		ar1[2] = 90;
		
		//반복문을 이용하여 위 배열을 모두 출력
		for(int i=0; i<ar1.length; i++) {
			System.out.println(ar1[i]);
		}
			
		//[4] 추가 배열 복사 응용
		//한 번 만들어진 배열은 칸을 줄이거나 늘릴 수 없다.
		//하지만 칸을 줄이거나 늘린 것처럼 보이도록 만들 수는 있다. (새로운 배열을 만들어서 덮어 씌우는 것)
		//Hint : 깊은복사(배열복사)를 하면된다.
		int[] ar2 = new int[ar1.length+1];
		
		for(int i=0; i<ar1.length; i++) {
			ar2[i] = ar1[i];
		}
		ar2[ar1.length] = 9999; 
		ar1 = ar2;
		
		for(int i=0; i<ar1.length; i++) {
			System.out.println(ar1[i]);
		}
	}

}

package chap3.s4;

public class Array_3 {

	public static void main(String[] args) {
		
		//Stack그림을 그리면서 어떤 값이 나올지 예상해보기.
		//코드 먼저 실행X!! 그림을 그려가며 원리를 이해하는 시간
		int[] ar1 = new int[2];
		ar1[0]=10;
		ar1[1]=20;
		
		//얕은복사 : 주소복사
		int[] ar2; //왼쪽과 같이 ar2를 선언했다면 무슨 값으로 초기화가 가능할까?
		ar2 = ar1;//int[] 타입을 담아낼 수 있다. 이 코드 내에서는 상단에 ar1이 있다.
		System.out.println(ar2[0]); //출력하면 어떤 값이 나올까? : ar1과 똑같은 주소를 가리키기 때문에 10이 나온다.
		
		ar1[1]=1111;
		System.out.println(ar2[1]); //마찬가지로 ar1과 똑같은 주소를 가리키고 있기 때문에 ar1[1]값이 변해도 ar2[1]값 또한 변한다.
		
		//깊은복사 : 값 자체를 복사
		int[] ar3 = new int[ar1.length]; //ar1의 길이로 Heap영역에 새로운 배열을 생성
		System.out.println(ar3[0]); //위 2가지 경우와는 다르게 새로운 배열이기 때문에 기본값인 0으로 초기화되어 있다.
		
		for(int i=0; i<ar1.length; i++) {
			ar3[i] = ar1[i];
		}
		System.out.println(ar3[0]);
		
		ar1[0]=2222;
		System.out.println(ar3[0]); //10값만을 복사했었기 때문에 ar1[0]을 따라서 변하지 않고 10을 유지한다.
	}

}

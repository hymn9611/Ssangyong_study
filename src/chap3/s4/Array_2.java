package chap3.s4;

import java.util.Scanner;

public class Array_2 {

	public static void main(String[] args) {
		int[] nums = new int[5];
		nums[0] = 11;
		nums[1] = 47;
		nums[2] = 80;
		
		//인덱스 번호는 0부터 시작하고, 1씩 증가한다.
		//nums[0]부터 nums[30000]을 출력하려고 한다. 사람이 print문으로 30000번 치기에는 무리다.
		//반복문을 이용해서 편하게 출력해보자.
		for(int i=0; i<5; i++) {
			System.out.println(nums[i]);
		}
		//배열과 가장 잘 어울리는 것은 for구문이다.
		
		//위의 문장을 .length를 통해 편하고 좋은 코드를 생성할 수 있다.
		//배열길이를 잘못지정하는 실수를 범하지 않는다.
		//배열길이를 변경하여도 알아서 확인이 가능하다.
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		System.out.println("======================================");
		//배열의 크기를 입력받아 그 수만큼 배열을 생성하는 코드 작성하기.
		System.out.println("과목의 수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt(); //count = 과목의 수
		int[] nums2 = new int[count]; //nums2 : 과목의 수 만큼 배열생성
		
		//각 인덱스번호에 점수 입력
		for(int i=0; i<nums2.length; i++) {
			System.out.println(i+1 + "번 점수 입력");
			nums2[i] = sc.nextInt();
		}
		//각 인덱스번호 숫자 출력, 총점 및 평균 출력
		int total = 0;
		for(int i=0; i<nums2.length; i++) {
			System.out.println(nums2[i]);			
			total = total + nums2[i];
		}		
		double avg = total/(double)nums2.length;			
		System.out.println("총점은 " + total);
		System.out.println("평균은 " + avg);
	}
}

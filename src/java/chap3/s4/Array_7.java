package java.chap3.s4;

public class Array_7 {

	public static void main(String[] args) {
		//한 학생의 정보는 이름, 번호, 국어, 영어, 수학, 총점, 평균으로 이루어져있다.
		//학생수를 3명이라고 해본다면?
		String[] names = new String[3];
		names[0] = "iu";
		names[1] = "choa";
		names[2] = "suji";
		
		int[] nums = new int[3];
		nums[0] = 5;
		nums[1] = 29;
		nums[2] = 2;
		
		//이름하고 번호들을 출력하는데 번호(num) 순서대로 출력하시오.
		for(int i=0; i<nums.length-1; i++) {
			for(int j=i+1; j<nums.length; j++) {
				if(nums[i]>nums[j]) {
					int tmp = nums[j];
					nums[j] = nums[i];
					nums[i] = tmp;
					
					//이름 자리 바꾸기
					String t = names[j];
					names[j] = names[i];
					names[i] = t;
				}
			}
		}
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
			System.out.println(names[i]);
			System.out.println("=======");
		}
		
		String name = "iu";
		int num = 1;
		int kor = 20;
		int eng = 30;
		int math = 30;
		int total = 80;
		double avg = 26.66;
	}

}

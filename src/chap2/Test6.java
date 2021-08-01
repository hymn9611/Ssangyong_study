package chap2;

public class Test6 {

	public static void main(String[] args) {
		System.out.println("===Test6 Start===");
		
		//1
		int num=5;
		double num2 = 3.12;
		num=num+(int)num2;
		// num=(int)(num+num2);
		System.out.println("Num : " + num);
		
		//2 : 국영 - 0~100
		int kor = 63;
		int eng = 35;
		int math = 53;
		//총점을 계산해서 출력하라
		int total = kor + eng + math;
		System.out.println("Total : " + total);
		//평균을 출력하라
		double avg = (double)total/3;
		System.out.println("Average : " + avg);
		/*
		 * double avg = total/3;이 50.0이 나오는 이유?
		 * total/3 = 50이 나오고 나머지 소숫점 자리가 데이터를 유지하면서 0으로 채워져서..
		 */
		
		double num3 = 5.124;
		int result = (int)num3;
		System.out.println(result);
		
	}

}

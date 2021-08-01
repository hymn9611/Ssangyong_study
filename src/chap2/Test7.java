package chap2;

public class Test7 {

	public static void main(String[] args) {
		System.out.println("====Test7 Start====");
		int kor = 56;
		int eng = 65;
		int math = 49;
		int total = kor + eng + math;
		double avg = total / 3.0;
		avg = (int)(avg * 100)/100.0;
		
		System.out.println("Total : " + total);
		System.out.println("Avg : " + avg);
		
		kor = 100; //여기서 kor점수가 바뀐다고 해서 total점수가 바뀌진 않는다.
		System.out.println("Total : " + total);
	}

}

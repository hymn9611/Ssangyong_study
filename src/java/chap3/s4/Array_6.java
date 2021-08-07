package java.chap3.s4;

public class Array_6 {

	public static void main(String[] args) {
		int[] ar = {3, 5, 1, 7, 4};
		
		//정렬형식
		//1.높은것에서부터 낮은 순으로 : 내림차순 desc
		//2.낮은것에서부터 높은 순으로 : 오름차순 asc
		for(int idx = 0; idx<ar.length-1; idx++) {
			for(int i=idx+1; i<ar.length; i++) {
				if(ar[idx]<ar[i]) {
					int tmp = ar[i];
					ar[i] = ar[idx];
					ar[idx] = tmp;
				}
			}
		}
		for(int i=0; i<ar.length; i++) {
			System.out.println(ar[i]);
		}
		
		//인터넷에서 삼각형 별찍기 검색해서 2중 for문 감익히기
		
		
	}

}

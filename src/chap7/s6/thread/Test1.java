package chap7.s6.thread;

public class Test1 extends Thread {
	
	//a부터 z까지 출력하는 run()메서드 생성
	@Override
	public void run() {
		//동시에 진행 할 코드를 작성한다.
		for(int i='a'; i<='z'; i++) {
			System.out.println((char)i);
		}
	}
}

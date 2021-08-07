package java.chap7.s6.thread;

public class Test2 extends Thread {
	
	//0부터 25까지 출력하는 run()메서드 생성
	@Override
	public void run() {
		for(int i=0; i<21; i++) {
			System.out.println(i);
		}
	}
}

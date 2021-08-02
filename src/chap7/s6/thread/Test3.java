package chap7.s6.thread;

// Runnable은 start()메서드가 없다.
// 우리가 직접 run()을 실행할 수는 없고 윈도우에게 맡겨야 한다.
public class Test3 implements Runnable {
	
	//대문자 알파벳을 찍는 메서드 생성
	@Override
	public void run() {
		for(int i='A'; i<='Z'; i++) {
			System.out.println((char)i);
		}
	}
}

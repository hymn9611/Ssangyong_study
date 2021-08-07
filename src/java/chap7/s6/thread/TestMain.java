package java.chap7.s6.thread;

public class TestMain {

	public static void main(String[] args) {
		Test1 t1 = new Test1();
		Test2 t2 = new Test2();
		Test3 t3 = new Test3();
		//new Thread(Runnable target);
		Thread thread = new Thread(t3);
		
		//stack구조상 순서대로 출력된다
		t1.run();
		t2.run();
		System.out.println("=====================");
		
		//섞여서 나온다.
		t1.start(); //a~z
		t2.start(); //0~20
		thread.start();
	}

}

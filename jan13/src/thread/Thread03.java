package thread;

import java.util.ArrayList;
import java.util.List;

public class Thread03 extends Thread {
	int seq;
	
	public Thread03(int seq) {
		this.seq =seq;
	}
	
	@Override
	public void run() {
		System.out.println(seq + "번째 스레드 시작");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(seq + "번째 스레드 끝");

	}
	public static void main(String[] args) {
		System.out.println("main 시작");
		
		List<Thread> th = new ArrayList<Thread>();
		for (int i = 0; i < 10; i++) {
			Thread03 t03 = new Thread03(i);
			t03.start();
			th.add(t03);
		}
		
		for (int i = 0; i <th.size(); i++) {
			Thread t = th.get(i);
			try {
				t.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	
		System.out.println("main 끝");
		
	}

}





package thread;

public class Thread02 extends Thread {
	int seq; //변수
	
	public Thread02(int seq) { //생성자
		this.seq =seq;
	}
	
	
		
	
		
	@Override
	public void run() {
		System.out.println(this.seq + "스레드 시작");
	   //super.run();
		try {
			Thread.sleep(1000); //1초 
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		System.out.println(seq + "스레드 끝");
	}
	
	public static void main(String[] args) {
		System.out.println("main 시작");
		for (int i = 0; i < 10; i++) {
			Thread02 t02 = new Thread02(i);
			t02.run(); 
		}
		System.out.println("main 끝");
		
		
	}

}





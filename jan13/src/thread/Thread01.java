package thread;
/* Thread 쓰래드 스래드
 * 다중작업 : 두 가지 일을 동시에 수행하는 것
 * 자바는 Thread클래스나, Runnable 인터페이스를 상속해 사용합니다
 * run()이것으로 start()를 실행합니다.
 * 이미 만들어져있으니 불러다가 쓰기만 하면 됩니다.
 * 
 * 책 576페이지
 * 운영체제에서는 실행중인 하나의 어플리케이션을 프로세스라고 합니다.
 * 사용자가 어플리케이션을 실행하면 운영체제로부터 실행에 필요한 메모리를 할당받아 
 * 어플리케이션의 코드를 실행하는데 이것이 프로세스입니다. 하나의 어플리케이션은 다중 프로세스를
 * 만들기도합니다. 예를 들어 Chrome 브라우저를 두개 실행했다면 두개의 Chrome 프로세스가 실행된 것입니다.
 * 
 *   멀티태스킹 = 다중작업
 *   두 가지 이상의 작업을 동시에 처리하는 것.
 *   인터넷을 하면서 노래를 듣고 카톡을 하는 것 = 멀티 태스킹
 *   
 *   만약 다중작업이 안 된다면
 *   하나의 프로세스만 가동하기 때문에 다른 작업을 할 수 없음
 *   
 *   왜 쓰레드라는 것을 만들었을까?
 *   하나의 작업을 동시에 수행하려고 할 때 여러 개의 프로세스를 띄워서 실행하려면 각각 메모리를 할당해주어야 한다.
 *   그에 반해 쓰래드를 하나 추가하면 더 적은 메모리를 점유한다. 어떤 작업을 할 때 단일 쓰레드로 실행하는 것 보다는
 *   다중 쓰레드로 실행하는 것이 시간이 더 적게 걸린다.
 *   
 *   쓰레드를 생성하는 방법
 *   1. Thread클래스를 상속받아서 사용 = 확장
 *   2. Runnable인터페이스를 사용하는 것 = 구현
 * 
 * 
 */
public class Thread01 extends Thread {

	@Override
		public void run() {
		   System.out.println("쓰레드 시작");
		}
	
	
	
	public static void main(String[] args) {
		Thread01 th = new Thread01();
		th.start();
		
	}

}

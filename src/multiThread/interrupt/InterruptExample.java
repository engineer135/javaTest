package multiThread.interrupt;

/**
 * @author Engineer135
 *
 * 1초 후 출력 스레드를 중지시키는 테스트
 */
public class InterruptExample {

	public static void main(String[] args) {
		Thread thread = new PrintThread();
		thread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		thread.interrupt(); //종료시키자!!
	}

}

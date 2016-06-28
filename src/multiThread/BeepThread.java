package multiThread;

import java.awt.Toolkit;

/**
 * @author Engineer135
 *
 * Runnable 구현이 아닌 Thread 상속으로 스레드 정의
 */
public class BeepThread extends Thread {

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i=0; i<5; i++){
			toolkit.beep(); // 비프음 발생
			
			try {
				Thread.sleep(500); // 0.5초간 일시 정지
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}

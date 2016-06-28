package multiThread;

import java.awt.Toolkit;

/**
 * @author Engineer135
 *
 * 비프음 발생시키는 작업 스레드 생성
 */
public class BeepTask implements Runnable {

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

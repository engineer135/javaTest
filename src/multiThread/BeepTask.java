package multiThread;

import java.awt.Toolkit;

/**
 * @author Engineer135
 *
 * ������ �߻���Ű�� �۾� ������ ����
 */
public class BeepTask implements Runnable {

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i=0; i<5; i++){
			toolkit.beep(); // ������ �߻�
			
			try {
				Thread.sleep(500); // 0.5�ʰ� �Ͻ� ����
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
package multiThread.sleep;

import java.awt.Toolkit;

public class SleepExample {
	public static void main(String[] args){
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i=0; i<5; i++){
			toolkit.beep(); // ������ �߻�
			
			try {
				Thread.sleep(2000); // 2�ʰ� �Ͻ� ����
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

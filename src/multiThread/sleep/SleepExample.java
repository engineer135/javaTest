package multiThread.sleep;

import java.awt.Toolkit;

public class SleepExample {
	public static void main(String[] args){
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i=0; i<5; i++){
			toolkit.beep(); // 비프음 발생
			
			try {
				Thread.sleep(2000); // 2초간 일시 정지
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

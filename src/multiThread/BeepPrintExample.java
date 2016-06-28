package multiThread;

import java.awt.Toolkit;

public class BeepPrintExample {

	public static void main(String[] args) {
		/*Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i=0; i<5; i++){
			toolkit.beep(); // ������ �߻�
			
			try {
				Thread.sleep(500); // 0.5�ʰ� �Ͻ� ����
			} catch (Exception e) {
				e.printStackTrace();
			}
		}*/
		
		// 1�ܰ�. Runnable �������̽��� ������ Ŭ������ ���� ���� �� ȣ��.
		/*Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask); // ���ο� ������ ����
		thread.start();*/
		
		// 2�ܰ�. ������ �͸� ��ü�� �̿��Ѵٰ� �Ѵ�.
		/*Thread thread = new Thread(new Runnable(){
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
		}); // ���ο� ������ ����
		thread.start();*/
		
		// 3�ܰ�. ���ٽ� �����غ���.
		/*Thread thread = new Thread( () -> {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			
			for(int i=0; i<5; i++){
				toolkit.beep(); // ������ �߻�
				
				try {
					Thread.sleep(500); // 0.5�ʰ� �Ͻ� ����
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		thread.start();*/
		
		// Runnable ������ �ƴ� Thread ������� �����ϴ� ��(�̰� �� �� ���� ������...?)
		/*Thread thread = new BeepThread();
		thread.start();*/
		
		// ���������� �͸� ��ü�� �� ���� ����
		Thread thread = new Thread(){
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
		};
		thread.start();
		
		// ����Ʈ�� ���� �����忡�� ����.
		for(int i=0; i<5; i++){
			System.out.println("��");
			
			try {
				Thread.sleep(500); // 0.5�ʰ� �Ͻ� ����
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}

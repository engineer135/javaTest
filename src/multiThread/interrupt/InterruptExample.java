package multiThread.interrupt;

/**
 * @author Engineer135
 *
 * 1�� �� ��� �����带 ������Ű�� �׽�Ʈ
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
		
		thread.interrupt(); //�����Ű��!!
	}

}

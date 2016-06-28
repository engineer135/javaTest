package multiThread.sleep;

public class YeildExample {

	public static void main(String[] args) {
		
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		
		threadA.start();
		threadB.start();
		
		try {
			Thread.sleep(2000); // 2�ʰ� �Ͻ� ����
		} catch (Exception e) {
			e.printStackTrace();
		}
		threadA.work = false; // threadB�� ����
		
		try {
			Thread.sleep(2000); // 2�ʰ� �Ͻ� ����
		} catch (Exception e) {
			e.printStackTrace();
		}
		threadA.work = true; // threadA, B ��� ����
		
		try {
			Thread.sleep(2000); // 2�ʰ� �Ͻ� ����
		} catch (Exception e) {
			e.printStackTrace();
		}
		threadA.stop = true;
		threadB.stop = true; 
	}

}

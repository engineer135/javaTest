package multiThread.daemon;

/**
 * @author Engineer135
 *
 * 데몬 스레드는 주 스레드가 종료되면 강제 종료됨
 */
public class DaemonExample {

	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setDaemon(true); // 데몬스레드로 만듬!
		autoSaveThread.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("메인 스레드 종료...!");
	}

}

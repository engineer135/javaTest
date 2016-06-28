package multiThread.sleep;

public class YeildExample {

	public static void main(String[] args) {
		
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		
		threadA.start();
		threadB.start();
		
		try {
			Thread.sleep(2000); // 2초간 일시 정지
		} catch (Exception e) {
			e.printStackTrace();
		}
		threadA.work = false; // threadB만 실행
		
		try {
			Thread.sleep(2000); // 2초간 일시 정지
		} catch (Exception e) {
			e.printStackTrace();
		}
		threadA.work = true; // threadA, B 모두 실행
		
		try {
			Thread.sleep(2000); // 2초간 일시 정지
		} catch (Exception e) {
			e.printStackTrace();
		}
		threadA.stop = true;
		threadB.stop = true; 
	}

}

package multiThread.sync;

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	// 동기화 메소드로 수정하거나...
	/*public synchronized void setMemory(int memory) {
		this.memory = memory;
		
		try {
			Thread.sleep(2000); // 2초간 일시 정지
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
	}*/
	
	public void setMemory(int memory) {
		synchronized(this){
			this.memory = memory;
			
			try {
				Thread.sleep(2000); // 2초간 일시 정지
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + ": " + this.memory);
		}
	}
}

package multiThread.sync;

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	// ����ȭ �޼ҵ�� �����ϰų�...
	/*public synchronized void setMemory(int memory) {
		this.memory = memory;
		
		try {
			Thread.sleep(2000); // 2�ʰ� �Ͻ� ����
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
	}*/
	
	public void setMemory(int memory) {
		synchronized(this){
			this.memory = memory;
			
			try {
				Thread.sleep(2000); // 2�ʰ� �Ͻ� ����
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + ": " + this.memory);
		}
	}
}

package multiThread.sleep;

public class ThreadB extends Thread {
	public boolean stop = false; //���� �÷���
	public boolean work = true; //�۾� ���� ���� �÷���
	
	public void run(){
		while(!stop){
			if(work){
				System.out.println("threadB �۾���");
			}else{
				Thread.yield(); // work�� false�� �Ǹ� �ٸ� �����忡�� ������ �纸�Ѵ�.
			}
		}
		System.out.println("threadB ����!");
	}
}

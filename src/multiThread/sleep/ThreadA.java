package multiThread.sleep;

public class ThreadA extends Thread{
	public boolean stop = false; //���� �÷���
	public boolean work = true; //�۾� ���� ���� �÷���

	public void run(){
		while(!stop){
			if(work){
				System.out.println("threadA �۾���");
			}else{
				Thread.yield(); // work�� false�� �Ǹ� �ٸ� �����忡�� ������ �纸�Ѵ�.
			}
		}
		System.out.println("threadA ����!");
	}
}

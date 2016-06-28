package multiThread.interrupt;

public class PrintThread extends Thread {
	public void run(){
		try {
			while(true){
				System.out.println("������..");
				//Thread.sleep(1); //�����尡 �Ͻ����� ���°� �Ǿ�߸� interrupt �޼ҵ尡 ��������� InterruptedException�� �߻��Ѵ�.
				
				// interrupt() ȣ�� ���θ� �� �� �ִ� ����� �ִ�
				if(Thread.interrupted()){
					break;
				}
			}	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
}

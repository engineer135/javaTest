package multiThread.daemon;

public class AutoSaveThread extends Thread {
	public void save(){
		System.out.println("�۾� ���� ����~");
	}
	
	public void run(){
		while(true){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				break;
			}
			this.save();//1�ʿ� �ѹ��� �����ϴ� ������... ������� �̷��� ���� �ű���...
		}
	}
}

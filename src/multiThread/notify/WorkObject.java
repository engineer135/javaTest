package multiThread.notify;

/**
 * @author Engineer135
 *
 * �� �������� �۾� ������ ����ȭ �޼ҵ�� �ۼ��� ���� ��ü
 */
public class WorkObject {
	public synchronized void methodA(){
		System.out.println("ThreadA�� methodA() ����");
		notify(); // �Ͻ� ���� ���¿� �ִ� ThreadB�� ���� ��� ���·� ����
		try {
			wait(); // ThreadA�� �Ͻ� ���� ���·� ����
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
	}
	
	public synchronized void methodB(){
		System.out.println("ThreadB�� methodB() ����");
		notify(); // �Ͻ� ���� ���¿� �ִ� ThreadA�� ���� ��� ���·� ����
		try {
			wait(); // ThreadB�� �Ͻ� ���� ���·� ����
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
	}
}

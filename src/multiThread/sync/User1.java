package multiThread.sync;

public class User1 extends Thread {
	private Calculator calculator;

	public void setCalculator(Calculator calculator) {
		this.setName("Calculator1"); //������ �̸� ����
		this.calculator = calculator;
	}
	
	public void run(){
		calculator.setMemory(100); //���� ��ü�� �޸𸮿� 100 ����
	}
}

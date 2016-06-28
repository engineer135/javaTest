package multiThread.sync;

public class User2 extends Thread {
	private Calculator calculator;

	public void setCalculator(Calculator calculator) {
		this.setName("Calculator2"); //스레드 이름 지정
		this.calculator = calculator;
	}
	
	public void run(){
		calculator.setMemory(50); //공유 객체의 메모리에 50 저장
	}
}
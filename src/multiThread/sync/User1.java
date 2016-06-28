package multiThread.sync;

public class User1 extends Thread {
	private Calculator calculator;

	public void setCalculator(Calculator calculator) {
		this.setName("Calculator1"); //스레드 이름 지정
		this.calculator = calculator;
	}
	
	public void run(){
		calculator.setMemory(100); //공유 객체의 메모리에 100 저장
	}
}

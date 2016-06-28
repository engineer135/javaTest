package multiThread.join;

public class JoinExample {

	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		sumThread.start();
		
		try {
			sumThread.join(); // sumThread 가 종료할 때까지 메인 스레드를 일시 정지시킴
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		
		System.out.println("1~100 까지의 합 : " + sumThread.getSum());
		
	}

}

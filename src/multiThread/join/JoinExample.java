package multiThread.join;

public class JoinExample {

	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		sumThread.start();
		
		try {
			sumThread.join(); // sumThread �� ������ ������ ���� �����带 �Ͻ� ������Ŵ
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		
		System.out.println("1~100 ������ �� : " + sumThread.getSum());
		
	}

}

package multiThread;

public class PriorityExample {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++){
			Thread thread = new CalcThread("thread" + i); //스레드 이름 지정
			if(i != 10){
				thread.setPriority(Thread.MIN_PRIORITY); //우선 순위 설정
			}else{
				thread.setPriority(Thread.MAX_PRIORITY); //우선 순위 설정
			}
			thread.start();
		}
	}

}

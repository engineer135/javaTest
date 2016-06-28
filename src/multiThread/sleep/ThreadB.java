package multiThread.sleep;

public class ThreadB extends Thread {
	public boolean stop = false; //종료 플래그
	public boolean work = true; //작업 진행 여부 플래그
	
	public void run(){
		while(!stop){
			if(work){
				System.out.println("threadB 작업중");
			}else{
				Thread.yield(); // work가 false가 되면 다른 스레드에게 실행을 양보한다.
			}
		}
		System.out.println("threadB 종료!");
	}
}

package multiThread.interrupt;

public class PrintThread extends Thread {
	public void run(){
		try {
			while(true){
				System.out.println("실행중..");
				//Thread.sleep(1); //스레드가 일시정지 상태가 되어야만 interrupt 메소드가 실행됐을때 InterruptedException이 발생한다.
				
				// interrupt() 호출 여부를 알 수 있는 방법이 있다
				if(Thread.interrupted()){
					break;
				}
			}	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}

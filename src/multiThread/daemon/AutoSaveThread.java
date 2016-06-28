package multiThread.daemon;

public class AutoSaveThread extends Thread {
	public void save(){
		System.out.println("작업 내용 저장~");
	}
	
	public void run(){
		while(true){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				break;
			}
			this.save();//1초에 한번씩 저장하는 스레드... 스레드는 이렇게 쓰는 거구나...
		}
	}
}

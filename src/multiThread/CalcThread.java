package multiThread;

public class CalcThread extends Thread {
	public CalcThread(String name){
		this.setName(name); //스레드 이름 변경
	}
	
	public void run(){
		for(int i=0; i<200000000; i++){
			
		}
		
		System.out.println(this.getName() + " 작업 끝!");
	}
}

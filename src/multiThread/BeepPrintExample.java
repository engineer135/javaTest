package multiThread;

import java.awt.Toolkit;

public class BeepPrintExample {

	public static void main(String[] args) {
		/*Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i=0; i<5; i++){
			toolkit.beep(); // 비프음 발생
			
			try {
				Thread.sleep(500); // 0.5초간 일시 정지
			} catch (Exception e) {
				e.printStackTrace();
			}
		}*/
		
		// 1단계. Runnable 인터페이스를 구현한 클래스로 따로 빼준 뒤 호출.
		/*Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask); // 새로운 스레드 생성
		thread.start();*/
		
		// 2단계. 보통은 익명 객체를 이용한다고 한다.
		/*Thread thread = new Thread(new Runnable(){
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				
				for(int i=0; i<5; i++){
					toolkit.beep(); // 비프음 발생
					
					try {
						Thread.sleep(500); // 0.5초간 일시 정지
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}); // 새로운 스레드 생성
		thread.start();*/
		
		// 3단계. 람다식 적용해보자.
		/*Thread thread = new Thread( () -> {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			
			for(int i=0; i<5; i++){
				toolkit.beep(); // 비프음 발생
				
				try {
					Thread.sleep(500); // 0.5초간 일시 정지
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		thread.start();*/
		
		// Runnable 구현이 아닌 Thread 상속으로 구현하는 법(이건 잘 안 쓸거 같은데...?)
		/*Thread thread = new BeepThread();
		thread.start();*/
		
		// 마찬가지로 익명 객체로 쓸 수도 있음
		Thread thread = new Thread(){
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				
				for(int i=0; i<5; i++){
					toolkit.beep(); // 비프음 발생
					
					try {
						Thread.sleep(500); // 0.5초간 일시 정지
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		};
		thread.start();
		
		// 프린트는 메인 스레드에서 실행.
		for(int i=0; i<5; i++){
			System.out.println("띵");
			
			try {
				Thread.sleep(500); // 0.5초간 일시 정지
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}

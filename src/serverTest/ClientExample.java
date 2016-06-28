package serverTest;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExample {

	public static void main(String[] args) {
		Socket socket = null;
		
		try {
			// ��Ĺ ����
			socket = new Socket();
			
			//new Socket("localhost", 5001);//���1
			//new Socket(new InetSocketAddress("localhost", 5001));//���2
			
			System.out.println("[���� ��û]");
			socket.connect(new InetSocketAddress("localhost", 5001));//�����û
			System.out.println("[���� ����]");
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		if(!socket.isClosed()){
			try{
				socket.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}

}

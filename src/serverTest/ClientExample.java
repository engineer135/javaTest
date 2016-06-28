package serverTest;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExample {

	public static void main(String[] args) {
		Socket socket = null;
		
		try {
			// 家墓 积己
			socket = new Socket();
			
			//new Socket("localhost", 5001);//规过1
			//new Socket(new InetSocketAddress("localhost", 5001));//规过2
			
			System.out.println("[楷搬 夸没]");
			socket.connect(new InetSocketAddress("localhost", 5001));//楷搬夸没
			System.out.println("[楷搬 己傍]");
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

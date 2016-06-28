package serverTest;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {

	public static void main(String[] args) {
		//클라이언트의 연결 수락 담당하는 ServerSocket
		ServerSocket serverSocket = null;
		try{
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("localhost", 5001));
			
			while(true){
				System.out.println("[연결 기다림]");
				Socket socket = serverSocket.accept(); //클라이언트 연결 수락
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress(); //연결된 클라이언트의 정보
				System.out.println("[연결 수락함] "+isa.getHostName());
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		if(!serverSocket.isClosed()){
			try{
				serverSocket.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}

}

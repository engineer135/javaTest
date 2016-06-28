package serverTest;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {

	public static void main(String[] args) {
		//Ŭ���̾�Ʈ�� ���� ���� ����ϴ� ServerSocket
		ServerSocket serverSocket = null;
		try{
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("localhost", 5001));
			
			while(true){
				System.out.println("[���� ��ٸ�]");
				Socket socket = serverSocket.accept(); //Ŭ���̾�Ʈ ���� ����
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress(); //����� Ŭ���̾�Ʈ�� ����
				System.out.println("[���� ������] "+isa.getHostName());
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

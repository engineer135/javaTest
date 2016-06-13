package test;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileFoundTest {

	public static void main(String[] args) {
		int maxretry = 5;
		while(maxretry-- > 0){
			System.out.println("maxretry===="+maxretry);
			try{
				BufferedReader br = new BufferedReader(new FileReader("d:/numbers2.txt"));
				String line = null;
				while((line = br.readLine()) != null){
					System.out.println(line);
				}
				maxretry = 0;
			}catch(Exception e){
				e.printStackTrace();
				try {
					Thread.sleep(3000);//3초 후 다시 파일 찾기
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
		}
		
		System.out.println("End");
	}

}

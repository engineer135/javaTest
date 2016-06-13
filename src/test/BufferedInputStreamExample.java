package test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author Engineer135
 * 
 * ���� ���/�̻��� �ð� ��
 *
 */
public class BufferedInputStreamExample {

	public static void main(String[] args) throws Exception {
		long start = 0;
		long end = 0;
		
		FileInputStream fis1 = new FileInputStream("C:/Users/Administrator/workspace/test/src/test/Koala.jpg");
		start = System.currentTimeMillis();
		while(fis1.read() != -1){
			
		}
		end = System.currentTimeMillis();
		System.out.println("���� �̻��� "+ (end-start) + "ms");
		fis1.close();
		
		FileInputStream fis2 = new FileInputStream("C:/Users/Administrator/workspace/test/src/test/Koala.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis2);
		start = System.currentTimeMillis();
		while(bis.read() != -1){
			
		}
		end = System.currentTimeMillis();
		System.out.println("���� ���� "+ (end-start) + "ms");
		fis1.close();
	}

}

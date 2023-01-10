package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO03 {
	public static void main(String[] args) {
		
		//파일을 생성하기 위해서는 FileOutputStream
		//객체 생성과 동시에 파일 이름을 적어줍니다.
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("c:\\temp\\output.txt");
			
			for (int i = 0; i < 10; i++) {
				String data = i + "번째 줄 입니다. \r\n";
				fos.write(data.getBytes());
			}
		/*
		 * FileOutStream으로 쓰려면 Byte 배열로 써야 합니다. getBytes() 
		 * (윈도우일 경우) 줄바꿈으로 \r\n을 추가했습니다.
		 * 유닉스는 \n만 있어도 됩니다.
		 * FileWrite를 사용하면 문자열(String)을 그대로 쓸 수 있습니다.
		 * 
		 */	
		
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}

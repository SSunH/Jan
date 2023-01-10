package io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class IO04 {
	public static void main(String[] args) {
		
		File file = new File("c:\\temp\\fileWriter.txt");
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(file);
			fw.write("이거 입력 되나요?");
			fw.write("저장 되나요?");
			fw.flush(); //저장하기 : 출력 버퍼에 있는 값을 다 저장   
			fw.close(); // 닫기
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

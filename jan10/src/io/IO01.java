package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// 자바 입출력
// 외부와 연결
/* 어떤 통로로 연결?
 * 어떻게 주고 받아요?
 * null값?
 * stream
 * 
 * 
 * 
 */
public class IO01 {
	public static void main(String[] args) {
		FileReader fr = null; //문자 기반 입력 스트림 최상위 클래스인 Reader
		BufferedReader br = null; // 위 Reader을 상속받아서 만들어진 리더들
      
		try {
			fr = new FileReader("c:\\temp\\temp.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} // 기초적인 reader
		br = new BufferedReader(fr);
		
		String line = null;
		//line : 문자열을 읽어서 출력하기 위해서 만듬
		try {
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 가장 나중에 오픈한 객체를 먼저 닫아줍니다.
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
	
	
	}
		

}

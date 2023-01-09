package com.poseidon.jini;

import java.util.Scanner;

public class JiniMaker {
// jar를 연동해보겠습니다.	
	public static void main(String[] args) {
		JINI jini = new JINI();
		Scanner sc = new Scanner(System.in);
		System.out.println("명령을 입력하세요. " + "안녕, 날짜, 이름, 시간, 나가기");
		System.out.println("명령 : ");
		
		while(jini.isQute) {
			String user = sc.next();
			jini.scheck(user);
			
		}
		sc.close();		
		

	}

}

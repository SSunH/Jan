package net.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

//서버

public class Server {
	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		try {
		    System.out.println("서버 실행 중");
			serverSocket = new ServerSocket(6000);
			Socket socket = serverSocket.accept();
			System.out.println("접속 성공");
			
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			while(true) {
				System.out.println(br.readLine());
			}

		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			if(serverSocket  !=null) { //객체가 없으면 닫지마 있을때만 닫아
				try {
					serverSocket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}
		
		
	}

}

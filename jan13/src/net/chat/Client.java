package net.chat;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		
		Scanner sc = null;
		Socket socket = null;
		
		try {
			socket = new Socket("172.30.1.9",6000);
			sc = new Scanner(System.in);
			//print
			OutputStream os = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);
			
			String txt = "";
			while (true) {
				System.out.print("내용 : ");
				txt = sc.nextLine();
				bw.write(txt + "\n");
				bw.flush(); //전송시키다
			}
			
		
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(socket != null) {
				try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(sc != null) {
				sc.close();
			}
		}
	}

}

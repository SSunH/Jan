package net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Net02 {
	public static void main(String[] args) {
		URL url = null;
		BufferedReader br = null;
		String addr = "http://www.nexon.com";
		
		try {
			url = new URL(addr);
			InputStream ins = url.openStream();
			br = new BufferedReader(new InputStreamReader(ins));
			
			String line = "";
			while((line = br.readLine()) !=null) {
				System.out.println(line);
				
				
			}

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

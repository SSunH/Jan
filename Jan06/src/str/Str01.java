package str;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Str01 {
	public static void main(String[] args) {
		
		String str = "100";
		String str2 = new String("100");
		
		char ch = 'A';
		str = str + ch + 150; //연결
		
		System.out.println(str); //100A150 문자임
		
		int num = 100 + 150 ; //계산
		
		str2 = "A" +127; 
		//문자 + 숫자 = 문자 				 		
		//문자 + 문자 = 문자
		//숫자 + 문자 = 문자
		//숫자 + 숫자 = 숫자 
		
		System.out.println(str2); //
		

		str2 = "2" + 1 + 2 + 3 + "A";
		System.out.println(str2); //2123A
		
		str2 = "2" + (1 + 2 + 3) + "A";
		System.out.println(str2); //26A
		
		str2 ="안녕하세요";
		
		char[] hi = str2.toCharArray();
		System.out.println(Arrays.toString(hi));
		// [안 , 녕, 하 , 세, 요]
		System.out.println(str2.charAt(0));
		System.out.println(str2.indexOf("하")); // 몇번째 위치에 있는지 없으면 -1 
		
		
		List<String> hiList = Arrays.asList(str2);
		System.out.println(hiList);
		
		String str3 = new String(hi, 1, 2);
		System.out.println(str3);
		
		str3 = "fffffffffffffffffffffffffffffffefkakmfawlefmkflkafeamflkaefmk";
		System.out.println("f가 몇 개 ? ");
		int count =0;
		for (int i = 0; i < str3.length(); i++) {
			if(str3.charAt(i) == 'f') {
				count += 1;
			}
			
		}
		System.out.println("총 "+count+"개");
		
		str3 = "Hi5";
		System.out.println(Character.isAlphabetic('A')); //이거 알파벳임?
		System.out.println(Character.isDigit('A')); // 이거 숫자임?
		System.out.println(Character.isUpperCase('A')); // 대문자야?
		System.out.println(Character.isLowerCase('A')); // 소문자야?
		
		System.out.println(Character.isAlphabetic(str3.charAt(0)));
		System.out.println(Character.isAlphabetic(str3.charAt(1)));
		System.out.println(Character.isAlphabetic(str3.charAt(2)));
	
	    System.out.println(str3.contains("cat")); //contains () str3에 이단어가 있니? 
	    System.out.println(str3.contains("Hi"));
	    
	     str3 = str3.concat("입니다."); // concat = 이어 붙이기
	    System.out.println(str3); //Hi5입니다.
	    
	    System.out.println(str3.endsWith("니다."));  // enswith = 마지막에 어떻게 끝나는지?
	    
	    String email = "alfjel@naver.com";
	    System.out.println(email.endsWith(".com")); 	
	    
	    String str1 = new String("Hi");
	    str2 = new String ("Hi");
	    System.out.println(str1 ==str2); 
	    //불변성 , immoratl
	    System.out.println(str1.equals(str2)); //객체가 같은지 비교  == 하면 큰일납니다.  
	    
	    str1 ="안녕하세요"; //str 을 계속 변경하면 쓰고 지우고를 반복하여 속도가 느려집니다.
	    
	    StringBuffer sb = new StringBuffer();
	    sb.append("날씨가 참 조으네욤");
	    sb.append(" 푸하항");
	    
	    System.out.println(sb);
	    System.out.println(sb.toString());
	    System.out.println(email.indexOf("@"));
	    
	    String str4 = email.substring(0,7);
	    System.out.println(str4);
	    
	    String server = email.substring(7,email.length());
	    System.out.println(server);
	//여러분들 email을 넣어주세요
	    String email1= "tjsgh1104@naver.com";
	    String id = email1.substring(0,9);
	    String server2 = email1.substring(10,email1.length());
	    System.out.println(id);
	    System.out.println(server2);
	    
	    
	
	
	}

}

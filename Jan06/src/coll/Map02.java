package coll;

import java.util.*; // *로 잡아놓으면 에러안남. 
/*
 * 
 * List : 중복 허용하고, 순서가 있음
 * Set : 중복 허용 안하고, 순서도 없음.
 * Map : Key-value로 저장하고, key는 순서/중복이 없음.   
 * 
 * 
 * 
 * */



public class Map02 {
	public static void main(String[] args) {
		// id pw : poseidon , 01234567
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("poseidon", "01234567"); //저장 
		map.put("test", "test");
		map.put("test01", "test01");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디와 비밀번호를 입력해주세요.");
			System.out.print(" 아이디 : ");
			String id = sc.nextLine();
			
			System.out.print("비밀번호 : ");
			String pw = sc.nextLine();
			
			if(map.containsKey(id)) {
				if(map.get(id).equals(pw)) { //동일한지 확인 
					System.out.println("로그인 완료 !");
					break;
					
				}
				else {
					System.out.println("비밀번호가 일치하지 않습니다.");
			       	
				}
				
			} else {
				System.out.println("입력 하신 아이디가 존재하지 않습니다.");
			}
							
		}  //while
     		sc.close();
	
	}

}

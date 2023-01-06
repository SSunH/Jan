package coll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// List + Map
public class List02 {
	public static void main(String[] args) {
		//외부
	List<Map<String, Object>> board = new ArrayList<Map<String, Object>>(); //게시판 만들때 많이씀
		//실제 데이터를 저장해보겠습니다. 
	//내부
	Map<String, Object> ele = new HashMap<String, Object>();
	//data 저장.
	// Object는 상위클래스이므로 , 다들어갈수있어요
	ele.put("No", 5);
	ele.put("title", "제목입니다.");
	ele.put("writer", "posei");
	ele.put("date", "2023-01-05");
	
	board.add(ele); // 리스트에 붙이기.
	
	ele = new HashMap<>(); //같은 이름의 새로운 객체
	ele.put("No", 6);
	ele.put("title", "집에가고 싶어요");
	ele.put("writer", "마법사");
	ele.put("date", "2023-01-06");
	
	board.add(ele); // 리스트에 붙이기.
	
	ele = new HashMap<>(); //같은 이름의 새로운 객체
	ele.put("No", 7);
	ele.put("title", "금요일이 최고야");
	ele.put("writer", "금사빠");
	ele.put("date", "2023-01-07");
	
	board.add(ele); // 리스트에 붙이기.
	
	ele = new HashMap<>(); //같은 이름의 새로운 객체
	ele.put("No", 8);
	ele.put("title", "두렵다 벌써 ");
	ele.put("writer", "월식식");
	ele.put("date", "2023-01-08");
	
	board.add(ele); // 리스트에 붙이기.
	
	ele = new HashMap<>(); //같은 이름의 새로운 객체
	ele.put("No", 9);
	ele.put("title", "평일 술 금지 XX");
	ele.put("writer", "죽을뻔");
	ele.put("date", "2023-01-09");
	
	board.add(ele); // 리스트에 붙이기.
	//System.out.println(board);
	System.out.println("번호 \t  제목 \t \t 글쓴이  \t 날짜 ");
	System.out.println("----------------------------------------------------------");
	for (int i = 0; i < board.size(); i++) {
		System.out.print(board.get(i).get("No") + "\t");
		System.out.print(board.get(i).get("title")+ "\t");
		System.out.print(board.get(i).get("writer")+ "\t" + "\t");
		System.out.print(board.get(i).get("date")+ "\n");
		//                | map        |
		
	}
	 
	}

}
/*
 * [{date=2023-01-05, No=5, writer=poseidon, title=제목입니다.}, 
 * {date=2023-01-06, No=6, writer=마법사, title=집에가고 싶어요}, 
 * {date=2023-01-07, No=7, writer=금사빠, title=금요일이 최고야}, 
 * {date=2023-01-08, No=8, writer=월식, title=두렵다 벌써 월요일}, 
 * {date=2023-01-09, No=9, writer=죽을뻔, title=평일 술 금지 XX}]

 * 
 *  자바는 콜 바이 레퍼런스?
 *  자바는 콜 바이 벨류?
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */






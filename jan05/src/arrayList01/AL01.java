package arrayList01;
//랩퍼 클래스 생각하고 하실 컬렉션

import java.util.ArrayList;
import java.util.Collections;

// ArrayList<> , 배열값: .add() 배열순서뽑기: .get()

public class AL01 {
	public static void main(String[] args) {
	   // < > 제네릭 java 1.5 때 추가 됨. 내부 타입 요소 지정	
	   ArrayList<Integer> list = new ArrayList<Integer>();
	   // 값 추가 . add();
	   
	   list.add(150);
	   list.add(110);
	   list.add(100);
	   list.add(99);
	   list.add(85);
	   list.add(75);
	   
	
	   
	   //값 출력
	   System.out.println(list);
	   //.get(index); 몇번째꺼 출력.
	   System.out.println(list.get(0));
	   System.out.println(list.get(1));
	   System.out.println(list.get(2));
	   System.out.println(list.get(3));
	   System.out.println(list.get(4));
	   System.out.println(list.get(5));
	   
	   for (int i = 0; i < list.size(); i++) {
		   System.out.println(list.get(i));
		
	}
	   for(Integer integer : list) { //for each 문
		   System.out.println(integer);
	   }
	   
	   
	   
	   //size()
	   System.out.println(list.size()); // length 같은것 size()
	
	//list의 마지막 데이터 출력
	   System.out.println(list.get(list.size()-1));
	   
	 //1~20까지 짝수만 순서대로 저장해주세요. for문, if문
	   ArrayList<Integer> list2 = new ArrayList<Integer>();
	 
	   for (int i = 1; i < 21; i++) {
		  if(i % 2 ==0) {
			  list2.add(i);
		  			  
		  }
		
	}
	   System.out.println(list2);
	   
	   int a= list2.remove(0); //.remove() 값을 내보내줌.
	   System.out.println(list2);
	   System.out.println(a);
	   list.clear(); // clear() : 초기화
	   System.out.println(list.size());
	   
//	   for (int i = list.size() - 2 ; i >=0 ; i-=2) {
//		   list.remove(i);
//		
//	}
//	   System.out.println(list);
	   
	 
   for (int i = 1; i < 21; i++) {
		   list.add(i);
		}
	   for(int j= 20; j > 0; j--) {
		   if(j % 2==1) {
			   list.remove(j);
			   
		   }	      
		       
		}
	   System.out.println(list);
	   for (int i = 1; i < 21; i++) {
		   if(i % 2 ==0) {
			   list.add(i-1,i);
		   }
		
	}
	   System.out.println(list);
	   
	  //list.add(a,b)
	   System.out.println(list.get(a));
	   System.out.println(list.size());
	   System.out.println(list.get(0));
	   System.out.println(list);
	   //값이 있어?
	   list.contains(20);
	   System.out.println(list.contains(100));
	   //비어 있어?
	   list.isEmpty();
	   
	   list.subList(0,10);
	   
	   Collections.shuffle(list); //리스트 섞기. 
	   System.out.println(list);
	   
	   Collections.sort(list); //리스트 정렬
	   System.out.println(list);
	   
	   Collections.sort(list,Collections.reverseOrder()); //역순 정렬 
	   System.out.println(list);
	   	
	   list.indexOf(5); //값의 위치를 알려줌.
	   
	   // 찾는 값이 없다면 -1이나옴. 있다면 index 
	   System.out.println(list.indexOf(5));
	   
	   
	   
	}
	
}

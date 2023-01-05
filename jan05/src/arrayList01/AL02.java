package arrayList01;

import java.util.ArrayList;
import java.util.List;


public class AL02 {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		//list.add(11.1);
		//list.add("홍길동"); <>을 선언하여 나타낼수없음. 
		int num = list.get(0);
		
		//리스트를 새로 만들어주세요.
		//랜덤 (1~45)에서 숫자가 나오면 
		//크기 순서대로 저장하는 메소드를 만들어주세요.
		//랜덤은 6번만 실행해주세요.
		//같은숫자나오면 저장하지마세요.
		//정렬하기 넣지말기.
		
		
		//[3,5]
		List<Integer> lotto = new ArrayList<Integer>();
		while(lotto.size() < 6) {
			int ra = (int)(Math.random() * 45 ) +1 ;
			if(lotto.indexOf(ra) == -1) { //중복되지 않는다면 
				//저장하기 = 여기가 어려워요
				lotto.add(ra); // 순서대로 저장시켜 주세요.
			}
		  }
		for (int i = 0; i <=5 ; i++) {
			for (int j = i+1; j <=5 ; j++) {
				if(lotto.get(i)>lotto.get(j)) {
			//  if(lotto.get(i)<lotto.get(j)) = 내림차순 		
					int c =lotto.remove(j);
					lotto.add(i,c);
					
				}
								
				
			}
		}
				
		
				 
		
		System.out.println(lotto);
				
		
	}

}





package arrayList01;

import java.util.ArrayList;

public class pra {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		
	    
		
		
		for (int i = 1; i <=20 ; i++) {
			if(i % 2 ==0) {
				list.add(i);	
			}
			else if(i % 2 ==1) {
				list.add(i-1,i);
			}
					
		}
		
		
		System.out.println(list);
	}
	


}

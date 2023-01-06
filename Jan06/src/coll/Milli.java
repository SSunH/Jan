package coll;

public class Milli {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);
				
		for (int i = 0; i < 3000; i++) {
			System.out.println(i);
		}
		System.out.println("!"); //출력문 하나에 시간이 늘어남. 
	
		long endTime = System.currentTimeMillis();
		//System.out.println(endTime - startTime);
		
	}

}


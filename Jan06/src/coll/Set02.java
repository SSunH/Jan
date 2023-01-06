package coll;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Set02 {
	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>(); //R타입
		
		set.add("홍길동");
		set.add("김길동");
		set.add("니길동");
		set.add("디길동");
		set.add("마길동");
		set.add("박길동");
		set.add("김길동");
		set.add("상길동");
		
		System.out.println(set.size());
		System.out.println(set);  //무작위로 나옴

	    //List?
		List<String> list = new ArrayList<String>(set); //collect type들 들어와 () < 
		System.out.println(list);
		
		Collections.sort(list);
		
		for (String str : list) {
			System.out.println(list);
			
		}
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}

}

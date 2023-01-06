package coll;
//Set interface
//순서가 없어요. 중복도 없어요

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Set01 {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<Integer>();
		set.add(5);
		set.add(6);
		set.add(7);
		set.add(8);
		set.add(10);
		set.add(5);
		set.add(7);
		set.add(2);
		set.add(10);
		
		System.out.println(set);
		System.out.println(set.size());
		System.out.println(set.isEmpty());
		System.out.println(set.remove(10)); //index가 없으므로 10 삭제.
		System.out.println(set.toArray());
		for (Integer integer : set) {
			System.out.println(integer);
		}
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			Integer integer = (Integer) it.next();
			System.out.println(integer);
			
		}
		
		
//		System.out.println(set);	
//		Iterator<Integer> ab = set.iterator();
//		while (ab.hasNext()) {
//			Integer integer = (Integer) ab.next();
//			System.out.println(integer);
//		}
		
		
		
		
		//로또 만들어주세요
		//단 1game 
		set.clear();

		for (int i = 0; i <6; i++) {
			set.add((int)(Math.random()*45)+1);
		
		}
	
	
	
	
	}

}

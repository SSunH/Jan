package coll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

//Map <K, V> : Key 중복 X , Value 중복 가능 (R타입)
public class Map01 {
	public static void main(String[] args) {
		 
		// E , T , K , V ,...
		 
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//저장 put ( K, V )
		map.put("장영원", 12);
		map.put("안유진", 30);
		map.put("이유진", 20);
		map.put("우유진", 10);
		map.put("으유진", 50);
		map.put("장영원", 100);
		
		System.out.println(map);
		
		Map<String,String> map2 = new HashMap<String, String>();
		map2.put("가렌", "나미");
		map2.put("애쉬", "블리츠");
		map2.put("베인", "룰루");
		map2.put("이즈", "레오나");
		map2.put("바루스", "룰루");
		map2.put("우두루", "아무무");
		
		//출력 get(k)
		System.out.println(map2);
		System.out.println(map.get("으유진"));
		System.out.println(map.get("으유진진자")); //없는건 null
		
		//있는지 물어보기
		System.out.println(map.containsKey("장영원"));
		System.out.println(map.containsKey("장영원원원")); //없는건 false
		
		System.out.println(map.containsValue("22222")); //없어 false
		
		//지우기 remove(k)
		System.out.println(map.remove("장영원"));
		System.out.println(map);
		System.out.println(map.size());
		
		// 1. map -> set -> list
		// 2. map -> set === iterator
		
		Set<String> map2set = map.keySet();  // map 에서 set으로
		System.out.println(map2set);
		//[안유진, 으유진, 우유진, 이유진]
		
		List<String> set2list = new ArrayList<String>(map2set); // set에서 list으로 
		System.out.println(set2list);
		
		for (int i = 0; i < set2list.size(); i++) {
			System.out.print("k : " + set2list.get(i) );
			Integer value = map.get(set2list.get(i));			
		   System.out.println(" v : " +value);
		}
		
		Set<String> map3set = map2.keySet();
		System.out.println(map3set);
		
		List<String> set3list = new ArrayList<String>(map3set);
		System.out.println(set3list);
		
		for (int i = 0; i < set3list.size(); i++) {
			System.out.print("K : " + set3list.get(i));
			String value = map2.get(set3list.get(i));
			System.out.println("   v : " +value);
			
		}
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next(); //하나 뽑아서 찍기
			System.out.println("K : " + key);
			System.out.println(",V : " + map.get(key));
		}
			
		
		
	}

}

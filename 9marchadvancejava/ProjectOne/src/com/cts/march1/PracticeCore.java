package com.cts.march1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class PracticeCore {

	public static void main(String[] args) {
//		Set set = new TreeSet();
//		set.add("one");
//		set.add("two");
//		set.add("three");
//		set.add("third");
//		set.add("four");
//		System.out.println(set);
		Map<Integer,String> map=new HashMap<>();
		map.put(234567,"rahaul@12");
		map.put(934567,"kartik@12");
		map.put(834567,"murali@12");
		map.put(734567,"shyam@12");
		System.out.println(map);
		Set set=map.entrySet();
		Iterator iterator=set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		}
}
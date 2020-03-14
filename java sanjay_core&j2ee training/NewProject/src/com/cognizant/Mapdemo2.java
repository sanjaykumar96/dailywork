package com.cognizant;
	import java.util.*;
	import java.util.HashMap;
	import java.util.Map;
	import java.util.Map.Entry;
	public class Mapdemo2 {
	public static void main(String[]  args)
	{
		LinkedHashMap<String,Integer> map= new LinkedHashMap<>();
		map.put("banana",35);
		map.put("orange",100);
		map.put("mango",200);
		map.put("grapes",290);
		map.put("bwater malon",25);
		System.out.println(map);
		map.put("banana",39);
		System.out.println(map);
		map.remove("mango");
		System.out.println(map);
		System.out.println(map.containsValue(100));
		System.out.println(map.containsKey("mango"));
		for(Entry<String,Integer> entry:map.entrySet())
		{
			System.out.println(entry.getKey()+"---->"+entry.getValue());
		}
		
		
		
	}
	}



package com.java.eight;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class HashMapExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Before java 8
		HashMap<Integer, String> map = new HashMap<Integer,String>();
		map.put(1,"surya");map.put(2, "lakshmi");map.put(3, "sangeethika");
		Set<Entry<Integer,String>> entry =  map.entrySet();
		for(Entry<Integer,String> e:entry) {
			//System.out.println(e.getKey()+e.getValue());
		}
		for(Map.Entry<Integer,String> e1 : map.entrySet()) {
			//System.out.println(e1.getKey()+e1.getValue());
		}
		//In Java 8
		map.entrySet().stream().filter(m->m.getValue().equals("sangeethika")).forEach(System.out::println);
		//Map->stream->filter->String
		String val = map.entrySet().stream().filter(m->m.getValue().equals("surya")).map(m->m.getValue()).collect(Collectors.joining());
		System.out.println(val);
		//print values
		map.entrySet().stream().map(m->m.getValue()).forEach(System.out::println);
		//get keys
		Set<Integer> vals = map.entrySet().stream().map(m->m.getKey()).collect(Collectors.toSet());
		vals.forEach(System.out::println);
		//Map-stream-filter-map
		Map<Integer, String> map1 = map.entrySet().stream().filter(m->m.getValue().equals("lakshmi")).collect(Collectors.toMap(m->m.getKey(),m->m.getValue(),(o,n)->o));
		
		//Sorting
		Map<String, Integer> unsortMap = new HashMap<>();
        unsortMap.put("z",1);
        unsortMap.put("b",5);
        unsortMap.put("a",6);
        unsortMap.put("c",2);
        unsortMap.put("d",1);
        unsortMap.put("e",7);
        unsortMap.put("y",8);
        unsortMap.put("n",9);
        unsortMap.put("g",5);
        unsortMap.put("m",2);
        unsortMap.put("f",9);
        
        Map<String,Integer> sortMap = unsortMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(o,n)->o,LinkedHashMap::new));
        //sortMap.entrySet().forEach(System.out::println);
        sortMap.forEach((k,v)->System.out.println(k+":"+v));
		System.out.println("Sorting based on value");
        Map<String,Integer> sortMap1 = unsortMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(o,n)->0,LinkedHashMap::new));
		//unsortMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
        sortMap1.forEach((k,v)->System.out.println(k+":"+v));
	}

}

package com.cg.iter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

 public class Lab7_Ex_6 {

	public static void main(String[] args) {

		Map<Integer, Integer> hMap= new HashMap<Integer, Integer>();
		hMap.put(2263, 28);
		hMap.put(1263, 16);
		hMap.put(3263, 60);
		hMap.put(4263, 5);
		System.out.println("Eligible List : "+VotersList(hMap));
	}

	private static List<Integer> VotersList(Map<Integer, Integer> hMap) {
		int ages;
		List<Integer> eligible=new ArrayList<Integer>();
		Set set = hMap.entrySet(); // Get a set of the entries
		Iterator i = set.iterator(); // Get an iterator
		while(i.hasNext()) { // Display elements
		Map.Entry me = (Map.Entry)i.next();
		//System.out.println(me.getKey() + ": "+ me.getValue());
		ages = (int) me.getValue();
		if(ages>18) {
			eligible.add((Integer) me.getKey());
			
		}
		}
		return eligible;
	}

}

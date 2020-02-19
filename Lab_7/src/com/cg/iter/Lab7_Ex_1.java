package com.cg.iter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class Lab7_Ex_1 {

	public static void main(String[] args) {
		
        HashMap<String, Integer> hMap = new HashMap<String, Integer>();
        
        
        hMap.put("Three", 3);
        hMap.put("Two", 2);
        hMap.put("Four", 4);
        hMap.put("One", 1);
        hMap.put("Five", 5);
        
        hMap.put("Six", 6);
        List<Integer> list=getValues(hMap);
        //print the sorted values List
        System.out.println("Values in Sorted");
        for(Integer value : list)
            System.out.println(value);
    }
	public static List<Integer> getValues(HashMap<String, Integer> hMap) {
		List<Integer> list = new ArrayList<Integer>( hMap.values() );
	       
        Collections.sort(list);
		return list;
		
	}
    
}
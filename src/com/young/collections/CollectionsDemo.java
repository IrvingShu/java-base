package com.young.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
	public static void main(String[] args) {
		List<Double>list = new ArrayList<Double>();
		double array[] = {112, 111, 23, 456, 231};
		for(int i=0; i<array.length; i++)
		{
			list.add(new Double(array[i]));
		}
		Collections.sort(list);
        for (int i = 0; i < array.length; i++) {
            System.out.println(list.get(i));
        }
	}	
}

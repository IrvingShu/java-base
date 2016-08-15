package com.young.concurrent;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
	public static void main(String[] args) {
		ConcurrentHashMap< String, String> aConcurrentHashMap = new ConcurrentHashMap<>();
		aConcurrentHashMap.put("a", "b");
		System.out.println(aConcurrentHashMap.get("a"));
	}
}

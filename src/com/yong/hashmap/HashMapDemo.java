package com.yong.hashmap;

import java.util.HashMap;
import java.util.Map;

class User {
	String id;

	User(String id) {
		this.id = id;
	}

	public String toString() {
		return "key="+id;
	}
}

public class HashMapDemo {
	public static void main(String[] args) {
		Map<User, String> map = new HashMap<>();
		map.put(new User("1"), "1");
		map.put(new User("2"), "1");
		map.put(new User("3"), "1");
		System.out.println(map.keySet());
		System.out.println(map.get(new User("1")));
	}
}

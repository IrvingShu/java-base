package com.young.string;

import java.util.ArrayList;
import java.util.List;

class Student
{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class EqualDemo {
	public static void main(String[] args) {
		Student student = new Student();
		student.setName("Young");		
		List<Student> aList = new ArrayList<>();	
		aList.add(student);
		student.setName("Irving");
		System.out.println(aList.get(0).getName());
	}
}

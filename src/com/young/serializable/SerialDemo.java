package com.young.serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOError;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -9194581935373641745L;
	private int age;
	private String name;
	private String sex;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", sex=" + sex + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
}

public class SerialDemo {
	public static void main(String[] args) throws Exception{
		SerializePerson();
		Person p = DeSerializePerson();//反序列Perons对象
		System.out.println(p.toString());
	}
	
	/**
	 * 序列化过程
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	private static void SerializePerson() throws FileNotFoundException, IOException{
		Person person = new Person();
		person.setName("Young");
		person.setAge(25);
		person.setSex("男");
		ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(new File("./Person.txt")));
		oo.writeObject(person);
		System.out.println("Person对象序列化成功！");
		oo.close();
	}
	
	private static Person DeSerializePerson() throws FileNotFoundException, IOException, ClassNotFoundException{
		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File("./Person.txt")));
		Person person = (Person)objectInputStream.readObject();
		System.out.println("Person对象反序列化成功！");
		objectInputStream.close();
		return person;
		
	}	
}

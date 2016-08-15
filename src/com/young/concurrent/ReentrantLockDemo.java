package com.young.concurrent;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {
	ReentrantLock lock = new ReentrantLock();
	public void write(){
		lock.lock();
		try{
			System.out.println("正在写");
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			lock.unlock();
			System.out.println("写正在释放锁");
		}
	}
	
	public void read(){
		lock.lock();
		try{
			System.out.println("正在读");
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			lock.unlock();
			System.out.println("读正在释放锁");
		}		
	}
	
	public static void main(String[] args) {
		ReentrantLockDemo reentrantLockDemo = new ReentrantLockDemo();
		new Thread(){
			public void run(){
				reentrantLockDemo.write();
			}
		}.start();
		
		new Thread(){
			public void run(){
				reentrantLockDemo.read();
			}
		}.start();
	}
	
}

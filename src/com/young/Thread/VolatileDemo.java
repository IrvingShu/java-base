
package com.young.Thread;

public class VolatileDemo extends Thread{

	public   static  int  n  =   0 ; 
	
	public static synchronized void inc(){
		n = n + 1;
	}
	
	public   void  run()  
    {  
         for  ( int  i  =   0 ; i  <   10 ; i ++ )  
             try   
        {  
            	 inc(); 
                sleep( 3 );  //  Ϊ��ʹ���н����������ӳ�3����   
  
            }  
             catch  (Exception e)  
            {  
            }  
    }  
  
     public   static   void  main(String[] args)  throws  Exception  
    {  
  
        Thread threads[]  =   new  Thread[ 100 ];  
         for  ( int  i  =   0 ; i  <  threads.length; i ++ )  
             //  ����100���߳�   
            threads[i]  =   new  VolatileDemo();  
         for  ( int  i  =   0 ; i  <  threads.length; i ++ )  
             //  ���иղŽ�����100���߳�   
            threads[i].start();  
         for  ( int  i  =   0 ; i  <  threads.length; i ++ )  
             //  100���̶߳�ִ��������   
            threads[i].join();  
        System.out.println( " n= "   +  VolatileDemo.n);  
    }  	
}

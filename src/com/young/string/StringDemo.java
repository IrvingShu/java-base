package com.young.string;

public class StringDemo {
	public static void main(String[] args) {
        
		String str1="";
		long start = System.currentTimeMillis();
        
        for(int i = 0; i < 50000; i++)
        {
            str1 += "";
        }
        
        long end = System.currentTimeMillis();
        System.out.println("the run time is "+(end -start)+" ms");
        /*
		StringBuilder sb = new StringBuilder("string builder");
        
        long start = System.currentTimeMillis();
        
        for(int i = 0; i < 50000; i++)
        {
            //str1+= " ";
            sb.append(" ");
        }
        
        long end = System.currentTimeMillis();
        System.out.println("the run time is "+(end -start)+" ms");
        */
	}
}

package com.young.genericity;

import java.util.Scanner;

public class Test {
	public static void main(String[] args){ 
	    String str = null;
	    Scanner in = new Scanner(System.in);
	    System.out.println("请输入，按Enter键换行，按Ctrl+Z结束。");
	    while(in.hasNext()){  //这里怎么能够判断输入的是一空行----全部由空格字符组成
	        str = in.nextLine();
	        System.out.println(str);
	        str = null;
	    }
	    in.close();
	}
}

package com.young.genericity;

import java.util.Scanner;

public class Test {
	public static void main(String[] args){ 
	    String str = null;
	    Scanner in = new Scanner(System.in);
	    System.out.println("�����룬��Enter�����У���Ctrl+Z������");
	    while(in.hasNext()){  //������ô�ܹ��ж��������һ����----ȫ���ɿո��ַ����
	        str = in.nextLine();
	        System.out.println(str);
	        str = null;
	    }
	    in.close();
	}
}

package com.young.genericity;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GenericityDemo{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Map<String, String> map = new HashMap<>();
		int count = 0;
		int row = 0;
		while(in.hasNext()){
			String str = in.nextLine();
			row ++;			
			String[] arrayString = str.split(" ");
			for(String tempString : arrayString)
			{
				boolean isUse = true;
				for(int i=0; i<tempString.length(); i++)
				{
					if(tempString.charAt(i) == ' '|| (tempString.charAt(i) >= 'a' && tempString.charAt(i) <='z') || (tempString.charAt(i) >= 'A' && tempString.charAt(i) <='Z'))
					{
						continue;
					}else{
						isUse =false;
						break;
					}
				}
				if(isUse){
					if(map.get(tempString) != null && map.get(tempString).equals("1")){
						continue;
					}else{
						map.put(tempString, "1");	
						count++;
					}					
				}
			}
			if(row == 5 ){break;}
			if(str.length() == 50){break;}
		}
		System.out.println(count);
		in.close();
	}
}

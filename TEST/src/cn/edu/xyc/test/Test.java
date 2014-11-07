package cn.edu.xyc.test;

import java.util.ArrayList;
import java.util.List;


public class Test {

	public static void main(String[] args) {
		List<String> list  = new ArrayList<String>();
		list.add("java01");
		list.add("java02");
		list.add("java03");
		System.out.println(list);
		for (String string : list) {
			System.out.println(string);
		}
	}
	
}


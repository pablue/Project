package cn.interteach.www.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class PropertiesConfig {
	public static void main(String[] args) {
		InputStream inStream = PropertiesConfig.class.getClassLoader().getResourceAsStream("");
		
		//创建一个Properties
		Properties pro = new Properties();
		//装载一个流对象
		try {
			pro.load(inStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//得到Properties的属性
		pro.getProperty("");
	}

}

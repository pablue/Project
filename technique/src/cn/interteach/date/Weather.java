package cn.interteach.date;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

//通过中国天气api调用

public class Weather {

	public static void main(String[] args) throws IOException {
		String path = "http://api.k780.com:88/?app=weather.today&weaid=1&appkey=10003&sign=b59bc3ef6191eb9f747dd4e83c99f2a4&format=json";
		URL url = new URL(path);
		URLConnection connection = url.openConnection();
		BufferedReader in = new BufferedReader(new InputStreamReader(
				connection.getInputStream()));
		String line;
		while ((line = in.readLine()) != null) {
			System.out.println(line);
		}
	}
}

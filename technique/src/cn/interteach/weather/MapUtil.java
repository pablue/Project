package cn.interteach.weather;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * 描述:解析XML,把数据存入Map之中
 * 
 * @author cp
 * @date 2013-12-19
 * */
public class MapUtil {
	/**
	 * 描述:遍历XML
	 * 
	 * @param filename
	 *            XML文件位置
	 * @param map
	 *            存储数据的HashMap数组
	 */
	private static void iterateWholeXML(String filename,
			HashMap<String, String> map) {
		SAXReader saxReader = new SAXReader();
		try {
			Document document = saxReader.read(new File(filename));
			Element root = document.getRootElement();
			for (Iterator<?> iterProvince = root.elementIterator(); iterProvince
					.hasNext();) {
				Element province = (Element) iterProvince.next();
				for (Iterator<?> iterCity = province.elementIterator(); iterCity
						.hasNext();) {
					Element city = (Element) iterCity.next();
					for (Iterator<?> iterCountry = city.elementIterator(); iterCountry
							.hasNext();) {
						Element country = (Element) iterCountry.next();
						String name = country.attributeValue("name");
						String code = country.attributeValue("weatherCode");
						map.put(name, code);
					}
				}
			}
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 描述:名称转换
	 * 
	 * @param placeName
	 *            城市名
	 * @return 城市code
	 * */
	public static String getPlaceIdByName(String placeName) {
		String placeId = "";
		if (placeName.matches("[0-9]*")) {// 如果传入的本来就是placeId,这个判断可以不要
			return placeName;
		}
		try {
			HashMap<String, String> map = new HashMap<String, String>();
			iterateWholeXML("WeatherCode.xml", map);
			placeId = map.get(placeName);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return placeId;
	}
}
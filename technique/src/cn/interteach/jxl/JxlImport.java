package cn.interteach.jxl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class JxlImport {

	public static void main(String[] args) throws BiffException, IOException {
		String path = "E:\\test.xls";
		File file = new File(path);
		// 从一个地址得到一个工作表
		Workbook workbook = Workbook.getWorkbook(file);
		// 从一个工作表里得到第一个工作簿
		Sheet sheet = workbook.getSheet(0);
		//
		// for (int i = 0; i < sheet.getRow(0).length; i++) {
		// System.out.println(sheet.getRow(0));
		//
		// }

		// 得到表中所有的数据
		System.out.println(sheet.getRows());
		for (int i = 0; i < sheet.getRows(); i++) {
			Cell[] row = sheet.getRow(i);
			List<Person> list = new ArrayList<>();
				Person p = new Person(row[0].getContents(),
						row[1].getContents(), row[2].getContents(),
						row[3].getContents(), row[4].getContents());
//				p.setDate(row[0].getContents());
//				p.setEmail(row[1].getContents());
//				p.setName(row[2].getContents());
//				p.setPassword(row[3].getContents());
//				p.setSex(row[4].getContents());
				list.add(p);
				System.out.println(list);
			
		}

		// //得到第一行的数据
		// Cell[] row = sheet.getRow(0);
		// for (int i = 0; i < row.length; i++) {
		//
		// }
		//

		// 释放资源
		workbook.close();
	}
}

class Person {

	private String name;
	private String sex;
	private String password;
	private String email;
	private String date;

	public Person() {
		super();
	}

	public Person(String name, String sex, String password, String email,
			String date) {
		super();
		this.name = name;
		this.sex = sex;
		this.password = password;
		this.email = email;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}

package cn.interteach.jxl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.format.CellFormat;
import jxl.format.Font;
import jxl.read.biff.BiffException;

public class JxlImport {

	public static void main(String[] args) throws BiffException, IOException {
		String path = "C:\\text.xls";
		File file = new File(path);
		// 从一个地址得到一个工作表
		Workbook workbook = Workbook.getWorkbook(file);
		// 从一个工作表里得到第一个工作簿
		Sheet sheet = workbook.getSheet(0);
//		System.out.println(sheet.getRows());
		List<Person> list = new ArrayList<>();
		
		Cell[] row = sheet.getRow(0);
		System.out.println(row[0].getContents());
		System.out.println(row[1].getContents());
		System.out.println(row[2].getContents());
		System.out.println(row[3].getContents());
		System.out.println(row[4].getContents());
		
//		for (int i = 0; i < sheet.getRows(); i++) {
//			Cell[] row = sheet.getRow(i);
//			
//			for (int j = 0; j < sheet.getColumns(); j++) {
//				Cell cell = sheet.getCell(j, i);
//				
//				//String ok = sheet.getCell(j, i).getContents();
//				
//				if(j%7==0){
//					System.out.println();
//				}
//				System.out.print("\t"+ ok);
//			}
//			
				/*Person p = new Person(row[0].getContents(),
						row[1].getContents(), row[2].getContents(),
						row[3].getContents(), row[4].getContents());
				list.add(p);*/
//		}
		//System.out.println(list);

		// 得到第一行的数据
		// Cell[] row = sheet.getRow(0);
		// for (int i = 0; i < row.length; i++) {
		//
		// }
		//

		
		
//		CellFormat cellFormat = sheet.getCell(1, 1).getCellFormat();
//		Font font = cellFormat.getFont();
//		System.out.println(font.getColour().getValue());
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

package cn.edu.xyc;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;


public class A {
	
	//>> 1. 将一列数据放到map集合中
	//>>
	/**
	 * 1.将数据存放在pagecontext中
	 * 然后在页面中迭代出来，
	 * 导入jxl.jar包，
	 * 创建一个Excel 工作薄
	 * jxl.writeableWorkbook wb = 
	 * @throws WriteException 
	 * @throws RowsExceededException 
	 * 
	 *	
	 */
	public static void excel(List<HashMap<String, String>> list,String path) throws RowsExceededException, WriteException{
		String[] title = {"编号","用户名","密码"};
		
		try {
			File file = new File(path);
			WritableWorkbook wb =Workbook.createWorkbook(file);
			WritableSheet sheet = wb.createSheet("好的", 0);
			Label label = null;
			
			//			创建 表头
			
			for (int i = 0; i < title.length; i++) {
				label = new Label(i, 0, title[i]);
				sheet.addCell(label);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}

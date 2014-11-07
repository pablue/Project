package cn.edu.xyc;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class B {
	
	public static void main(String[] args) throws IOException, RowsExceededException, WriteException {
		 String fileName = "C:\\test6.xls";
		 String[] stri = {"诸葛亮","孔明","55","100","92","93","死后木偶退兵，锦囊杀魏延!!!"};
		 List list = new ArrayList<String>();		 
		 for (int i = 0; i < stri.length; i++) {
			String string = stri[i];
			list.add(string);
		}
		createexcel(fileName,list );
		System.out.println("成功导出数据到Excel文件(" + fileName + ")了!!!");
		
	}
	
	@SuppressWarnings("unused")
	private static void createexcel(String path,List list ) throws IOException, RowsExceededException, WriteException {
		WritableWorkbook wb ;
		File file = new File(path);
		wb = Workbook.createWorkbook(file);
		WritableSheet wwb = wb.createSheet("我的第一个工作表", 10);
		
		Label le =null;
//		String[] title = {"编号","用户名","密码"};
//		
////		创建 表头
//		
//		for (int i = 0; i < title.length; i++) {
//			wwb = new Label(i, 0, title[i]);
//			wwb.addCell(le);
//		}
		
		
		le = new Label(1,1, "haha");
		wwb.addCell(le);
		
		for (int j = 0; j < list.size(); j++) {
				list.get(j);
			wwb.addCell(new Label(0, j, (String) list.get(j)));
		}
		wb.write();
		wb.close();
	}

}
